package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import pom.AccountProcess;
import pom.Order;
import utilities.DataProviders;

public class OrderPlacing extends BaseProcess {
	Order orderlap ;
	AccountProcess ap;
	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class)

	public void signUp(String name1,String password1,String	purchseName1,String	country1, String city1,String card1,String month1,String year1) throws InterruptedException {	
													logger.info(" SignUp the New Account");	
			ap = new AccountProcess(driver);
			ap.signUpProcess();
			ap.signname(name1);
			ap.signPword(password1);
			ap.signupSubmit();
			Thread.sleep(2000);
			ap.signUpAlert();
			logger.info(" Login the Account");	
			ap.loginProcess();
			ap.loginName(name1);
			ap.loginPword(password1);
			ap.loginSubmit();
			Thread.sleep(2000);
													logger.info("Ordering the lap");
			orderlap = new Order(driver);
			orderlap.selectingLap();
			orderlap.nxtButton();
			orderlap.selectingMac();
			orderlap.cartButton();
			Thread.sleep(2000);
			orderlap.alertAccept();
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
			Thread.sleep(1200);
	
	}

}
