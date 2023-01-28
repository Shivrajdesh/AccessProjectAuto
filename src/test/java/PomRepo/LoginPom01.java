package PomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom01 {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement Username;
    @FindBy(how=How.XPATH,using="//input[@name='pass']")private WebElement Pass;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement Button;
	
	public WebElement getUsername() {
		return Username;
	}
	
	public WebElement getPass() {
		return Pass;
	}
	
	public WebElement getButton() {
		return Button;
	}
	
 
	
}
