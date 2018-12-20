package ImplicitExplicitWait;

import java.util.concurrent.TimeUnit;
//import java.io.FileInputStream;
//import java.io.IOException;
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WaitTextPresent {
 WebDriver driver = null;
 
 @BeforeClass
 public void beforetest() {
  System.setProperty("webdriver.gecko.driver", "BrowserWebPages//geckodriver");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
  //driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
  driver.get("file:///home/ermao750125/eclipse_Aravind/aravindall/BrowserWebPages/only-testing-blog_blogspot_com_2013_11_new-test.html");
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }
 
 @AfterClass
 public void aftertest() {
  driver.quit();
  
 }
 
 @Test
 public void test () 
  {  
   driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("alpesh");
   WebDriverWait wait = new WebDriverWait(driver, 15);
   wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitButton1")));
   driver.findElement(By.cssSelector("#submitButton")).click();
   wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
  }
 }
