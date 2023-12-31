                            //Actions - 2.doubleclick & mousehover//
package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.linkText("COURSE"));
		
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.partialLinkText("Selenium ")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		a.doubleClick(ele1).perform();
		
		driver.close();

	}

}
