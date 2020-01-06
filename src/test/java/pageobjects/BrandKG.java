package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import KurtGeiger.MainPage;

public class BrandKG extends MainPage{
	
	
	public BrandKG(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}

		private WebDriver driver;		

		public void MainPage(WebDriver driver)
			{
				this.driver=driver;
			}


	By Brand=By.xpath("//*[@id=\"tab1\"]/div[1]/ul/li[15]/a");
	By click=By.xpath("//*[@id=\"tab1\"]/div[1]/ul/li[15]/a");
	By List=By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[5]/div/div[3]");
	

	public WebElement BrandDKNY()
	{
		return driver.findElement(Brand);
	}
		
	public WebElement Submit()
	{
		return driver.findElement(click);
	}
	public WebElement DKNYList()
	{
		return driver.findElement(List);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
