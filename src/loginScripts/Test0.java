                                        //loginscript nykaa //
package loginScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")).click();
		
		driver.findElement(By.name("emailMobile")).sendKeys("9763715170");
		
		driver.findElement(By.id("submitVerification")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.contains("Buy Cosmetics Products")) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
