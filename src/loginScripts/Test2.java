package loginScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.udemy.com/join/login-popup/");
		
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("hahoiduudh");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(acttitle.contains("Log In and Start Learning | Udemy"))
		{
			System.out.println("testcase is pass");
		}
		else
		{
			System.out.println("testcase is fail");
		}
		
		driver.close();

	}

}
