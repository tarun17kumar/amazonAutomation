package functionalTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.Homepage;
import pageFactory.Loginpage;
import pageFactory.ProductDetailPage;
import pageFactory.ProductListingPage;

public class NewTest {
	
	WebDriver driver;
	
 @BeforeTest
 public void runBefore() {
	 System.setProperty("webdriver.chrome.driver", "/Users/tarunkumar/Documents/selenium/chromedriver");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--incongito");
	 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	 capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	 driver = new ChromeDriver(options);
	 driver.get("https://www.amazon.com");
}

 
 @Test(enabled=false)
  public void userSearchesaString() throws InterruptedException {
	 
	 Homepage homePage = PageFactory.initElements(driver, Homepage.class);
	 Thread.sleep(2000);
	 homePage.enterTextInSearchBox("pubg");
	 homePage.hitSearchButton();
	 Thread.sleep(2000);
  }
 
 @Test(enabled=false)
 public void userlogin() {
	 
	 Homepage homePage = PageFactory.initElements(driver, Homepage.class);
	 Loginpage loginPage = PageFactory.initElements(driver, Loginpage.class);
	 homePage.clickSignin();
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 loginPage.setEmail("kumar.tarun035@gmail.com");
	 loginPage.setPassword("Tushar@2018");
	 loginPage.clicksignInSubmit();
	 System.out.println("The user name after login is " + homePage.getUsername());
	 Actions action = new Actions(driver);
	 action.moveToElement(homePage.btn_signIn).build().perform();
	 homePage.clickSignout();
 }
 
 @Test(enabled=true)
 public void addEarphonesTocart() throws InterruptedException {
	 
	 Homepage homePage = PageFactory.initElements(driver, Homepage.class);
	 ProductListingPage productListingPage = PageFactory.initElements(driver, ProductListingPage.class);
	 ProductDetailPage productDetailPage = PageFactory.initElements(driver, ProductDetailPage.class);
	 Thread.sleep(2000);
	 homePage.hoverOverDepartmentButton();
	 homePage.clickElectronics();
	 Thread.sleep(2000);
	 productListingPage.clickOnHeadphoneCategory();
	 Thread.sleep(2000);
	 productListingPage.clickOnFirstHeadPhone();
	 productDetailPage.clickAddToCartButton();
	 Thread.sleep(2000);
	 
	 
	 }
 
 @AfterTest
 public void afterMethod() {
	 driver.quit();
 }
}
