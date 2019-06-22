package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListingPage {
	
	WebDriver driver;
	
	public ProductListingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//a/div/span[contains(text(),'HEADPHONES')]") WebElement product_headphone;
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div[1]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	WebElement firstHeadphone;
	
	public void clickOnHeadphoneCategory() {
		product_headphone.click();
	}
	
	public void clickOnFirstHeadPhone() {
		firstHeadphone.click();
	}
	
	

}
