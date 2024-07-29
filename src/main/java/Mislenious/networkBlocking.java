package Mislenious;

import java.util.Arrays;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.network.Network;

import com.google.common.collect.ImmutableList;

public class networkBlocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
DevTools devtools=driver.getDevTools();
	devtools.createSession();
	
	devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
	//devtools.send(Network.setBlockedURLs(ImmutableList.of("*jpg","*css")));
	Long Starttime=System.currentTimeMillis();
	driver.get("https://rahulshettyacademy.com/angularAppdemo/");
	driver.findElement(By.linkText("Browse Products")).click();
	driver.findElement(By.linkText("Selenium")).click();
	driver.findElement(By.cssSelector(".add-to-cart.btn.btn-default")).click();
	String message=driver.findElement(By.cssSelector("[class='sp']")).getText();
	System.out.println(message);
	Long EndTime=System.currentTimeMillis();
	System.out.println(EndTime-Starttime);
	//without css and jpg:558
	//with css and jpg:876
	}
	}
