package trellopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToContinuePage {
	WebDriver driver;
	public LoginToContinuePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="password")
	private WebElement passwordTextfield;
	public WebElement passwordTextField() {
		return passwordTextfield;
	}
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginButton;
	public WebElement loginButton() {
		return loginButton;
	}

}
