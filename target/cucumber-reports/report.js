$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launches the application",
  "keyword": "When "
});
formatter.step({
  "name": "enters username as \"\u003cuser\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "password as \"\u003cpwd\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.step({
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pwd"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to application",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the application",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_launches_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters username as \"admin@yourstore.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "login.login_should_be_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});