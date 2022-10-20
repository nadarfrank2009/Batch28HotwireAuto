package com.auto.stepDefinition;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.auto.base.Base;
import com.auto.pageFactory.WebElements;
import com.auto.utilities.Tools;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Base {

	//make sure all imports are correct and dont confuse Webelement Classs
	WebElements pf = PageFactory.initElements(driver, WebElements.class);

	@Given("User navigates to {string}")
	public void user_navigates_to(String webPage) {
		driver.get(webPage);
	}

	@When("User clicks on the Sign In Button")
	public void user_clicks_on_the_sign_in_button() {

		//driver.findElement(By.xpath("//*[@class='btn btn-default sign-in btn-xs']")).click();
		pf.getSignInButton().click();
	}

	@When("User enters {string} into the email feild")
	public void user_enters_into_the_email_feild(String email) 	{
		pf.getEmailFeild().sendKeys(email);

	}

	@When("User enters {string} into the password feild")
	public void user_enters_into_the_password_feild(String password) throws Exception {
		pf.getPasswordFeild().sendKeys(password);
		
		
		Tools.getHighLighter(pf.getFinalSignInButton());
		Tools.takeScreenShoot();
	}

	@When("User clicks on final sign In Button")
	public void user_clicks_on_final_sign_in_button() {
		pf.getFinalSignInButton().click();

	}

	@Then("User should be able to access {string}")
	public void user_should_be_able_to_access(String webpage) {

		String expected = webpage;
		String actual;
		
		
		//driver.manage().deleteAllCookies();
		
		driver.get(webpage);

		actual = driver.getCurrentUrl();

		Assert.assertEquals(actual, expected);

	}

}
