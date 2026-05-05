Feature: Login functionality

  Scenario Outline: successful login with valid credentials
    Given the user is on the login page
    When the user logs in with username "<username>" and password "<password>"
    Then the user should be redirected to the home page

    Examples:
      | username       | password |
      | Admin          | admin123 |
      | yesh@gmail.com | +++++++  |
