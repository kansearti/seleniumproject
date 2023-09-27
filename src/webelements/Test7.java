package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
        Point loc = ele.getLocation();                  //getLocation is method coming from point class
        System.out.println("x coordinate"+loc.getX());  //getX()and getY() are the methods coming from point class
        System.out.println("y coordinate"+loc.getY());
        
        driver.close();

	}

}
