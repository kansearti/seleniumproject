package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

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
		
		s.deselectByIndex(3);//this deselect method is not supported in the single select dropdown//

	}

}
