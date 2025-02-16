package SeleniumDay1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="Bhanu";
		System.setProperty("wbdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Locators2 password=new Locators2();
		String password1=password.getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password1);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
       Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
       driver.findElement(By.xpath("//button[text()='Log Out']")).click();       
       driver.close();
	}
	public String getpassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Bhanu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		String passwordarray[]=passwordtext.split("'");
		String passwordarray1[]=passwordarray[1].split("'");
		String password=passwordarray1[0];
		return password;
	}
}
