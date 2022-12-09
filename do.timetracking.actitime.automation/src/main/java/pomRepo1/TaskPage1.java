package pomRepo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage1 {
	
	public TaskPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerButton;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	 private WebElement enterCustomerNameTextField;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	 private WebElement descriptionTextField;

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}

	public WebElement getEnterCustomerNameTextField() {
		return enterCustomerNameTextField;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}
	
	public void createCustomer() {
		addNewButton.click();
		newCustomerButton.click();
		enterCustomerNameTextField.sendKeys("Hello");
		descriptionTextField.sendKeys("Test");
		
		
		
		
	}

}
