package SeleniumDay8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sortingjavastream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
		List<WebElement> Originallist = driver.findElements(By.xpath("//tr/td[1]"));
//for(int i=0;i<Originallist.size();i++) {
//	String a=Originallist.get(i).getText();
//	System.out.println(a);
//}

		List<String> SortedList = Originallist.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(SortedList);
		List<String> NewSortedlist = SortedList.stream().sorted().collect(Collectors.toList());
		System.out.println(NewSortedlist);
		Assert.assertTrue(
				Originallist.stream().map(s -> s.getText()).collect(Collectors.toList()).equals(NewSortedlist));

	}

}
