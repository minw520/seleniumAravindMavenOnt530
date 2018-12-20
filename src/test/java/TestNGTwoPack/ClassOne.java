package TestNGTwoPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClassOne extends TestNGOnePack.BaseClassOne{
  
 @Test
  public void testmethodone() {
    String title = driver.getTitle();
    System.out.print("\nCurrent page title is : "+title);
    String Workdir = System.getProperty("user.dir");
    String Classpackname = this.getClass().getName();
    System.out.print("\n'"+Workdir+" -> "+Classpackname+" -> testmethodone' has been executed successfully");
  }
 
 @Test
 public void testmethodtwo() {
     driver.findElement(By.xpath("//input[@value='female']"));
     String Workdir = System.getProperty("user.dir");
     String Classpackname = this.getClass().getName();
     System.out.print("\n'"+Workdir+" -> "+Classpackname+" -> testmethodtwo' has been executed successfully");
  }
}