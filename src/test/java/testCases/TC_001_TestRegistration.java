package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.HomePage;
import pageObjects.RegisterAccountPage;
import testBase.BaseClass;

public class TC_001_TestRegistration extends BaseClass{

	@Test(groups= {"regression","master"})
	public void Test_AccountRegistration() 
	{
		logger.info("Test case started");
		logger.debug("logger.debug started");
		HomePage hp=new HomePage(driver);// creating obj for homepage 
		hp.clickMyaccount();
		hp.clickRegister();
		logger.info("REgister link clicked");
		
		RegisterAccountPage regpage=new RegisterAccountPage(driver); // creating obj for reg page to acess methods in it
		
		logger.info("Entering details");
		regpage.SetFirstname(randomeString().toUpperCase());
		regpage.SetLastname(randomeString().toUpperCase());
		regpage.SetEmail(randomeString()+"@gmail.com");// randomly generated the email
				
		
		
        String password=randomAlphaNumeric();
		
		regpage.SetPassword(password);
		regpage.SetPasswordConfirm(password);
		regpage.SetTelephone(randomeNumber());
		
		//regpage.SubscribeNewsletter("yes");
		regpage.PrPolicy();
		regpage.Clickcontinue();
		logger.info("Submitted form");
		
		String confmsg=regpage.getConfirmationMsg();
		if (confmsg.equals("Your Account Has Been Created!"))
			logger.info("Test case passed");
		else
			logger.error("Test case failed");
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		logger.debug("debug ended");
		logger.info("Test case completed");
		
		

	}

}
