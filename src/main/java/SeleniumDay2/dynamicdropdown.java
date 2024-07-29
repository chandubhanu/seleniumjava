package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//driver.findElement(By.xpath("(//a[@value='IXB'])[1]")).click();
		//parent to child traversing
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1_CTXT'] //a[@value='IXB']")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		//driver.findElement(By.cssSelector("a[value='MAA']")).click();
	}

}
