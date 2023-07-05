package Runnerscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexecution 
{
     public WebDriver driver;
     @Test
     @Parameters ({"browser"})
     public void exec(String browser)
     {
    	 System.setProperty("Webdriver.chrome.driver","./Drivers/chromedriver.exe");
    	 System.setProperty("Webdriver.gecko.driver","./Drivers/geckodriver.exe");
    	 if (browser.equals("firefox"))
    	 {
    		 driver=new FirefoxDriver();
    		 driver.get("https://www.google.com");
    		 
    	 }
    	 else
    	 {
    		 driver=new ChromeDriver();
    		 driver.get("https://www.google.com");
    	 }
    		 
     }
     
}
