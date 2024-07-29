package SeleniumDay8;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPriceStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();

		List<String> Price;
		do {
			List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
			Price = elementlist.stream().filter(s -> s.getText().contains("Rice")).map(s -> getpriceVeggie(s))
					.collect(Collectors.toList());
			if (Price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
			Price.forEach(a -> System.out.println(a));
		}

		while (Price.size() < 1);
	}

	private static String getpriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String Pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Pricevalue;
	}

}
