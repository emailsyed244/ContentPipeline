$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/scenario_background_tests.feature");
formatter.feature({
  "line": 1,
  "name": "Test allure report with key words \"Scenario\" and \"Background\"",
  "description": "",
  "id": "test-allure-report-with-key-words-\"scenario\"-and-\"background\"",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15537150,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I set variable A as \"100\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I set variable B as \"23\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 21
    }
  ],
  "location": "CommonSteps.iSetVariableAAs(int)"
});
formatter.result({
  "duration": 427828743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23",
      "offset": 21
    }
  ],
  "location": "CommonSteps.iSetVariableBAs(int)"
});
formatter.result({
  "duration": 147770,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check sum",
  "description": "",
  "id": "test-allure-report-with-key-words-\"scenario\"-and-\"background\";check-sum",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@SeverityLevel.BLOCKER"
    },
    {
      "line": 6,
      "name": "@TestCaseId(\"example-99\")"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I perform A plus B",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "result value should be \"123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonSteps.iPerformAPlusB()"
});
formatter.result({
  "duration": 62427,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 24
    }
  ],
  "location": "CommonSteps.summaShouldBe(int)"
});
formatter.result({
  "duration": 9892270,
  "status": "passed"
});
formatter.after({
  "duration": 45437,
  "status": "passed"
});
formatter.uri("features/test.feature");
formatter.feature({
  "line": 1,
  "name": "As a Content Pipeline user, I want to verify the table counts of Staging DB with CFDB,",
  "description": "        so I can use them with confidence",
  "id": "as-a-content-pipeline-user,-i-want-to-verify-the-table-counts-of-staging-db-with-cfdb,",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1248140,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check the Counts for Company, ConfReport and Corp Public in Count_Test_Suite01,Count_Test_Suite02 test suites",
  "description": "",
  "id": "as-a-content-pipeline-user,-i-want-to-verify-the-table-counts-of-staging-db-with-cfdb,;check-the-counts-for-company,-confreport-and-corp-public-in-count-test-suite01,count-test-suite02-test-suites",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "batch file \"\" has been setup for testing data",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the batch files runs in the environment",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "it should be successful",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 12
    }
  ],
  "location": "CommonSteps.batch_file_has_been_setup_for_testing_data(String)"
});
formatter.result({
  "duration": 4295988,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.the_batch_files_runs_in_the_environment()"
});
formatter.result({
  "duration": 184910,
  "status": "passed"
});
formatter.match({
  "location": "CommonSteps.it_should_be_successful()"
});
formatter.result({
  "duration": 357175,
  "status": "passed"
});
formatter.after({
  "duration": 135522,
  "status": "passed"
});
});