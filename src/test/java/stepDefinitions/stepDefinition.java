package stepDefinitions;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import KurtGeiger.MainPage;
import cucumber.api.junit.Cucumber;
import pageobjects.BrandKG;
import pageobjects.MainPageKG;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
		
public static final WebDriver driver = null;


@RunWith(Cucumber.class)

public class StepDefinitions extends MainPage{

	
    public StepDefinitions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	@Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable 
    {
    	
    	WebDriver driver=new ChromeDriver();
 	    
		driver.manage().window().maximize();
		    
		driver.manage().deleteAllCookies();		
		
		driver.get("https://www.kurtgeiger.es/");
		       
    }

    @When("^I select \"([^\"]*)\" category from the header$")
    public void i_select_category_from_the_header(String arg1) throws Throwable {
    	
    	MainPageKG mkg=new MainPageKG(driver);
    	mkg.AcceptCookies().findElement(By.id("cookie-notice-accept"));
    	mkg.Category().findElement(By.xpath("//*[@id=\"top-nav\"]/ul/li[7]/div[1]/a/span"));
    	mkg.Submit().findElement(By.xpath("//*[@id=\"top-nav\"]/ul/li[7]/div[1]/a/span"));
    	driver.get(arg1);	
    	System.out.println("arg1");
    }

   @Then("^I should see the list of brands$")
    public void i_should_see_the_list_of_brands() throws Throwable 
    {
	   BrandKG bkg=new BrandKG(driver);
   	   bkg.BrandDKNY().findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/ul/li[15]/a"));
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[5]/div/div[3]")));
         
	   System.out.println("list of brands");
    }

   @And("^I select \"([^\"]*)\" brand from the list$")
   public void i_select_brand_from_the_list(String arg1) throws Throwable 
    
	   {
	   BrandKG bkg=new BrandKG(driver);
   	   bkg.BrandDKNY().findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/ul/li[15]/a"));
	   bkg.Submit().findElement(By.xpath("//*[@id=\"tab1\"]/div[1]/ul/li[15]/a"));
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("scroll(0, 250);");
       driver.get(arg1);
	   
    }

   @Then("^I should see the list of products from \"([^\"]*)\"$")
   public void i_should_see_the_list_of_products_from_something(String strArg1) throws Throwable
    {
	   BrandKG bkg=new BrandKG(driver);
	   bkg.DKNYList().findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[5]/div/div[3]"));
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[5]/div/div[3]")));
    }
    	
}

// Scenario- Men Category list of products

	//@Given("^I am on the homepage$")
	//public void i_am_on_the_homepage() throws Throwable {
		//System.out.println("homepage");
		
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Don\\Desktop\\Eclipse_Selenium_Cucumber\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.get("https://www.kurtgeiger.es/");
		//System.out.println(driver.getTitle()); // validate the Page Title
		//System.out.println(driver.getCurrentUrl()); // validate URL is correct


	@And("^I select men category from the header$")
	public void i_select_men_category_from_the_header1() throws Throwable
	{
		System.out.println("Navigate to men category");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("scroll(0, 250);");
		
		driver.findElement(By.xpath("//*[@id=\"social_proof_plp_3957900979\"]/h3/a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top\"]/body/div[1]/div/div[5]/div/div[3]")));
		
			
		}
	@Then("^I should see the list of products$")
	public void i_should_see_the_list_of_products() throws Throwable 
	{
		System.out.println("list of product");
			
		}
    @When("^I hover over a main navigation item$")
    public void i_hover_over_a_main_navigation_item() throws Throwable 
    {
    	System.out.println("main item");
    	
        }
        
    @Then("^I should see an advert from \"([^\"]*)\"$")
    public void i_should_see_an_advert_from_something(String strArg1) throws Throwable
    {
        
    	System.out.println(strArg1);
    	
        }
     @And("^I select a sub navigation link from the drop down$")
     public void i_select_a_sub_navigation_link_from_the_drop_down() throws Throwable 
     {
    	 System.out.println("sub navigation item link");
        }
      @Then("^I should see another list of products$")
      public void i_should_see_another_list_of_products() throws Throwable 
      {
    	  System.out.println("list of product");
    }

// Scenario- PDP and Proceed to checkouts

        	  
      
      @And("^I am on PDP$")
      public void i_am_on_pdp1() throws Throwable 
      {
    	  System.out.println("PDP");
      }
    
      @When("^I select any \"([^\"]*)\" and \"([^\"]*)\" for the chosen men category$")
       public void i_select_any_something_and_something_for_the_chosen_men_category(String strArg1, String strArg2) throws Throwable {
    	  System.out.println(strArg1);
    	  System.out.println(strArg2);
      }
      @And("^I add the product to the bag$")
      public void i_add_the_product_to_the_bag() throws Throwable {
    	  System.out.println("add the product");
  }

        @Then("^I can see the bag with single item$")
        public void i_can_see_the_bag_with_single_item() throws Throwable {
        System.out.println("My bag");
    }

        @And("^I should be on checkout page$")
        public void i_should_be_on_checkout_page() throws Throwable {
        	 System.out.println("go to checkout");
    }
  
       
        @Then("^I click 'Proceed to Checkout'$")
        public void i_click_proceed_to_checkout() throws Throwable {
        	 System.out.println("proceed to checkout");

}
}
	

	

