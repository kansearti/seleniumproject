                           //Implicitly wait//
package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("aaru_2022");
	    
	    driver.findElement(By.name("password")).sendKeys("123455");
	      
	    driver.findElement(By.xpath("//div[contains(@class,'x9f619')][11]")).click();

	}

}
