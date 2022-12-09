package pomRepo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerDetailsPage {
	
	WebDriver driver;
	
	public CustomerDetailsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String verifycustomerName(String customerName) {
	 return	driver.findElement(By.xpath("(//div[text()='"+customerName+"'])[2]")).getText();
		
	}

}
