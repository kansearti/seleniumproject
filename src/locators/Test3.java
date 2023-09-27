                                    //xpath locator Doubt//
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://www.amazon.in/");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
       driver.findElement(By.xpath("//a[text()='Home']")).click();
       
	}

}
