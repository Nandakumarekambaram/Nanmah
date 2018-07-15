package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;


public class LoginPage extends WebDriverServiceImpl {
	
 public LoginPage(EventFiringWebDriver driver, ExtentTest test) {
	 this.driver =driver;
	 this.test = test;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy (className =" decorativeSubmit")
 WebElement eleLogin;


 @FindBy (id ="username")
 WebElement eleusername;
 public LoginPage typeUserName(String username)
 {
 type(eleusername, "DemoSalesManager");
 return this;
 }
 
 @FindBy (id ="password")
 WebElement elePassword;
 public LoginPage typePassword(String password) {		
	type(elePassword, "crmsfa");
	return this;
 }
 public HomePage clickLogin () {		
		click (eleLogin);
		return new HomePage();
}
}