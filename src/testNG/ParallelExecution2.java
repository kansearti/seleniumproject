package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution2 {
	
	public WebDriver driver;
	@Parameters({"BrowserName"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("aaruk_2022");
		driver.findElement(By.name("password")).sendKeys("233ejhsoid");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
	}

}
