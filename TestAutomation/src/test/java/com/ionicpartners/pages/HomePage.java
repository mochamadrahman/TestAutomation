package com.ionicpartners.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
//	@FindBy(name = "Blog")
	@FindBy(id = "slider-11-slide-47-layer-30")
	WebElement Blog;
	
	@FindBy(id = "slider-11-slide-47-layer-32")
	WebElement AboutUs;
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickBlogButton() {
		Blog.click();
	}
	
	public void clickAboutusButton() {
		AboutUs.click();
	}

}
