Feature: As a Content Pipeline user, I want to verify the table counts of Staging DB with CFDB,
          so I can use them with confidence

  Scenario: Check the Counts for Company, ConfReport and Corp Public in Count_Test_Suite01,Count_Test_Suite02 test suites
    Given batch file "" has been setup for testing data
    When the batch files runs in the environment
    Then it should be successful