package TestNGThreePack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClassTwo extends TestNGOnePack.BaseClassOne{
  
 @Test
  public void testmethodone() {
  //driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	 driver.navigate().to("file:///home/ermao750125/eclipse_Aravind/aravindall/BrowserWebPages/only-testing-blog_blogspot_com_2014_01_textbox.html");
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