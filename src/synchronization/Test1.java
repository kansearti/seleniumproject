                                    //Explicitly wait//
package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement user = driver.findElement(By.name("username"));
		w.until(ExpectedConditions.visibilityOf(user)).sendKeys("aaru_2022");
	    
	    driver.findElement(By.name("password")).sendKeys("123455");
	      
	    WebElement button=driver.findElement(By.xpath("//div[contains(@class,'x9f619')][11]"));
	    w.until(ExpectedConditions.visibilityOf(button)).click();
	    
	    String title=driver.getTitle();
	    w.until(ExpectedConditions.titleContains("instagram"));
	    
	    Thread.sleep(3000);
	    driver.close();

	}

}
