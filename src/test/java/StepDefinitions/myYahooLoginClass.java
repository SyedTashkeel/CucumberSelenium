package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class myYahooLoginClass {

	WebDriver driver = null;
	
	@Given("yahoo home page is open on chrome browser")
	public void yahoo_home_page_is_open_on_chrome_browser() throws InterruptedException {

		String driverPath = System.getProperty("user.dir");
		System.out.println("Chrome Driver Path: "+driverPath);
	
		System.setProperty("webdriver.chrome.driver",driverPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		System.out.println("Inside Step - Browser Opens");
		
		driver.get("https://www.yahoo.com/");
		
		Thread.sleep(2000);
	
	System.out.println("Browser is open, yahoo home page appears!");

	}
	@When("when user clicks on sign in botton")
	public void when_user_clicks_on_sign_in_botton() {
	
		driver.findElement(By.className("_yb_1i7te")).click();
		System.out.println("User Clicked on Sign in button!");
	}

	@Then("user is navigated to yahoo login page")
	public void user_is_navigated_to_yahoo_login_page() {
		
		driver.getPageSource().contains("using your Yahoo account");
		System.out.println("using your Yahoo account! Appeared");
		}
	
	// Added regular expression to start with ^ and end with $ symbol
	// Replaced username with (.*) since the value is not fixed/hardcoded
	// Declared String variable in the method (String username) 
	
	@When("^user enters valid (.*)$")
	public void user_enters_valid_user_name(String username) {

		driver.findElement(By.id("login-username")).sendKeys(username);
		System.out.println("User entered user name");
	}

	@And("user clicks on next button")
	public void user_clicks_on_next_button() throws InterruptedException {
		
		driver.findElement(By.id("login-signin")).click();
		System.out.println("User clicked next...");
		
		Thread.sleep(2000);
	}
	@Then("user is navigated to password entry page")
	public void user_is_navigated_to_password_entry_page() {
   
		driver.getPageSource().contains("Enter password");
		System.out.println("Enter password! Text Appeared");
	}

	// Added regular expression to start with ^ and end with $ symbol
	// Replaced username with (.*) since the value is not fixed/hardcoded
	// Declared String variable in the method (String password) 
		
	@When("^user enter the valid (.*)$")
	public void user_enter_the_valid_password(String password) {
    
		driver.findElement(By.id("login-passwd")).sendKeys(password);
		System.out.println("User entered password");
	}

	@And("user clicks on the next button")
	public void user_clicks_on_the_next_button() throws InterruptedException {

		driver.findElement(By.id("login-signin")).click();
		System.out.println("User clicked next...to login");
	
		Thread.sleep(2000);
}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
		driver.getPageSource().contains("Syed");
		System.out.println("Syed! Text Appeared");
		
		driver.close();
		driver.quit();
    }

}