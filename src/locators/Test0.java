                                       //id,name locator//
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.facebook.com/");
      
      driver.findElement(By.id("email")).sendKeys("pooja");
      driver.findElement(By.name("pass")).sendKeys("1234");
      
      driver.findElement(By.name("login")).click();
	}

}
