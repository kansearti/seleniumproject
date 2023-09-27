package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    Thread.sleep(3000);
    driver.manage().window().fullscreen();
    
    Thread.sleep(3000);
    driver.manage().window().minimize();
	}

}
