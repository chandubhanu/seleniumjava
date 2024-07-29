package Mislenious;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.network.model.ConnectionType;
import org.openqa.selenium.devtools.v126.network.Network;

public class Interblocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		devtools.send(Network.emulateNetworkConditions(true, 3000, 2000, 10000, Optional.of(ConnectionType.WIFI),
				Optional.empty(), Optional.empty(), Optional.empty()));
		devtools.addListener(Network.loadingFailed(),loadingfailes->
		{
			System.out.println(loadingfailes.getTimestamp());
			System.out.println(loadingfailes.getErrorText());
		});
		Long Starttime=System.currentTimeMillis();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='/library']")).click();
		Long Endtime=System.currentTimeMillis();
		System.out.println(Endtime-Starttime);
	}

}
