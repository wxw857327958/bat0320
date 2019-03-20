package testbaidu;

import javax.jws.soap.SOAPBinding;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testBaidu {
	WebDriver driver;
	  String url1="https://www.baidu.com/";
	  @BeforeClass
	  public void openchrome() {
		  System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		   driver=new ChromeDriver();
	  }
	  @Test
	  
		   public void tuo(){
				  driver.get(url1);
		  
		
	  }
}
