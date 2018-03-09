package stepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import featureFile.*;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User should be on login screen$")
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:/cucumberImran/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://auth.qa.edgenuity.com/login");
		
	}
	

}
