package com.ionicpartners.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
	
	@FindBy(xpath = "//*[@id='content']/div[1]/div/div/div[1]/div/h5")
	WebElement AboutUs;
	
	@FindBy(xpath = "//*[@id='content']/div[1]/div/div/div[1]/div/h1")
	WebElement IonicPartners;
	
	@FindBy(xpath = "//*[@id='footer']/div/div/div/div[2]/div[2]/a[1]/i")
	WebElement Twitters;
	
	
	WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AboutUsAvailable() {
		AboutUs.isDisplayed();
	}
	
	public void IonicpartnersAvailable() {
		IonicPartners.isDisplayed();
	}
	
	public void TwitterAvailable() {
		Twitters.isDisplayed();
	}
	
	public void clickTwitter() {
		Twitters.click();
	}
}
