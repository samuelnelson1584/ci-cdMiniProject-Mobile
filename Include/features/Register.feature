Feature: Register
  As user,
  I have be able to register,
  So I can login with my account

  Scenario Outline: User sucessfully register
    Given I am on home page
    When I click Login page button
    And I click Register page button
    And I input new fullname <fullname>
    And I input new username <username>
    And I input new password <password>
    And I click Register button
    Then I am on homepage

    Examples: 
      | fullname | username          | password   |
      | dedennn  | dedennn@dmail.com | dedennn123 |

  Scenario Outline: User register with existing account
    Given I am on home page
    When I click Login page button
    And I click Register page button
    And I input new fullname <fullname>
    And I input new username <username>
    And I input new password <password>
    And I click Register button
    Then I am on Register page

    Examples: 
      | fullname | username        | password |
      | Ujang    | ujang@umail.com | ujang123 |
