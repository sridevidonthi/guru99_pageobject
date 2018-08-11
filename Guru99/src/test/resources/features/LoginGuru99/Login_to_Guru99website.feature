Feature: Login to Guru99 website
  
Scenario: User should be able to login to Guru99 website 
	Given User is on Guru99Login page 
    When user enters uname "mgr123" and password "mgr!23"
    And user clicks on login button of Guru99Page
	Then  HomePage gets opened
	Then click on InsuranceProject link
    Then close the browser