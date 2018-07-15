package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class MyLead extends WebDriverServiceImpl{

	public void MyHome() {
		 PageFactory.initElements(driver, this);
	}
	

	@FindBy (linkText = "Create Lead")
	WebElement eleCleads;
	
	public CreateLead ClickCreateLeads()
	{
		click(eleCleads);
		return new CreateLead();
	}
}
