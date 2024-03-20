package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	WebDriver driver; 
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnk_Myaccount;
	
    @FindBy(xpath="//a[text()='Register']")
    WebElement lnk_Register;
    
    @FindBy(linkText = "Login")   // Login link added in step5
    WebElement linkLogin;
	
   public void clickMyaccount()
   {
	   lnk_Myaccount.click();
   }
   public void clickRegister()
   {
	   lnk_Register.click();
   }
   
   public void clickLogin()    // added in step5
   {
   	linkLogin.click();
   }


}
