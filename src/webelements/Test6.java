                            //getLocation - used to get x and y co-ordinates//
package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement ele = driver.findElement(By.xpath("//div[text()='Login ']"));
        Point loc = ele.getLocation();                  //getLocation is method coming from point class
        System.out.println("x coordinate"+loc.getX());  //getX()and getY() are the methods coming from point class
        System.out.println("y coordinate"+loc.getY());
        
        driver.close();
        
	}

}
