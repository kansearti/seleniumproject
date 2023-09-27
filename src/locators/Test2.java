package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://demoapp.skillrary.com/");
      
      driver.findElement(By.linkText("LOGIN")).click();
      driver.findElement(By.name("email")).sendKeys("aaru");
      driver.findElement(By.id("password")).sendKeys("23456");
      driver.findElement(By.name("login")).click();
      
	}

}
