package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram {
       
	@FindBy(name="username")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement passtb;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	Instagram(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void username(String name) {
		usernametb.sendKeys(name);
	}
	
	public void password(String password) {
		passtb.sendKeys(password);
	}
	
	public void login() {
		loginbtn.click();
	}
}
