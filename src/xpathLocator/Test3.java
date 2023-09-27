                          //xpath by group index//
package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]")).click();//xpath by group index//
		driver.findElement(By.xpath("(//a[contains(text(),'Redmi')])")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
