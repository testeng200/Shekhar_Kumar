import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.ExcelUtility;
import genericUtility1.BaseClass1;
import pomRepo.HomePage;
import pomRepo.TaskPage;
import pomRepo1.CustomerDetailsPage;

public class CreateProductsTest1 extends BaseClass1{
	
	@Test
	public void createProductsAndVerifyProductNameTest() throws IOException {
		
		ExcelUtility eUtils=new ExcelUtility();
		String expectedCustomerName = eUtils.fetchTheDataFromExcelSheet("Sheet2", 2, 0);
		String description = eUtils.fetchTheDataFromExcelSheet("Sheet2", 2, 1);
		
		HomePage home=new HomePage(driver);
		home.clickOnTaskButton();
		
		TaskPage task = new TaskPage(driver);
		task.createCustomerAction(expectedCustomerName, description);
		
		CustomerDetailsPage customer=new CustomerDetailsPage(driver);
		String actualCustomerName = customer.verifycustomerName(expectedCustomerName);
		
		Assert.assertEquals(actualCustomerName, expectedCustomerName);
		System.out.println("Pass: Customer Name has been verified");
		
	}
	


}
