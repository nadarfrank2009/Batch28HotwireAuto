package com.auto.pageFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.base.Base;

public class WebElements extends Base{

	public WebElements(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@class='btn btn-default sign-in btn-xs']")
	private WebElement signInButton;

	@FindBy (xpath = "//*[@class='form-control']")
	private WebElement emailFeild;
	
	@FindBy (xpath = "(//*[@class='form-control'])[2]")
	private WebElement passwordFeild;
	
	@FindBy (xpath ="//*[@class='btn btn-primary btn-block']")
	private WebElement finalSignINButton;
	
	@FindBy (xpath = "//*[@class='form-control hw-input hw-input-icon type__400__regular text-ellipsis']")
	private WebElement destinationFeild;
	
	public WebElement getDestinationFeild() {
		return destinationFeild;
	}
	
	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getEmailFeild() {
		return emailFeild;
	}

	public WebElement getPasswordFeild() {
		return passwordFeild;
	}

	public WebElement getFinalSignInButton() {
		return finalSignINButton;
	}


	

}
