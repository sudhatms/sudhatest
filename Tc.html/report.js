$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the following functionalities on HomePage",
  "description": "1.Verify Home Tab is displayed",
  "id": "validate-the-following-functionalities-on-homepage",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "that user should launch the browser and enter \"url\"",
  "rows": [
    {
      "cells": [
        "http://server/bank"
      ],
      "line": 5
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 47
    }
  ],
  "location": "Tc_01_HomeTabDisplay_Validation.that_user_should_launch_the_and_enter(String,DataTable)"
});
