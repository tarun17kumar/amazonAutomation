package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH, using="//input[@id='ap_email']") WebElement txt_email;
	@FindBy(how=How.XPATH, using="//input[@id='ap_password']") WebElement txt_password;
	@FindBy(how=How.XPATH, using="//input[@id='signInSubmit']") WebElement btn_SignInSubmit;
	
	public void setEmail(String email) {
		txt_email.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clicksignInSubmit() {
		btn_SignInSubmit.click();
	}
	
	


}
