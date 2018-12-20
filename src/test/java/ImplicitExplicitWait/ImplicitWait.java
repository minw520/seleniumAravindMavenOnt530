package ImplicitExplicitWait;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImplicitWait { 
 
 WebDriver driver = null;
 
 @BeforeClass
 public void beforetest() {

  // set geckodriver path.
 System.setProperty("webdriver.gecko.driver", "BrowserWebPages//geckodriver");
 //To open Firefox browser
 driver = new FirefoxDriver();

 //To Maximize Browser Window
  driver.manage().window().maximize();

 //To Open URL In browser
  //driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  driver.get("file:///home/ermao750125/eclipse_Aravind/aravindall/BrowserWebPages/only-testing-blog_blogspot_com_2013_11_new-test.html");
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () 
  {  
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name");
   driver.findElement(By.xpath("//input[@name='namexyz']"));
  }
 
 }