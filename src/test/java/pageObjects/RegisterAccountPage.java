package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage
{

    WebDriver driver;
    public RegisterAccountPage(WebDriver driver) 
    {
		super(driver);
	}
    

    
@FindBy(xpath="//input[@id='input-firstname']") @CacheLookup private WebElement firstName;
@FindBy(xpath="//input[@id='input-lastname']") @CacheLookup private WebElement lastName;
@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement eMail;
@FindBy(xpath="//input[@id='input-telephone']") @CacheLookup private WebElement telephone;
@FindBy(xpath="//input[@id='input-password']") @CacheLookup private WebElement password;
@FindBy(xpath="//input[@id='input-confirm']") @CacheLookup private WebElement passwordConfirm;
//@FindBy(xpath="//input[@id='input-newsletter-yes']") 
@FindBy(xpath="//input[@type='radio'][@value='1']") @CacheLookup private WebElement yes;
//@FindBy(xpath="//input[@id='input-newsletter-no']") @CacheLookup private WebElement no;
@FindBy(xpath="//input[@name='agree']") @CacheLookup private WebElement agree;
@FindBy(xpath="//input[@value='Continue']") @CacheLookup private WebElement Continue;
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;


public void SetFirstname(String Firstname)
{
	firstName.sendKeys(Firstname);
}

public void SetLastname(String Firstname)
{
	lastName.sendKeys(Firstname);
}

public void SetEmail(String Email)
{
	eMail.sendKeys(Email);
}
public void SetPassword(String Password)
{
	password.sendKeys(Password);
	
}
public void SetPasswordConfirm(String Password)
{
	passwordConfirm.sendKeys(Password);
	
}

public void SetTelephone(String phone)
{
	telephone.sendKeys(phone);
}

public void SubscribeNewsletter(String Nletter)
{
	if(Nletter.equals("yes"))
	{
		//yes.click();
		yes.submit();
	}
}
public void PrPolicy()
{
	agree.click();
}

public void Clickcontinue()
{
	//Continue.click();
	    //sol1 
		//btnContinue.click();
		
		//sol2 
		Continue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
}


public String getConfirmationMsg()
{
	try
	{
		return (msgConfirmation.getText());
	} 
	catch (Exception e) 
	{
		return (e.getMessage());

	}
}



}
