package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelExecution {
	
	public WebDriver driver;
	@Parameters({"BrowserName"})
	@Test
	public void demo(String browser) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("arti");
		driver.findElement(By.id("pass")).sendKeys("23udhslhs");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String title=driver.getTitle();
		Reporter.log(title,true);
		String url=driver.getCurrentUrl();
		Reporter.log(url,true);
		
	}

}
