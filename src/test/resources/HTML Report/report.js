$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "To validate the login functionality of Facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@E2E"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate fb login with invalid credientials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "The user should be in Fblogin page",
  "keyword": "Given "
});
formatter.step({
  "name": "The has to be fill \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user has to click login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user sshould be in invalid login Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "manoj",
        "1252"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate fb login with invalid credientials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@E2E"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in Fblogin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_Fblogin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The has to be fill \"manoj\" and \"1252\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_has_to_be_fill_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user sshould be in invalid login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_sshould_be_in_invalid_login_Page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.stepdefinition.LoginSteps.the_user_sshould_be_in_invalid_login_Page(LoginSteps.java:38)\r\n\tat ✽.The user sshould be in invalid login Page(file:src/test/resources/Features/login.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});