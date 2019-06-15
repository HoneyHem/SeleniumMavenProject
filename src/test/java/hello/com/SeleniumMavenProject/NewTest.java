package hello.com.SeleniumMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest 
{
	
	WebDriver driver;
	
	
  @Test
  public void f() 
   {
	  
	  WebElement emailad = driver.findElement(By.id("email_create"));
		emailad.sendKeys("deepali@gmail.com");
		
		//create account
		
		WebElement createacct = driver.findElement(By.name("SubmitCreate"));
		createacct.click();
		
      //select Gender1
		
		WebElement Gender = driver.findElement(By.id("id_gender2"));
		Gender.click();
		
		//First_name
		WebElement Fstname = driver.findElement(By.name("customer_firstname"));
		Fstname.sendKeys("deepali");
		
		//Last_name
		WebElement Lastname = driver.findElement(By.name("customer_lastname"));
		Lastname.sendKeys("gaikwad");
		
	  
	  }
  
  
  @BeforeTest
  public void beforeTest() 
    {
	  
	  System.out.println("wel come to deepali automation");
		
		System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		
		driver =new FirefoxDriver();
		
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

  @AfterTest
  public void afterTest()
     {
	  
	  driver.quit();
	 
     }

}
