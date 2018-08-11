package stepdefinitions;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Guru99HomePage;
import pages.Guru99LoginPage;
import pages.InsuranceProjectPage;

public class UIStepDef extends TestBase {
	WebDriver driver;

	public UIStepDef() {
		TestBase.initialization();
		driver = TestBase.driver;
	}
	// public UIStepDef(WebDriver driver) {
	// super(driver);
	// // TODO Auto-generated constructor stub
	// }

	Guru99LoginPage LP;
	Guru99HomePage GHP;
	InsuranceProjectPage IPP;

	@Given("^User is on Guru(\\d+)Login page$")
	public void user_is_on_Guru_Login_page(int arg1) throws Throwable {
		LP = new Guru99LoginPage(driver);
	}

	@When("^user enters uname \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_uname_and_password(String uname, String pass) throws Throwable {

		LP.setUserName(uname);
		LP.setPassword(pass);
	}

	@When("^user clicks on login button of Guru(\\d+)Page$")
	public void user_clicks_on_login_button_of_Guru_Page(int arg1) throws Throwable {
		LP.clickLogin();
	}

	@Then("^HomePage gets opened$")
	public void homepage_gets_opened() throws Throwable {
		GHP = new Guru99HomePage(driver);
		String homepageUserName = GHP.getHomePageDashboardUserName();
		System.out.println(homepageUserName);
	}

	@Then("^click on InsuranceProject link$")
	public void click_on_InsuranceProject_link() throws Throwable {
		IPP = new InsuranceProjectPage(driver);
		IPP = GHP.clickonInsuranceProjLink();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	}
}
