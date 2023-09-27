                           //xpath by contains instagram//
package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.instagram.com/");
      Thread.sleep(3000);
      driver.findElement(By.name("username")).sendKeys("aaru_2022");
      Thread.sleep(3000);
      driver.findElement(By.name("password")).sendKeys("123455");
      
      driver.findElement(By.xpath("//div[contains(@class,'x9f619')][11]")).click();
	}

}
////xpathby contains - input[contains(@type,'password')]
//xpath by attribute - input[@type='password']