package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	public TaskPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div(text()='Add New')")
	private WebElement addNewButton;
	
	@FindBy (xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerButton;
	
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private   WebElement enterCustomerName ;
	
	@FindBy (xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTextField ;
	
	@FindBy (xpath= "//div[text()='Create Customer']")
	private WebElement createCustomerButton;
	
	
	


	public WebElement getAddNewButton() {
		return addNewButton;
	}





	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}





	public WebElement getEnterCustomerName() {
		return enterCustomerName;
	}





	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}





	public WebElement getCreateCustomerButtom() {
		return createCustomerButton;
	}





	public void createCustomerAction(String customerName, String description) {
		addNewButton.click();
		newCustomerButton.click();
		enterCustomerName.sendKeys(customerName);
		descriptionTextField.sendKeys(description);
		createCustomerButton.click();
		
	}
	
}
