package Mislenious;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class javascriptfailure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/angularAppdemo/");
driver.findElement(By.linkText("Browse Products")).click();
driver.findElement(By.linkText("Selenium")).click();
driver.findElement(By.cssSelector("button[class='add-to-cart btn btn-default']")).click();
driver.findElement(By.linkText("Cart")).click();
driver.findElement(By.id("exampleInputEmail1")).clear();
driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
LogEntries entries=driver.manage().logs().get(LogType.BROWSER);
	List<LogEntry>logs=entries.getAll();
	Iterator it=logs.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}
