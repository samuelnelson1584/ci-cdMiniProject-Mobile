Feature: Login
  As User,
  I have be able to login to my account
  So I can see do transaction

  Scenario Outline: User login with valid account
    Given I am on home page
    When I click Login page button
    And I input username <username>
    And I input password <password>
    And I click Login button
    Then I am on homepage

    Examples: 
      | username        | password |
      | ujang@umail.com | ujang123 |

  Scenario Outline: User login with invalid password
    Given I am on home page
    When I click Login page button
    And I input username <username>
    And I input password <password>
    And I click Login button
    Then I am on Login page

    Examples: 
      | username        | password |
      | ujang@umail.com | 12311232 |

      