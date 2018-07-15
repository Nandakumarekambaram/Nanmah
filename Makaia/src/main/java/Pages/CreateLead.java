package Pages;

import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends PreAndPost{
	@Test(dataProvider="TST")
	
	public void createLead(String cName,String fName,String lName){		
		new MyHome().ClickLeads().ClickCreateLeads();
		
		
	}

}
