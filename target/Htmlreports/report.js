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
  "name": "Verify the child window text and Parent winow text",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate to \"Multiple Windows\" Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.user_navigate_to_Multiple_Windows_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \"Click Here\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.click_on_Click_Here(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New Child window opened",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.new_Child_window_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Text \"New Window\" at Child Window",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.verify_the_Text_at_Child_Window(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Switch to Main window and Verify \"Opening a new window\" Text",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.HeroKUAppStepDefinations.switch_to_Main_window_and_Verify_Text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});