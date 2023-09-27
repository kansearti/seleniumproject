                            //loginscript amazon//
package loginScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("9763715170");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.name("password")).sendKeys("diudhfhewu");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.contains("Amazon Sign")) {
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.close();

	}

}
