@heroku-regression
Feature: Heroku Feature

  Background:
    Given I am on home page

    @heroku-1-search
    Scenario: Verify "Title: I will teach you IOS" as displayed result
      When I search on top search bar with text "ios"
      Then I verify "Title: I will teach you IOS" as displayed result

    @heroku-2-login-successful
    Scenario: Verify valid login
      When I enter username as “n12345@test.com” and password as “123456”
      And I click on submit button
      Then I verify Logout button is displayed

    @heroku-3-valid-registration
    Scenario: Verify a new user can register with a valid email address
      Given I am on registration page
      When I enter name as "testuser" email as "test@test.com" password as "test12345"
      And I click 'submit' button
      Then  I am signed-in as a new user

    @heroku-4-invalid-email
    Scenario Outline: Verify invalid email on registration
      Given I am on registration page
      When I enter name as "testuser" email as "<email>" password as "test12345" test
      And I click 'submit' button
      Then  I verify invalid email address

      Examples:
      | email |
      | test.com |
