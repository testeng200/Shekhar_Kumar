package genericUtility1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import genericUtility.FileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepo1.HomePage1;
import pomRepo1.LoginPage1;

public class BaseClass1 {
	
	public WebDriver driver;
	public FileUtility fUtils = new FileUtility();
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Data Base connnectivity Has Been Stablished");
	}
	
	@BeforeClass
	public void  bcConfig() throws IOException {
		String url=fUtils.fetchDataFromPropertyFile("url");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@BeforeMethod
	public void bmConfig() throws IOException {
			String username = fUtils.fetchDataFromPropertyFile("username");
			String password = fUtils.fetchDataFromPropertyFile("password");
			LoginPage1 login= new LoginPage1(driver);
			login.loginAction(username, password);
			
	}
	
	@AfterMethod
	public void afConfig() {
			HomePage1 home=new HomePage1(driver);
			home.getLogoutButton();
			
	}
	
	@AfterClass
	public void acConfig() {
		driver.quit();
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("Data Base Connection Has Been Closed");
		
		
	}
	
	
	

}
