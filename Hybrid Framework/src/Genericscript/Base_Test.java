package Genericscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_const1
{
     public WebDriver driver;
     @BeforeMethod
     public void openAppln()
     {
    	 System.setProperty(chrome_key,chrome_value);
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     }
     @AfterMethod
     public void closeAppln()
     {
    	 driver.close();
     }
}
