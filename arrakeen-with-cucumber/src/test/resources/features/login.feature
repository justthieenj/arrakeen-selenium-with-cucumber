@login
Feature: Login to make an appointment

  Scenario: User login to make an appointment
    Given I am on the home page
    When I click on the login button
    And I login with valid credentials
    Then Text Make Appointment should be displayed