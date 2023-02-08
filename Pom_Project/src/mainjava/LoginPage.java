package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	// All the locators of page
	
	@FindBy(xpath ="//*[text()='Login']")WebElement txtLoginPage;
	@FindBy(name="username")WebElement userName;
	@FindBy(name="password")WebElement pass;
	@FindBy(tagName="button")WebElement btnLogin;
	
	
	//Initialization of locators/variable
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method required to perform test steps
	
	/* 
	 * Author : Vishakha Sangale
	 * Date : 	05 Feb 2023
	 * Desrcription :This test method use to verify login page title
	 * Parameter return :String
	  */
	public String titleOfLoginPage() {
		return txtLoginPage.getText();
	}
	/* 
	 * Author : Vishakha Sangale
	 * Date : 	05 Feb 2023
	 * Desrcription :This test method use to verify verify current url of the page
	 * Parameter return :String
	  */
	public String urlOfPage(){
		return driver.getCurrentUrl();
	}
	/* 
	 * Author : Vishakha Sangale
	 * Date : 	05 Feb 2023
	 * Desrcription :This test method use to set username value
	  */
	public void setUserName(String usrName) {
		userName.sendKeys(usrName);
	}
	/* 
	 * Author : Vishakha Sangale
	 * Date : 	05 Feb 2023
	 * Desrcription :This test method use to set password value
	  */
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	/* 
	 * Author : Vishakha Sangale
	 * Date : 	05 Feb 2023
	 * Desrcription :This test method use to click login button
	  */
	public void clickLoginBtn() {
		btnLogin.click();
	}
	
	/* 
	 * Author : Vishakha Sangale
	 * Date : 	05 Feb 2023
	 * Desrcription :This test method use to get title of build
	  */
	public String getBuildTitle() {
		return driver.getTitle();
	}
	
}
	
	
	
	
	
	
	