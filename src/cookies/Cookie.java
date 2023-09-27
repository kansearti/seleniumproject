package cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookie {
public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	//delete all cookie
	driver.manage().deleteAllCookies();
	
	//delete particular cookie
	driver.manage().deleteCookie(null);
	
	//get all the cookies
	driver.manage().getCookies();
	
	//get particular cookie
	driver.manage().getCookieNamed(null);
	}
}
