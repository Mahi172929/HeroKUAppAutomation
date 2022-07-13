$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/HeroKUApp/Features/HeroKuApp.feature");
formatter.feature({
  "name": "Verify Various Scenarios on HeroKUAPP page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Navigate to HeroKuApp",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home page of HeroKUAPP",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.user_is_on_home_page_of_HeroKUAPP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Available Examples\" Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.available_Examples_Page_is_Displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Data table functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@latest"
    }
  ]
});
formatter.step({
  "name": "User navigate to \"Sortable Data Tables\" Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.user_navigate_to_Multiple_Windows_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see the \"Data Tables\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.user_is_able_to_see_the_data_table(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the data table functionalities",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.verify_the_data_table_functionalities()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the a row with \"Smith\" , \"John\", \"jsmith@gmail.com\",\"$50.00\", \"http://www.jsmith.com\" exists on the table",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.verify_the_a_row_with_exists_on_the_table(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});