package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//typecasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//access the method in ram
		File ram = ts.getScreenshotAs(OutputType.FILE);
		//specify the location where photo should be stored
		File dest=new File("./photo/myntra.png");
		//copy and paste from specific location
		FileUtils.copyFile(ram, dest);
		
		driver.close();
		
	}

}
