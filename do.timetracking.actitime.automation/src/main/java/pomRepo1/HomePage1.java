package pomRepo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	
	public HomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "container_tasks")
	private WebDriver taskButton;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebDriver logoutButton;

	public WebDriver getTaskButton() {
		return taskButton;
	}

	public WebDriver getLogoutButton() {
		return logoutButton;
	}
	
	

}
