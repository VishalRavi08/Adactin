$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Application",
  "description": "",
  "id": "adactin-hotel-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Functionality",
  "description": "",
  "id": "adactin-hotel-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launchs The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enters The Username In The InputBox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enters The Password In The InputBox",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Clicks The LoginButton And It Navigates To the SearchHotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launchs_The_Adactin_Application()"
});
formatter.result({
  "duration": 6599099300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Username_In_The_InputBox()"
});
formatter.result({
  "duration": 145833900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enters_The_Password_In_The_InputBox()"
});
formatter.result({
  "duration": 74449100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Clicks_The_LoginButton_And_It_Navigates_To_the_SearchHotelPage()"
});
formatter.result({
  "duration": 1878302800,
  "status": "passed"
});
});