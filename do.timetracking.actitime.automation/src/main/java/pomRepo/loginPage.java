package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public loginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(id = "username")
	WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	WebElement passwordTextField;

	@FindBy(id = "//div[text()='Login ']")
	WebElement loginButton;
	

 

public WebElement getUsernameTextField() {
		return usernameTextField;
	}




	public WebElement getPasswordTextField() {
		return passwordTextField;
	}




	public WebElement getLoginButton() {
		return loginButton;
	}




public void loginAction(String username, String password) {
	usernameTextField.sendKeys(username);
	passwordTextField.sendKeys(password);
	loginButton.click();
}}

