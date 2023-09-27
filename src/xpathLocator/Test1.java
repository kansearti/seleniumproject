                             //xpath by contains amazon//
package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")).click();
	       driver.findElement(By.name("email")).sendKeys("9887654320");
	       driver.findElement(By.id("continue")).click();
	       driver.findElement(By.name("password")).sendKeys("12345");
	       driver.findElement(By.id("signInSubmit")).click();
	       Thread.sleep(3000);
	}

}
