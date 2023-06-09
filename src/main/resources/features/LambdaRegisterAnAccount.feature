#@lambda
Feature: 3101-Register an account
  As a User
  I want to be able to create an account
  So that I can purchase items on the lambdatest website
#  @lambda
  Scenario: Register Page is dispayed when Register link in clicked
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on MyAccount Menu
    And I click on Continue under the New Customer
    Then the Register Account page should be displayed

#  @lambda
  Scenario: Register Page is dispayed when Register link in clicked
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on MyAccount Menu
    And I click on Continue under the New Customer
    And I enter valid details for First Name as "Lateef", Last Name as "Abdul", E-mail as "lat1@email.com", Telephone as "0788383838", Password as "123Pasword!"
    And I accept the privacy policy
    And I click on Continue button on the Register and Account page
    Then Register Confirmation page is displayed
#  @lambda
  Scenario: Mouse Hoover
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on Login from MyAccount Menu

#  @lambda
  Scenario: Mouse Hoover
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on rgeister from MyAccount Menu
    And I enter valid details for First Name as "Lateef", Last Name as "Abdul", E-mail as "lat1@email.com", Telephone as "0788383838", Password as "123Pasword!"

      @lambdaMose
  Scenario: Mouse Hoover with POM
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on rgeister from MyAccount Menu using pom
    And I enter valid details for First Name as "Lateef", Last Name as "Abdul", E-mail as "lat1@email.com", Telephone as "0788383838", Password as "123Pasword!"

  @lambdaKey
  Scenario: Keyboard actions
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I search for htc


#  @lambda
  Scenario: Demonstrate data table -Register Page is displayed when Register link is clicked
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on MyAccount Menu
    And I click on Continue under the New Customer
    And I enter valid details
      | field            | value          |
      | First Name       | Lateef         |
      | Last Name        | Abdul          |
      | E-mail           | lat1@email.com |
      | Telephone        | 0788383838     |
      | Password         | 123PWord!      |
      | Confirm Password | 123PWord!      |
    And I accept the privacy policy
    And I click on Continue button on the Register and Account page
    Then Register Confirmation page is displayed

  @lambda
  Scenario: Demonstrate data table with one column -Register Page is displayed when Register link is clicked
    Given I am on the Lambdatest home page "https://ecommerce-playground.lambdatest.io/"
    When I click on MyAccount Menu
    And I click on Continue under the New Customer
    And I enter valid details as follows
      | bod         |
      | Abdul          |
      | lat1@email.com |
      | 0788383838     |
      | 123PWord!      |
      | 123PWord!      |
    And I accept the privacy policy
    And I click on Continue button on the Register and Account page
    Then Register Confirmation page is displayed