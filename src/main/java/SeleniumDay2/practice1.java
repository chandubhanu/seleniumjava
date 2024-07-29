package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//label[@for='bmw'] /input[@type='checkbox'][1]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//label[@for='bmw'] /input[@type='checkbox'][1]")).isSelected());
		driver.findElement(By.xpath("//label[@for='bmw'] /input[@type='checkbox'][1]")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//label[@for='bmw'] /input[@type='checkbox'][1]")).isSelected());
		Assert.assertEquals(3, driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
