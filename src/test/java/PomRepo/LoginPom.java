package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {   //Pom with page factory...Pom=page object model(it is a design pattern in selenium that creates an object repository for storing all web element)
                 //How=class  XPATH is in form of variables, using=variable, statememt handover to 'how'                                    //pom helps for reduce code duplication & improves test case maintenance
	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement txt_email;
    @FindBy(how=How.XPATH,using="//input[@name='pass']")private WebElement txt_password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement click;
	
	public WebElement getTxt_email() {  //here we have firstly do right click & click on option source & from that select getter setter method and after that delete all setter methods
		return txt_email;
	}
	
	public WebElement getTxt_password() {
		return txt_password;
	}
	
	public WebElement getClick() {
		return click;
	}
	
	
}
