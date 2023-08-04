package trellopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardsPage {
	WebDriver driver;
	public  BoardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@CLASS='board-tile mod-add']")
	private WebElement createNewBoardButton;
	public WebElement createNewBoardButton() {
		return createNewBoardButton;
	}
	@FindBy(xpath = "//form/div/label/input")
	private WebElement BoardTitleTextField;
	public WebElement BoardTitleTextField() {
		return BoardTitleTextField;
	}
	@FindBy (xpath = "//button[text()='Create']")
	private WebElement createButton;
	public WebElement createButton() {
		return createButton;
	}

}
