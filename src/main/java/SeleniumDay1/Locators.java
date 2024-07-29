package SeleniumDay1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("wbdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
Locators2 password=new Locators2();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshettyacademy.com");
driver.findElement(By.name("inputPassword")).sendKeys("password");
driver.findElement(By.className("submit")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhanu");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("9999999999");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
Thread.sleep(5000);
driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Bhanu");
driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.xpath("//input[contains(@value,'agree')]")).click();
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
}

}
 