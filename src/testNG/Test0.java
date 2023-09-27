package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	
	@Test
	public void demo() {
		Reporter.log("Hi all", true);//it will print output in console and report
		Reporter.log("Hi selenium", false);//it will print output in report only
	}

}
