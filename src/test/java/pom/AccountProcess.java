package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountProcess extends BasePom {
	public WebDriver driver;
	public AccountProcess(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="signin2")
	WebElement signUp;
	
	@FindBy(css="#sign-username")
	WebElement signUserName;
	
	@FindBy(css="#sign-password")
	WebElement signPassword;
	
	@FindBy(xpath="//*[@onclick='register()']")
	WebElement signupButton;
	
	
	@FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[1]/button")
	WebElement signUpCancel;
	
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login;
	@FindBy(css="#loginusername")
	WebElement loguserName;
	
	@FindBy(id="loginpassword")
	WebElement logPassword;
	
	@FindBy(xpath="//*[@onclick='logIn()']")
	WebElement logButton;
	
	
	//Actions
	public void signUpProcess() {
		signUp.click();
	}

	public void signname(String un) {
		signUserName.sendKeys(un);
	}
	public void signPword(String sp) {
		signPassword.sendKeys(sp);
	}
	public void signupSubmit() {
		signupButton.click();
	}
	
	public void signUpCancelButton() {
		signUpCancel.click();
	}
	
	public void loginProcess() {
		login.click();
	}

	public void loginName(String ln) {
		loguserName.sendKeys(ln);
	}
	public void loginPword(String lp) {
		logPassword.sendKeys(lp);
	}
	public void loginSubmit() {
		logButton.click();
	}
}
