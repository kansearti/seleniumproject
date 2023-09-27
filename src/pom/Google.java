package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
    //Declaration
	@FindBy(name="q")
	private WebElement searchtb;
	
	//Initialization
	public Google(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void search(String name) {
		searchtb.sendKeys(name);
	}
	
}
