package testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseProcess {
	public Logger logger;
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		logger=LogManager.getLogger(this.getClass());//
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(1500);
		driver.close();
	}
}
