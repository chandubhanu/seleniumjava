package Mislenious;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class basicAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
DevTools devtools=driver.getDevTools();
Predicate<URI> uriPredicate=uri->uri.getHost().contains("httpbin.org/");
	
((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
driver.get("https://httpbin.org/basic-auth/foo/bar");
	
	}

}
