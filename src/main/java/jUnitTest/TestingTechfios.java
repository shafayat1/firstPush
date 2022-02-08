package jUnitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;


public class TestingTechfios {
   WebDriver driver;
   @Before
	public void init() {

	    System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	@Test
	public void login() {
		
		By UserNameField =By.xpath("//input[@id='username']");
		By PasswordField =By.xpath("//input[@id='password']");
		By SigninButtonField=By.xpath("//button[contains(text(),'Sign in')]");
		By DashboardHeaderField=By.xpath("//h2[contains(text(),' Dashboard ')]");
		By CustomerField=By.xpath("//span[contains(text(),'Customers')]");
		By AddCustomerField=By.xpath("//a[contains(text(),'Add Customer')]");
		By AddContactField=By.xpath("//h5[contains(text(),'Add Contact')]");
	    By NameField=By.xpath("//input[@id='account']");
	    By CompanyNameField=By.xpath("//select[@id='cid']");
	    By TelephoneField=By.xpath("//input[@id='phone']");
	    By AddressField=By.xpath("//input[@id='address']");
	    By CityField=By.xpath("//input[@id='city']");
	    By StateField=By.xpath("//input[@id='state']");
	    By ZipcodeField=By.xpath("//input[@id='zip']");
	    By CountryField=By.xpath("//select[@id='country']");
	    By SaveField=By.xpath("//button[@id='submit']");
	    
	    

		//Performing login
		driver.findElement(UserNameField).sendKeys("demo@techfios.com");
		driver.findElement(PasswordField).sendKeys("abc123");
		driver.findElement(SigninButtonField).click();
		
		Assert.assertTrue("wrong page", driver.findElement(DashboardHeaderField).isDisplayed());
		
		driver.findElement(CustomerField).click();
		driver.findElement(AddCustomerField).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Assert.assertTrue("wrong page", driver.findElement(AddContactField).isDisplayed());
		driver.findElement(NameField).sendKeys("SHOELALA");
		Select sel = new Select(driver.findElement(CompanyNameField));
		sel.selectByVisibleText("NNN");
		driver.findElement(TelephoneField).sendKeys("123456789");
		driver.findElement(AddressField).sendKeys("Ghaziabad");
		driver.findElement(CityField).sendKeys("Dhaka");
		driver.findElement(StateField).sendKeys("NewYork");
		driver.findElement(ZipcodeField).sendKeys("76053");
		driver.findElement(CountryField).sendKeys("Italy");
		driver.findElement(SaveField).click();
		
		
		
		
		
		
		
        
		
	}
}
