package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver wd;

	@Given ("user is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\eclipse-simplecucumber\\simplecucumber\\src\\test\\resources\\drivers\\chromedriver.exe");

		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://www.google.co.uk");

	}

	@When("^user enter \"([^\"]*)\" in search field")
	public void user_enter_cars_in_search_field(String value) {
		wd.findElement(By.name("q")).sendKeys(value);
	}

	@When("user presses search button")
	public void user_presses_search_button() {
		wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//wd.findElement(By.name("btnK")).click();
	}

	@Then("results page is displayed")
	public void results_page_is_displayed() {
		assert(true);
	}
}
