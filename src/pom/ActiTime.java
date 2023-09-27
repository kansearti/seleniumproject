package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime {
    
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	public ActiTime(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void username(String name) {
		usernametb.sendKeys(name);
	}
	
	public void password(String pass) {
		passwordtb.sendKeys(pass);
	}
	
	public void loginbtn() {
		loginbtn.click();
	}
}
