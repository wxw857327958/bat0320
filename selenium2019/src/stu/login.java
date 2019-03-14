package stu;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class login {
	WebDriver driver;
	String url1="http://localhost:8080/examsys/login.thtml";
	@BeforeClass
	public void openchrome() throws MalformedURLException{
		//¹È¸èä¯ÀÀÆ÷
		//System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		//driver=new ChromeDriver();
		DesiredCapabilities c=DesiredCapabilities.chrome();
		driver=new RemoteWebDriver(new URL(" http://192.168.140.1:5555/wd/hub"),c);
 }
	@Test //µÇÂ¼
	public void Aloge() throws InterruptedException {
		driver.get(url1);
		driver.findElement(By.name("username")).sendKeys("hujianming");
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		Select a =new Select(driver.findElement(By.name("usertype")));
		a.selectByIndex(2);     //¶¨Î»ÏÂÀ­¿ò
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[5]/td/div/button[1]")).click();
	}
}
