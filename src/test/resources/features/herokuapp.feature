@heroku-regression
Feature: Heroku search Feature

  Background:
    Given I am on home page

    @heroku-1
    Scenario: Verify "Title: I will teach you IOS" as displayed result
    When I search on top search bar with text "ios"
    Then I verify "Title: I will teach you IOS" as displayed result
