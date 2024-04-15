package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseProcess;
import pom.AccountProcess;
import pom.Order;
import utilities.DataProviders;

public class OrderPlacing extends BaseProcess {
	

	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class)

	public void purchasing(String name1,String password1,String	purchseName1,String	country1, String city1,String card1,String month1,String year1) throws InterruptedException {
		
		logger.info(" SignUp the New Account");	
		AccountProcess ap = new AccountProcess(driver);
		ap.signUpProcess();
		ap.signname(name1);
		ap.signPword(password1);
		ap.signupSubmit();
		Thread.sleep(2000);
		
		String signUpAlert=driver.switchTo().alert().getText();
		if (signUpAlert.equalsIgnoreCase("This user already exist."))
		{
			driver.switchTo().alert().accept();
			ap.signUpCancelButton();
		}
		if(signUpAlert.equalsIgnoreCase("Sign up successful."))
		{
			driver.switchTo().alert().accept();
			ap.signUpCancelButton();
		}
		logger.info(" Login the Account");	
		ap.loginProcess();
		ap.loginName(name1);
		ap.loginPword(password1);
		ap.loginSubmit();
		Thread.sleep(2000);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		if(wait.until(ExpectedConditions.alertIsPresent())==null)
//		{
		logger.info("Ordering the lap");
			Order orderlap = new Order(driver);
			orderlap.selectingLap();
			orderlap.nxtButton();
			orderlap.selectingMac();
			orderlap.cartButton();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			orderlap.cartLinkButton();
			orderlap.placeOrderButton();
			logger.info("Placing the order");
			orderlap.nameFill(purchseName1);
			orderlap.countryFill(country1);
			orderlap.cityFill(city1);
			orderlap.cardFill(card1);
			orderlap.monthFill(month1);
			orderlap.yearFill(year1);
			Thread.sleep(2000);
			orderlap.purchaseButton();
			Thread.sleep(2000);
			orderlap.okButton();
			Thread.sleep(1500);
			logger.info("Logout");
			orderlap.logoutButton();
		//}
//		else {
//		 String alertReason= driver.switchTo().alert().getText();
//		  System.out.println(alertReason);
//		}
		
	}

}
