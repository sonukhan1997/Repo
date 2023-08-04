package trellopom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBoardsPage {
	WebDriver driver;
	public CreateBoardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//textarea[@placeholder='Enter a title for this card…']")
	private WebElement titleForCard;
	public WebElement gettitleForCard() {
		return titleForCard;
	}
	@FindBy (xpath = "//div[@class='cc-controls u-clearfix']/div/input[@type='submit']")
	private WebElement addCardButton;
	public WebElement getaddCardButton() {
		return addCardButton;
	}
	@FindBy(xpath =  "//a[@class='icon-lg icon-close dark-hover js-cancel']")
	private WebElement endcard;

	public WebElement getendcard() {
		return endcard;
	}
	
	@FindBy(xpath = "(//span[@class='list-card-title js-card-name'])[2]")
	private WebElement selectproperties;

	public WebElement getselectproperties() {
    return selectproperties;
	}
	@FindBy(xpath = "((//div[@class='js-list list-wrapper'])[3]")
	private WebElement donelist;

	public WebElement getdonelist() {
	return donelist;
	}
	@FindBy(xpath = "(//span[@class='list-card-title js-card-name'])[1]")
	private WebElement selectexcel;

	public WebElement getselectexcel() {
    return selectexcel;
	}
	@FindBy(xpath = "((//div[@class='js-list list-wrapper'])[2]")
	private WebElement doinglist;

	public WebElement getdoinglist() {
	return doinglist;
	}
	@FindBy(xpath = "	//button[@aria-label='Show menu']")
	private WebElement showmenubutton;

	public WebElement getshowmenubutton() {
	return showmenubutton;
	}
	@FindBy(xpath = "//a[@class='board-menu-navigation-item-link js-open-more']")
	private WebElement morebutton;

	public WebElement getmorebutton() {
	return morebutton;
	}
	@FindBy(xpath = "//a[@class='board-menu-navigation-item-link js-close-board']")
	private WebElement closeboardbutton;

	public WebElement getcloseboardbutton() {
	return closeboardbutton;
	}
	@FindBy(xpath = "//input[@value='Close']")
	private WebElement closebutton;

	public WebElement getclosebutton() {
	return closebutton;
	}
	//button[text()='Permanently delete board']
	@FindBy(xpath = "//button[text()='Permanently delete board']")
	private WebElement perdellink;

	public WebElement getperdellink() {
	return perdellink;
	}
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deletebutton;

	public WebElement getdeletebutton() {
	return deletebutton;
	}
	@FindBy(xpath = "//div[@class='OUdAuicP657Tka']")
	private WebElement profileoption;

	public WebElement getprofileoption() {
	return profileoption;
	}
	@FindBy(xpath = "//button[@data-testid='account-menu-logout']")
	private WebElement logoutoption;

	public WebElement getlogoutoption() {
	return logoutoption;
	}
	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement logoutbutton;

	public WebElement getlogoutbutton() {
	return logoutbutton;
	}
}
	

	
