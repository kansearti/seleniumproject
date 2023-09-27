                             //Login scripts flipkart steps with explaination//

package loginScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//1:Open the browser
		WebDriver driver=new ChromeDriver();
		//2:maximize the screen
		driver.manage().window().maximize();
		//3:enter the URL
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//4:enter the valid username
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9763715170");//xpath by traversing
		//5:enter the password(otp)
		driver.findElement(By.xpath("//button[contains(text(),'Request')]")).click();//xpath by contains
		
		//6:get the title
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		
		//7:get the currenturl
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//8:verification
	    if(acttitle.contains("Online Shopping Site for Mobiles")) {
		    System.out.println("Testcase is pass");
		}
		else
		{
			System.out.println("testcase is fail");
		}
				
		//9:close
		//driver.close();

	}

}
