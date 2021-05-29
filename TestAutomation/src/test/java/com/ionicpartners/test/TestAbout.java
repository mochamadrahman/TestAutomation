package com.ionicpartners.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ionicpartners.pages.AboutPage;
import com.ionicpartners.pages.HomePage;
import com.ionicpartners.pages.TwitterPage;

public class TestAbout {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void testAbout() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		HomePage homePage = new HomePage(driver);
		AboutPage aboutPage = new AboutPage(driver);
		TwitterPage twitterPage = new TwitterPage(driver);

		System.out.println("     Test 2      ");
		System.out.println("=================");

//		open test page
		String url = "https://www.ionicpartners.com/";
		driver.get(url);
		System.out.println("Home Page is open");

//		maximize browser window
		driver.manage().window().maximize();
		sleep(3000);

		homePage.clickAboutusButton();
		System.out.println("About us Page is open");

//		verify element About Us available
		aboutPage.AboutUsAvailable();
		System.out.println("AboutUs Element is available.");

//		verify element Ionic Partners available
		aboutPage.IonicpartnersAvailable();
		System.out.println("IonicPartners Element is available.");

//		This will scroll the web page till end.		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

//		click element Twitter 
		aboutPage.clickTwitter();
		System.out.println("Twitter button be clicked");
		sleep(3000);
		
//		verify element Ionic Partners in Twitter page available
		twitterPage.IonicpartnersTwittersAvailable();
		System.out.println("Ionic Partners Element in Twitter page is available");

//		verify element Follow button available
		twitterPage.FollowButtonAvailable();
		System.out.println("Follow button Element in Twitter page is available.");

	}

	@AfterTest
	public void tesrDownTest() {

//		close browser
		driver.close();
		driver.quit();
	}

	private static void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
