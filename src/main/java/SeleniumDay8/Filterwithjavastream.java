package SeleniumDay8;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filterwithjavastream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String veggiename="Rice";
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys(veggiename);
		List<WebElement> veggies=driver.findElements(By.xpath("//td/tr[1]"));
		List<WebElement> filteredlist=veggies.stream().filter(s->s.getText().contains(veggiename)).collect(Collectors.toList());
Assert.assertEquals(filteredlist.size
		(),veggies.size());
	}

}
