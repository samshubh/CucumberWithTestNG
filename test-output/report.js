$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/vt1056.SRITADS/eclipse-workspace/CucumberWithTestNG/src/main/java/com/qa/feature/testng.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login test",
  "description": "",
  "id": "free-crm-application-testing;login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "title of the page is Free CRM",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enters email and password",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "subhambiswas895@gmail.com",
        "Welcome123$"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify the user name",
  "keyword": "Then "
});
formatter.match({
  "location": "TestNGExample.title_of_the_page_is_Free_CRM()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestNGExample.user_is_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestNGExample.clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestNGExample.enters_email_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestNGExample.verify_the_user_name()"
});
formatter.result({
  "status": "skipped"
});
});