package Mislenious;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.fetch.Fetch;
import org.openqa.selenium.devtools.v126.network.model.Request;

public class networkMocking {

	public static void main(String[] args) throws InterruptedException {
		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Get DevTools instance and create session
		DevTools devtools = driver.getDevTools();
		devtools.createSession();

		// Enable Fetch domain for request interception
		devtools.send(Fetch.enable(Optional.empty(), Optional.empty()));

		// Add listener for paused requests
		devtools.addListener(Fetch.requestPaused(), request -> {
			Request req = request.getRequest();

			// Check if URL contains "shetty"
			if (req.getUrl().contains("shetty")) {
				String newUrl = req.getUrl().replace("=shetty", "=Badguy");
				System.out.println(newUrl);

				// Continue request with modified URL
				devtools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newUrl),
						Optional.of(req.getMethod()), req.getPostData(), Optional.empty(), Optional.empty()));
			} else {
				// Continue request without modification
				devtools.send(Fetch.continueRequest(request.getRequestId(), Optional.empty(), Optional.empty(),
						Optional.empty(), Optional.empty(), Optional.empty()));
			}
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='/library']")).click();
		String actualtext=driver.findElement(By.cssSelector("p")).getText();
		Thread.sleep(5000);
		System.out.println(actualtext);
    }
}
