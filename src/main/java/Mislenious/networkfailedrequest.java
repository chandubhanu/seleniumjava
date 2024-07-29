package Mislenious;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.fetch.Fetch;
import org.openqa.selenium.devtools.v126.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v126.network.model.ErrorReason;
import org.openqa.selenium.devtools.v126.network.model.Request;

public class networkfailedrequest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
DevTools devtools=driver.getDevTools();
devtools.createSession();
//java.util.Optional<java.lang.String> urlPattern
Optional<List<RequestPattern>> patterns=Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"), Optional.empty(),Optional.empty())));
devtools.send(Fetch.enable(patterns, Optional.empty()));
devtools.addListener(Fetch.requestPaused(), request->
{
	devtools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
	
	});
driver.get("https://rahulshettyacademy.com/angularAppdemo/");
driver.findElement(By.cssSelector("button[routerlink*='/library']")).click();

	}

}
