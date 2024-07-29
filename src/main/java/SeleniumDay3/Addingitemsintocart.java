package SeleniumDay3;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Addingitemsintocart {
	public static void additems(WebDriver driver,String veggies[]) {
List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		int j = 0;
//for(WebElement product:products)
//check whether the extracted name is present in the array or not
//convert array into array list
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List<String> veggieslist = Arrays.asList(veggies);

			if (veggieslist.contains(formattedname)) {
//				for (int k = 1; k < 4; k++) {
//					driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
//				}
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == veggies.length) {
					break;
				}
			}
		}
		// driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		String veggies[] = { "Brocolli", "Cucumber", "Beetroot" };
		additems(driver,veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Enter promo code']")));
		driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//		String text=driver.findElement(By.cssSelector("span.promoInfo")).getText();
//		Assert.assertEquals(text, "Code applied ..!");
	
	}

}
