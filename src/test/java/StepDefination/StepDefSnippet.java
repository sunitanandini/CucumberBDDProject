package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PajeObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefSnippet 
{
	public WebDriver driver;
	public LoginPage loginpage;     //creating the object of LoginPage without exteds
	
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		loginpage = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
		driver.get(url); //getting url .get(url) from feature file
	   
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAddr, String pwd) 
	{
		loginpage.enterEmail(emailAddr);
		loginpage.enterPassword(pwd);
	}

	@When("Click on login")
	public void click_on_login() 
	{
		loginpage.loginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) 
	{
     	String actualTitle = driver.getTitle();
     	System.out.println("Title is:- " + actualTitle);
     	if(actualTitle.equals(expectedTitle))
     	{
     		Assert.assertTrue(true);
     	}
     	else
     	{
     		Assert.assertTrue(false);
     	}	
     }

	@When("User click on log out link")
	public void user_click_on_log_out_link() 
	{
	   loginpage.logout(); 
	}

	
	 @Then("Page title should be {string}") 
	 public void page_title_should_be1(String expectedTitle1) 
	 { 
		 String actualTitle1 = driver.getTitle();
		 System.out.println("Title is:----> " +actualTitle1);
	    	if(actualTitle1.equals(expectedTitle1))
	     	{
	     		Assert.assertTrue(true);
	     	}
	     	else
	     	{
	     		Assert.assertTrue(false);
	     	}
	 }
	

	@Then("Close Browser")
	public void close_browser() 
	{
		driver.close();
		driver.quit();
	}

}
