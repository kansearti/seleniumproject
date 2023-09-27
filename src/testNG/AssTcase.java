//HARD ASSERT: if comparison fails(if any error is their it will not execute the remaining lines of current block
           //: id executes Annotation @After Method block
package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssTcase {
	
public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		String title=driver.getTitle();
		
		//syntax
		//Assert.assertEquals(actual,Excepted);
		Assert.assertEquals(title, "dhsiu38"); //Here all the methods are static so that we are able to call clasNme.methodname
        
		Reporter.log(title,true);
		Reporter.log(driver.getCurrentUrl(),true);
	}
	

	@AfterMethod
	public void close() {
		driver.close();
	}

}
