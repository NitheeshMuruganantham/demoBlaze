package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Order extends BasePom{
	
		
				
	public WebDriver driver;
	
	public Order(WebDriver driver) {
			super(driver);
	}
	
	
	@FindBy(xpath="//*[text()='Laptops']")
	WebElement laptops;
	
	@FindBy(xpath="//*[text()='Next'][@value='9']")
	WebElement nxt;
	
	@FindBy(xpath="//*[text()='MacBook air']")
	WebElement product;
	
	@FindBy(css="a[class*='btn-success' ]")
	WebElement cart;
	
	@FindBy(xpath = "//*[text()='Cart']")
	WebElement cartLink;
	
	@FindBy(css="[class*='btn btn-success']")
	WebElement placeOrder;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement card;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(xpath="//*[text()='Purchase']")
	WebElement purchase;
	
	@FindBy(xpath="//*[text()='OK']")
	WebElement okie;
	
	@FindBy(id="logout2")
	WebElement logout;
	
	//Actions
	public void selectingLap() {
		laptops.click();
	}
	public void nxtButton() {
		nxt.click();
	}
	public void selectingMac() {
		product.click();
	}
	public void cartButton() {
		cart.click();
	}
	public void cartLinkButton() {
		cartLink.click();
	}
	public void placeOrderButton() {
		placeOrder.click();
	}
	public void nameFill(String n) {
		name.sendKeys(n);
	}
	public void countryFill(String c) {
		country.sendKeys(c);
	}
	public void cityFill(String ci) {
		city.sendKeys(ci);
	}
	public void cardFill(String a) {
		card.sendKeys(a);
	}
	public void monthFill(String mon) {
		month.sendKeys(mon);
	}
	public void yearFill(String y) {
		year.sendKeys(y);
	}
	public void purchaseButton() {
		purchase.click();
	}
	public void okButton() {
		okie.click();
	}
	public void logoutButton() {
		logout.click();
	}
}
