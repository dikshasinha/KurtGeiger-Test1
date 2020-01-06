package KurtGeiger;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class PDP_checkout {

	@Parameters({"URL"})
	
	@Test
	public void PDPCheckout()
	{
	
	}
	
	
	public static void main(String[] args)  throws InterruptedException {
	
		// TODO Auto-generated method stub
		
		/*DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);*/
		
			
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Don\\Desktop\\Eclipse_Selenium_Cucumber\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
     // to maximise the browser
		driver.manage().window().maximize();
		
		// delete cookies
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.kurtgeiger.es/");
	
			
		
		
					
		System.out.println(driver.getTitle()); // validate the Page Title
		
		System.out.println(driver.getCurrentUrl()); // validate URL is correct
			

		
		// Handling Cookies message of main page.
		
		driver.findElement(By.id("cookie-notice-accept")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top-nav\"]/ul/li[5]/div[1]/a")).click();
		
						
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[5]/div/div[3]")));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 550);");
		
		driver.findElement(By.xpath("//*[@id=\"social_proof_plp_3957900979\"]/h3/a")).click();
		
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(0, 558);");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"social_proof_plp_2022700209\"]/a/img")).click();
			
		
		//driver.findElement(By.cssSelector("#\\32 022733209")).click();
		
		//Thread.sleep(3000);
				
		driver.findElement(By.xpath("//*[@id=\"688026\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("add-to-cart--form-btn")).click();
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//*[@id=\"ss17-wrapLinksSearch\"]/ul/li[7]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"topCartContent\"]/div/div[1]/a")).click();
		
		Thread.sleep(1000);
				
		driver.findElement(By.linkText(("go to bag & checkout"))).click();
		
			
		 WebDriverWait wait1 = new WebDriverWait(driver, 5);
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	     
	     String script = "return document.getElementById(\"btn-proceed-checkout\").value;";
	     String text=(String) js.executeScript(script);
	     System.out.println(text);
		
	     js.executeScript("scroll(0, 658);");
	     
	     
		//presence in DOM
	     
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"btn-proceed-checkout\"]/span/span")));


		//clickable
		 
		
		//wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Proceed to Checkout")));
		
	        
        //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btn-proceed-checkout\"]")));

    	//WebElement elements = driver.findElement(By.xpath("//*[@id=\"btn-proceed-checkout\"]"));  
		//js.executeScript("arguments[0].scrollIntoView(true);", elements);
      	
      
        
        
        
        //driver.findElement(By.linkText("Proceed to Checkout")).click();
        
        driver.findElement(By.xpath("//*[@id=\"btn-proceed-checkout\"]")).click();
        
        System.out.println(driver.findElement(By.xpath("//*[@id=\"btn-proceed-checkout\"]")).getText());
        
       WebDriverWait wait2 = new WebDriverWait(driver, 5);    
       wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Proceed to Checkout")));
       JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	   jse2.executeScript("scroll(0, 300);");
				
		driver.findElement(By.cssSelector("#btn-proceed-checkout > span:nth-child(1) > span:nth-child(1)")).click();
		
      
	
	
		driver.quit(); // All test Browser close
	}
	}