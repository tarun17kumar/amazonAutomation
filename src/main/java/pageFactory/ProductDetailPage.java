package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPage {
	
	WebDriver driver;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']") 
	WebElement addToCartButton;
	
	public void clickAddToCartButton() {
		addToCartButton.click();
	}

}
