                             //Verification - 3.isSelected//
package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        WebElement radiob = driver.findElement(By.xpath("//label[text()='Female']"));
        
        if (radiob.isSelected()) {
        	System.out.println("Pass: button is selected");
        }
        else
        {
        	System.out.println("Fail: button is not selected");
        }
        driver.close();

	}

}
