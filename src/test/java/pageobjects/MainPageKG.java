package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import KurtGeiger.MainPage;

public class MainPageKG extends MainPage{

	
	public MainPageKG(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;		

	public void MainPage(WebDriver driver)
		{
			this.driver=driver;
		}

		By acceptcookies=By.id("cookie-notice-accept");
		By brandcategory=By.xpath("//*[@id=\"top-nav\"]/ul/li[7]/div[1]/a/span");
		By click=By.xpath("//*[@id=\"top-nav\"]/ul/li[7]/div[1]/a/span");

		public WebElement AcceptCookies()
		{
			return driver.findElement(acceptcookies);
		}

		public WebElement Category()
		{
			return driver.findElement(brandcategory);
		}
		public WebElement Submit()
		{
			return driver.findElement(click);
		}

	


	}


