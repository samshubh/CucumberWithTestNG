package com.qa.stepDefinition;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestNGExample {
	
	WebDriver driver;
	
	@Before
	 public void setUp() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vt1056.SRITADS\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://freecrm.com/");
		Thread.sleep(4000);
	 }
	
	@After
	  public void tearDown()
	  {
		driver.quit();
	  }
	
	@Given("^title of the page is Free CRM$")
	  public void title_of_the_page_is_Free_CRM()
	  {
		String title = driver.getTitle();
		  System.out.println(title);
	  } 
	
	@When("^user is on homepage$")
	public void user_is_on_homepage() {
		
		String url=driver.getCurrentUrl();
		 System.out.println(url);
	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button() throws InterruptedException {
	   
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		 Thread.sleep(4000);
	}

	@Then("^enters email and password$")
	public void enters_email_and_password(DataTable credentials) throws InterruptedException  {
		
		for(Map<String,String> data :credentials.asMaps(String.class,String.class)) {
			
			driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(data.get("email"));
			 Thread.sleep(4000);
			 
			 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(data.get("password"));
			 Thread.sleep(4000);
			 
			  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			   Thread.sleep(4000);
		}
	    
	}

	@Then("^verify the user name$")
	public void verify_the_user_name() {
		
		String userName = driver.findElement(By.xpath("//span[@class='user-display']")).getText();
	     System.out.println(userName);
	    
	}

}
