package SeleniumDay6;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeOptions options=new ChromeOptions();
//Proxy proxy=new Proxy();
//proxy.setHttpProxy("ipaddress:portnumber");
//Map<String, Object> prefs = new HashMap<String, Object>();
//
//prefs.put("download.default_directory", "/directory/path");
//
//options.setExperimentalOption("prefs", prefs);
options.setAcceptInsecureCerts(true);
//options.addExtensions(null);

WebDriver driver= new ChromeDriver(options);
driver.get("https://expired.badssl.com/");
	}

}
