package AravindAll.aravindall;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataDriven {
 
 WebDriver driver = null;
 
 @BeforeTest
    public void setup() throws Exception { 
         System.setProperty("webdriver.gecko.driver", "BrowserWebPages//geckodriver");
         driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html"); 
         driver.get("file:///home/ermao750125/eclipse_Aravind/aravindall/BrowserWebPages/only-testing-blog_blogspot_com_2014_05_login.html");
    } 
 
  @AfterTest
 public void tearDown() throws Exception { 
   driver.quit();
     } 
 
 //This method will return two dimensional array.
 //This method behaves as data provider for LogIn_Test method.
 @DataProvider
 public Object[][] LoginCredentials(){
  //Created two dimensional array with 4 rows and 2 columns.
  //4 rows represents test has to run 4 times.
  //2 columns represents 2 data parameters.
  Object[][] Cred = new Object[5][2];
  
  Cred[0][0] = "UserId1";
  Cred[0][1] = "Pass1";
  
  Cred[1][0] = "UserId2";
  Cred[1][1] = "Pass2";
  
  Cred[2][0] = "UserId3";
  Cred[2][1] = "Pass3";
  
  Cred[3][0] = "UserId4";
  Cred[3][1] = "Pass4";
  
  Cred[4][0] = "UserId5";
  Cred[4][1] = "Pass5";
  return Cred; //Returned Cred
 }
 
 //Give data provider method name as data provider.
 //Passed 2 string parameters as LoginCredentials() returns 2 parameters In object.
 @Test(dataProvider="LoginCredentials")
 public void LogIn_Test(String Usedid, String Pass){
   driver.findElement(By.xpath("//input[@name='userid']")).clear();
   driver.findElement(By.xpath("//input[@name='pswrd']")).clear();
   driver.findElement(By.xpath("//input[@name='userid']")).sendKeys(Usedid);
   driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys(Pass);
   driver.findElement(By.xpath("//input[@value='Login']")).click();
   String alrt = driver.switchTo().alert().getText();
   driver.switchTo().alert().accept();
   System.out.println(alrt);
  }
}
