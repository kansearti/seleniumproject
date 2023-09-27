                            //Verification - 2.isDisplayed//
package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skillrary.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement search = driver.findElement(By.name("q"));
        
        if (search.isDisplayed()) {
        	System.out.println("Pass: element is dislayed");
        }
        else
        {
        	System.out.println("Fail: element is not displayed");
        }
	}

}
