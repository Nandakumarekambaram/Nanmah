package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.selenium.WebDriverServiceImpl;

public class MyHome extends WebDriverServiceImpl{

	public MyHome() {
		 PageFactory.initElements(driver, this);
}
	
	@FindBy (linkText = "Leads")
	WebElement eleLeads;
	
	
	
	public MyLead ClickLeads()
	{
			click (eleLeads);
		return new MyLead();
	}
	
}

