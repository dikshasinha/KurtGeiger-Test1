package KurtGeiger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainPage {

public MainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

@Parameters({"URL"})
	@Test
	
	public void HomePageLanding()
	{
	
	}
	
	@BeforeMethod
	
	public void beforemethod()
	
	{
		System.out.println("before executing method");
	}
	public static void main(String[] urlname) {
		// TODO Auto-generated method stub
		
		//Create main page to invoke URL under test.
		
		//DesiredCapabilities ch= DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		/*ChromeOptions options= new ChromeOptions();
		options.addArguments("headless");*/
		
		//c.merge(ch);
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Don\\Desktop\\Eclipse_Selenium_Cucumber\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 	    
		driver.manage().window().maximize();
		    
		driver.manage().deleteAllCookies();		
		
		driver.get("https://www.kurtgeiger.es/");
		
		System.out.println(driver.getTitle()); // validate the Page Title
		
		System.out.println(driver.getCurrentUrl()); // validate URL is correct
		
		// Handling Cookies message of main page.
		
		driver.findElement(By.id("cookie-notice-accept")).click();
		
		driver.manage().deleteCookieNamed("cookie-notice-accept");
		
		driver.findElement(By.xpath("//*[@id=\"top-nav\"]/ul/li[7]/div[1]/a/span")).click();
	
		driver.close(); //It closes current browser 	
	

}

	
		
	}

	
		
	
		
		

	

