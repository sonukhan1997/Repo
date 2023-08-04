package trello.trello;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import trello.BaseClass;
import trellopom.BoardsPage;
import trellopom.CreateBoardsPage;
import trellopom.HomePage;
import trellopom.LoginToContinuePage;
import trellopom.LoginToTrelloPage;

public class EndToEndTrello extends BaseClass{
	@Test
	public void endToEndTrello() throws IOException, InterruptedException {
		
		webdriverutils.implicitWait(driver);
		HomePage homepage=new HomePage(driver);
		homepage.getloginButton().click();
		
		LoginToTrelloPage logintotrellopage=new LoginToTrelloPage(driver);
		logintotrellopage.getEmailTextField().sendKeys(fileutils.readDataFromPropertyFile("email"));
		logintotrellopage.continueButton().click();
		
		LoginToContinuePage logintocontinuepage=new LoginToContinuePage(driver);
		//logintocontinuepage.passwordTextField().sendKeys(fileutils.readDataFromPropertyFile("password"));
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys(fileutils.readDataFromPropertyFile("password"));
		logintocontinuepage.loginButton().click();
		
		BoardsPage boardspage=new BoardsPage(driver);
		Thread.sleep(5000);
		boardspage.createNewBoardButton().click();
		Thread.sleep(4000);
		boardspage.BoardTitleTextField().sendKeys(fileutils.readDataFromPropertyFile("boardtitle"));
		boardspage.createButton().click();
		
		
		CreateBoardsPage createboardspage=new CreateBoardsPage(driver);
		Thread.sleep(4000);
		createboardspage.gettitleForCard().sendKeys(fileutils.readDataFromPropertyFile("firstdata"));
		createboardspage.getaddCardButton().click();
		Thread.sleep(4000);
		createboardspage.gettitleForCard().sendKeys(fileutils.readDataFromPropertyFile("seconddata"));
		createboardspage.getaddCardButton().click();
		Thread.sleep(4000);
		createboardspage.gettitleForCard().sendKeys(fileutils.readDataFromPropertyFile("thirddata"));
		createboardspage.getaddCardButton().click();
		Thread.sleep(4000);
		createboardspage.gettitleForCard().sendKeys(fileutils.readDataFromPropertyFile("fourthdata"));
		createboardspage.getaddCardButton().click();
		createboardspage.getendcard().click();
		Thread.sleep(4000);
		WebElement properties = createboardspage.getselectproperties();
		Actions actions=new Actions(driver);
		actions.clickAndHold(properties).moveByOffset(550, 0).release(properties).build().perform();
		Thread.sleep(4000);
		WebElement excel = createboardspage.getselectexcel();
		actions.clickAndHold(excel).moveByOffset(250, 0).release(excel).build().perform();
		Thread.sleep(4000);
		createboardspage.getshowmenubutton().click();
		Thread.sleep(4000);
		createboardspage.getmorebutton().click();
		Thread.sleep(4000);
		createboardspage.getcloseboardbutton().click();
		Thread.sleep(4000);
		createboardspage.getclosebutton().click();
		Thread.sleep(4000);
		createboardspage.getperdellink().click();
		Thread.sleep(4000);
		createboardspage.getdeletebutton().click();
		Thread.sleep(4000);
		createboardspage.getprofileoption().click();
		Thread.sleep(4000);
		createboardspage.getlogoutoption().click();
		Thread.sleep(4000);
		createboardspage.getlogoutbutton().click();
		
		
		
	}
	

}
