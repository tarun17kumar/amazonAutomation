package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,30);
	}
	
	@FindBy(how=How.XPATH, using= "//a[@id='nav-link-accountList']") public WebElement btn_signIn;
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']") WebElement txt_searchbox;
	@FindBy(how=How.XPATH,using="//div[@class='nav-search-submit nav-sprite']") WebElement btn_search;
	@FindBy(how=How.XPATH,using="//div[@class='nav-search-submit nav-sprite']") WebElement userNameafterLogin;
	@FindBy(how=How.XPATH,using="//a[@id='nav-item-signout']") WebElement btn_signOut;
	@FindBy(how=How.XPATH,using="//a[@id='nav-link-shopall']") WebElement dropdown_dept;
	@FindBy(how=How.XPATH,using="//a/span[contains(text(),'Electronics')]") WebElement lnk_electronics;

	
	public void clickSignin() {
		btn_signIn.click();
	}
	
	public void enterTextInSearchBox(String searchtext) {
		txt_searchbox.click();
		txt_searchbox.sendKeys(searchtext);
	}
	
	public void hitSearchButton() {
		btn_search.click();
	}
	
	public String getUsername() {
		return userNameafterLogin.getText();
	}
	
	public void clickSignout() {
		btn_signOut.click();
	}
	
	public void clickElectronics() {
		lnk_electronics.click();
	}
	
	public void hoverOverSignInButton() {
		Actions action = new Actions(driver);
		action.moveToElement(btn_signIn).build().perform();
	}
	
	public void hoverOverDepartmentButton() {
		Actions action = new Actions(driver);
		action.moveToElement(dropdown_dept).build().perform();
	}
	
	public void waitForDepartmentDropdown() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By) dropdown_dept));
	}

}
