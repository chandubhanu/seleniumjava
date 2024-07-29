package Mislenious;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.network.Network;
import org.openqa.selenium.devtools.v126.network.model.Request;
import org.openqa.selenium.devtools.v126.network.model.Response;

public class networkActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		DevTools devtools =driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		//Request event will get fired
		devtools.addListener(Network.requestWillBeSent(), request->
		{
			Request req=request.getRequest();
			System.out.println(req.getUrl());
		});
		//Response event will get fired
		devtools.addListener(Network.responseReceived(), response->
		{
			Response res=response.getResponse();
			//System.out.println(res.getUrl());
			
			if(res.getStatus().toString().startsWith("4"))
			{
				System.out.println("Response code which is failing is"+" "+res.getStatus());
			}
			
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='/library']")).click();
		
	}

}
