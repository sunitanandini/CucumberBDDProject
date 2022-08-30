package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
     WebDriver driver;
     
     public LoginPage(WebDriver _driver)
     {
    	 driver = _driver;
    	 PageFactory.initElements(_driver, this);
    	 
     }
     
     @FindBy(id = "Email") WebElement email;
     @FindBy(id = "Password") WebElement pass;
     @FindBy(xpath = "//button[@class='button-1 login-button']") WebElement loginBtn;
     @FindBy(linkText = "Logout") WebElement logoutLink;
     
     public void enterEmail(String emailAddress)
     {
    	 email.clear();
    	 email.sendKeys(emailAddress);
     }
     
     public void enterPassword(String password)
     {
    	 pass.clear();
    	pass.sendKeys(password); 
     }
     
     public void loginButton()
     {
    	 loginBtn.click();
     }
     
     public void logout()
     {
    	 logoutLink.click();
     }
     
     
}
