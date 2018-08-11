package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Guru99LoginPage extends TestBase{
	@FindBy(name="uid")
    WebElement user99GuruName;  
    @FindBy(name="password")
    WebElement password99Guru;  
    @FindBy(className="barone")
    WebElement titleText;
    @FindBy(name="btnLogin")
    WebElement login;	
    public Guru99LoginPage(WebDriver driver) {
    	//This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    public Guru99LoginPage openLoginPage()
    {
    	//logger.info("Opening Url ");
    	return this;
    }
  //Set user name in textbox
    public void setUserName(String strUserName){
        user99GuruName.sendKeys(strUserName);  
    }

    //Set password in password textbox

    public void setPassword(String strPassword){
    password99Guru.sendKeys(strPassword);
    } 
    

    //Click on login button

    public Guru99HomePage clickLogin(){
            login.click();
            return PageFactory.initElements(driver, Guru99HomePage.class);
    }
    
}
