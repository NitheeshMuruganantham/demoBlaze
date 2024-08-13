package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountProcess extends BasePom {
	public WebDriver driver;
	String signAlertValue="";
	public AccountProcess(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);	
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
	
	public void signUpAlert() {
		signAlertValue= driver.switchTo().alert().getText();
		if (signAlertValue.equalsIgnoreCase("This user already exist."))
		{
			driver.switchTo().alert().accept();
			signUpCancelButton();
		}
		if(signAlertValue.equalsIgnoreCase("Sign up successful."))
		{
			driver.switchTo().alert().accept();
			signUpCancelButton();
		}
	}
	
	}
	
	
	
	

