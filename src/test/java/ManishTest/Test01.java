package ManishTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test01 {

	public static void main(String[] args) {
    System.out.println("hello");
		
    //Launch the Browser
    
  //  ChromeDriver driver = new ChromeDriver();  // both approach we can use
      WebDriver driver = new ChromeDriver();	
      
      //open url
      
      driver.get("https://demo.opencart.com/");
      driver.manage().window().maximize();
      
      // get title of webpage
      
//      WebElement Title = driver.findElement(By.xpath("//title[text()='Your Store']"));
//      System.out.println(Title.getText()); 
//      if(Title.equals(Title)) {
//    	  
//    	  System.out.println("Result Pass");
//    	  
//    	  }else {
//    		  System.out.println("Result Fail");
//    	  }

      
       
      // get title of webpage another approach
      
      String ActTitle =driver.getTitle();
      if(ActTitle.equals("Your Store")) {
    	  
    	  System.out.println("Test case Pass");
      }else {
    	  
    	  System.out.println("Test Fail");
      }
      
     driver.close();
	}
	
	

}
