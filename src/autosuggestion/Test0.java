package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement searchtb = driver.findElement(By.id("APjFqb"));
        searchtb.sendKeys("seleni");
        
        Thread.sleep(3000);
        List<WebElement> ele = driver.findElements(By.xpath("//span[text()='seleni']"));
        //to get the count
        System.out.println(ele.size());
        
        //print the text
        for(WebElement b:ele) {             //advanced for each loop because the 10 elements should iterate
        	System.out.println(b.getText());	
        }
        
        driver.close();

	}

}
