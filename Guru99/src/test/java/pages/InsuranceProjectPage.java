package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class InsuranceProjectPage extends TestBase {
	 @FindBy(css="#email")
	    WebElement insurancePageUserName; 
	   @FindBy(css="#password")
	    WebElement insurancePagepass;  


	    public InsuranceProjectPage(WebDriver driver){
	            //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }

	    
}
