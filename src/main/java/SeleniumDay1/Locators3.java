package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
WebDriver driver=new ChromeDriver();

//Sibling-parent traverse
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//child - parent traverse
System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());	
}

}
