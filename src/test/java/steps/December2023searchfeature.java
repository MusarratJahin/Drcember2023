package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObject;


public class December2023searchfeature extends GoogleBase {
    PageObject po;
	//WebDriver driver;

	@Given("I am on Google homepage")
	public void i_am_on_google_homepage() {

		//call the LauncjBrowser
		launchBrowser();
		

	}

	@When("i enter the search {string}")
	public void i_enter_the_search(String string) {

		// step 1: identify or locate the element
		// 8 Locators : id, name, class name, HTML tag, link text, partial link text, X
		// path,CSS selector

		//WebElement searchBox = driver.findElement(By.id("APjFqb"));

		// step 2: perform the action

		//searchBox.sendKeys(string);
          po = new PageObject(driver);
		po.enterSearch(string);
		
	}

	@When("I click Search button")
	public void i_click_search_button() {

     po.clicksearch();
		//searchBtn.click();

	}

	@Then("I receive the result")
	public void i_receive_the_result() {

		WebElement resultstarts;
		WebElement result = driver.findElement(By.id("result-stats"));
		String myResult = result.getText();

		System.out.println("********************************");
		System.out.println("myResult");
		System.out.println("*********************************");

		closeBrowser();
		
	}

}
