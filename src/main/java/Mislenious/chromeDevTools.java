package Mislenious;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.emulation.Emulation;
import org.openqa.selenium.devtools.v85.network.Network;

public class chromeDevTools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// Create a DevTools object
		DevTools devtools = driver.getDevTools();
		// Create a session
		devtools.createSession();
		devtools.send(Emulation.setDeviceMetricsOverride(430, 932, 50, true, Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), java.util.Optional.empty()));
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		//Network.getpostrequestdata
//Network.getRequestPostData(null);
	}

}
