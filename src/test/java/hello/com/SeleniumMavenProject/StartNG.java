package hello.com.SeleniumMavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class StartNG 
{
	
  @Test
  public void f() 
  {
	  
	  System.out.println("a");
  }
  
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("b");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("c");
  }
  

}
