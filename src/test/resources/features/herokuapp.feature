@heroku-regression
Feature: Heroku search Feature

  Background:
    Given I am on home page

    @heroku-1-search
    Scenario: Verify "Title: I will teach you IOS" as displayed result
      When I search on top search bar with text "ios"
      Then I verify "Title: I will teach you IOS" as displayed result

    @heroku-2-login
    Scenario: Verify valid login
      When I enter username as “n12345@test.com” and password as “123456”
      And I click on submit button
      Then I verify Logout button is displayed