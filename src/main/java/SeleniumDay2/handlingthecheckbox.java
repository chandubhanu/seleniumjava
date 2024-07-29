package SeleniumDay2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class handlingthecheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected();
driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
}

}
