$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/001login.feature");
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
formatter.uri("src/test/features/Customer_Management.feature");
formatter.feature({
  "name": "Add a customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login to application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to dashboard and click on add customer button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have already logged into application",
  "keyword": "Given "
});
formatter.match({
  "location": "dashboard.i_have_already_logged_into_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Parent customer link",
  "keyword": "When "
});
formatter.match({
  "location": "dashboard.i_click_on_Parent_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on child customer link",
  "keyword": "And "
});
formatter.match({
  "location": "dashboard.i_click_on_child_customer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add Customer button should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "dashboard.add_Customer_button_should_be_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Add details in customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Add new customer button",
  "keyword": "When "
});
formatter.step({
  "name": "I enter Email as \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter FirstName as \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter LastName as \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select Gender",
  "keyword": "And "
});
formatter.step({
  "name": "I enter  DOB as \"\u003cdob\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on save",
  "keyword": "And "
});
formatter.step({
  "name": "New customer should be added",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "firstname",
        "lastname",
        "dob",
        "newsletter"
      ]
    },
    {
      "cells": [
        "ManSinghvi124@gmail.com",
        "manu123",
        "Manu",
        "Singhvi",
        "06/13/1970",
        "Your store name"
      ]
    },
    {
      "cells": [
        "rkapoor124@gmail.com",
        "rkapoor",
        "Raj",
        "kapoor",
        "12/14/1924",
        "Your store name"
      ]
    }
  ]
});
formatter.background({
  "name": "Login to application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Add details in customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Add new customer button",
  "keyword": "When "
});
formatter.match({
  "location": "addCustomer.i_click_on_Add_new_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Email as \"ManSinghvi124@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_Email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Password as \"manu123\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_Password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter FirstName as \"Manu\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_FirstName_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter LastName as \"Singhvi\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_LastName_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Gender",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_select_Gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter  DOB as \"06/13/1970\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_DOB_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on save",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_click_on_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New customer should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "addCustomer.new_customer_should_be_added()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Login to application",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Add details in customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I click on Add new customer button",
  "keyword": "When "
});
formatter.match({
  "location": "addCustomer.i_click_on_Add_new_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Email as \"rkapoor124@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_Email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Password as \"rkapoor\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_Password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter FirstName as \"Raj\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_FirstName_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter LastName as \"kapoor\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_LastName_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Gender",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_select_Gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter  DOB as \"12/14/1924\"",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_enter_DOB_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on save",
  "keyword": "And "
});
formatter.match({
  "location": "addCustomer.i_click_on_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New customer should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "addCustomer.new_customer_should_be_added()"
});
formatter.result({
  "status": "passed"
});
});