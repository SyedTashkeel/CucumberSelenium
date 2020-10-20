package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchClass {
	
		WebDriver driver = null;
		
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		
		//Add chromedriver resource to the project (src/test/resources/drivers(create driver folder)
		//Use relative path to access chromedriver so that you need not worry about moving driver outside the project on local machine.
		
			String driverPath = System.getProperty("user.dir");
			System.out.println("Chrome Driver Path: "+driverPath);
		
			System.setProperty("webdriver.chrome.driver",driverPath+"/src/test/resources/drivers/chromedriver.exe");
		
		// Access chromedriver from local machine using below statement
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		System.out.println("Inside Step - Browser Opens");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		System.out.println("Inside Step - User is on google search");
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() throws InterruptedException {
		
		WebElement searchValue= driver.findElement(By.name("q"));
		searchValue.sendKeys("Automation Step by Step");
		
		Thread.sleep(2000);
		System.out.println("Inside Step - User enter search text"+searchValue);		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		
		WebElement enterKey= driver.findElement(By.name("q"));
		enterKey.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		System.out.println("Inside Step - User hits enter key");
	}

	@Then("user is navigated to results page")
	public void user_is_navigated_to_results_page() throws InterruptedException {
		
		driver.getPageSource().contains("Online Courses");
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		System.out.println("Inside Step - User is directed to results page");
	}


}
