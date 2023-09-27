                           //Dropdown is Singleselect or multiselect using isMultiple()//
package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("cars"));
		Select s=new Select(dd);
		s.selectByIndex(4);
		s.selectByValue("299");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		
		System.out.println(s.isMultiple());
		
		Thread.sleep(3000);
		if(s.isMultiple()) {
			s.deselectAll();
		}
		else
		{
			System.out.println("it is not multiple select dropdown");
		}

	}

}
