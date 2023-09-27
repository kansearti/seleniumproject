package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		s.selectByIndex(3);
		
		s.selectByValue("search-alias=alexa-skills");
		
		s.selectByVisibleText("Garden & Outdoors");
		
		System.out.println(s.isMultiple());
		
		if(s.isMultiple()) {
			s.deselectAll();
		}
		else
		{
			System.out.println("it is not multiselect dropdown");
		}

	}

}
