package SeleniumDay4;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
Actions a=new Actions(driver);
WebElement Move=driver.findElement(By.xpath("//span[text()='Login']"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
a.moveToElement(driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//Moves to Specific element
a.moveToElement(Move).contextClick().build().perform();
	}

}
