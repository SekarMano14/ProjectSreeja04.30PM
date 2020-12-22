@E2E
Feature: To validate the login functionality of Facebook

  @Smoke @Regression
  Scenario Outline: To validate fb login with invalid credientials
    Given The user should be in Fblogin page
    When The has to be fill "<username>" and "<password>"
    And The user has to click login button
    Then The user sshould be in invalid login Page

    Examples: 
      | username | password |
      | manoj    |     1252 |

  @Sanity 
  Scenario: To validate the registration Functionality
    Given The user should be in Fblogin page
    When The user  has to fill the firstname, lastname and details
    Then The user successfull registered

  @Regression
  Scenario: To validate the payments
    Given The user should be in Fblogin page
    When The user  has to fill the firstname, lastname and details
    Then The user successfull registered
