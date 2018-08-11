$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginGuru99/Login_to_Guru99website.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Guru99 website",
  "description": "",
  "id": "login-to-guru99-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 207060,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to login to Guru99 website",
  "description": "",
  "id": "login-to-guru99-website;user-should-be-able-to-login-to-guru99-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Guru99Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters uname \"mgr123\" and password \"mgr!23\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login button of Guru99Page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "HomePage gets opened",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on InsuranceProject link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "99",
      "offset": 15
    }
  ],
  "location": "UIStepDef.user_is_on_Guru_Login_page(int)"
});
formatter.result({
  "duration": 6994811913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mgr123",
      "offset": 19
    },
    {
      "val": "mgr!23",
      "offset": 41
    }
  ],
  "location": "UIStepDef.user_enters_uname_and_password(String,String)"
});
formatter.result({
  "duration": 304166222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99",
      "offset": 35
    }
  ],
  "location": "UIStepDef.user_clicks_on_login_button_of_Guru_Page(int)"
});
formatter.result({
  "duration": 1079112304,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.homepage_gets_opened()"
});
formatter.result({
  "duration": 77701266,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.click_on_InsuranceProject_link()"
});
formatter.result({
  "duration": 1637574228,
  "status": "passed"
});
formatter.match({
  "location": "UIStepDef.close_the_browser()"
});
formatter.result({
  "duration": 171539331,
  "status": "passed"
});
formatter.after({
  "duration": 105761,
  "status": "passed"
});
});