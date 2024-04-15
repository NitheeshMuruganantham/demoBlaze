//package testcases;
//
//
//import org.testng.annotations.Test;
//
//import baseClass.BaseProcess;
//import pom.AccountProcess;
//import utilities.DataProviders;
//
//public class accountCreation extends BaseProcess{
//	
//	
//	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class)
//	public void register(String name1,String password1,String	purchseName1,String	country1, String city1,String card1,String month1,String year1) throws InterruptedException {
//		
//		AccountProcess ap = new AccountProcess(driver);
//		ap.signUpProcess();
//		ap.signname(name1);
//		ap.signPword(password1);
//		ap.signupSubmit();
//		Thread.sleep(5000);
//		String signUpAlert=driver.switchTo().alert().getText();
//		if (signUpAlert.equalsIgnoreCase("This user already exist."))
//		{
//			driver.switchTo().alert().accept();
//			ap.signUpCancelButton();
//		}
//	
//		
//	
//	}
//
//}
