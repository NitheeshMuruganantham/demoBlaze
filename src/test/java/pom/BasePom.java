package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePom {
	public WebDriver driver;
	public BasePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
		
	}
public void alertAccept() {
	driver.switchTo().alert().accept();
}
}
