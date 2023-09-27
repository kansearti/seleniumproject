package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		//OBJECT CREATION FOR PROPERTY FILE//
		Properties pdata=new Properties();//:we are telling the selenium that we are reading the data from property file//
		//FileInputStream is class:
		FileInputStream fis=new FileInputStream("./data.properties");// giving the path of property file to take the data//
		pdata.load(fis);//we have to tell the selenium take the data from fis//
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getProperty("url"));//here we are passing the key from data.properties file
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.findElement(By.id("email")).sendKeys(pdata.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(pdata.getProperty("password"));
	}

}
