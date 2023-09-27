package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("cars"));
		Select s=new Select(dd);
		s.selectByIndex(4);
		s.selectByValue("299");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		
		List<WebElement> opt = s.getAllSelectedOptions();
		System.out.println(opt.size());
		
		for(WebElement b:opt) {
			System.out.println(b.getText());
		}
		driver.close();

	}

}
