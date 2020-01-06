package KurtGeiger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
@Parameters({"URL"})

public class Brand extends MainPage {
	
		public Brand(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		public void BrandListPage()
		{
		
		}
		
		@BeforeMethod
		
		public void beforemethod()
		
		{
			System.out.println("BrandListPage");
		}
		public static void main(String[] urlname) {  
		// TODO Auto-generated method stub
		
		//Create main page to invoke URL under test.
				
		//invoke .exe file from local
		
		/*DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);*/
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Don\\Desktop\\Eclipse_Selenium_Cucumber\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.kurtgeiger.es/");
		
		System.out.println(driver.getTitle()); // validate the Page Title
		
		System.out.println(driver.getCurrentUrl()); // validate URL is correct
		
		// Handling Cookies message of main page.
		
		driver.findElement(By.id("cookie-notice-accept")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top-nav\"]/ul/li[7]/div[1]/a/span")).click();
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(0, 250);");
        
		// clicking on Brand -DKNY
		
		driver.findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/ul/li[15]/a")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[5]/div/div[3]")));
				
		
		driver.close(); //It closes current browser
	}

		
	
	}

	
