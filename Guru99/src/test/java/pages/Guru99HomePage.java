package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Guru99HomePage extends TestBase {
	   @FindBy(xpath="//table//tr[@class='heading3']")
	    WebElement homePageUserName; 
	   @FindBy(xpath="//a[text()='Insurance Project']")
	    WebElement insuranceProjectLink;  

	   public Guru99HomePage(WebDriver driver) {
	    	//This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
   
	    //Get the User name from Home Page
	        public String getHomePageDashboardUserName(){
	         return    homePageUserName.getText();
	        }
	        
	    //Click on InsuranceProject Link
	        public InsuranceProjectPage clickonInsuranceProjLink()
	        {
	        	insuranceProjectLink.click();
	        	return PageFactory.initElements(driver,InsuranceProjectPage.class);
	        }

	}

