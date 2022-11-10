Feature: Logout
  As user,
  I have be able to Log out from my account
  So I can log in as another user

  Scenario: User Logout from an account
    Given I am already login
    When I click Logout button
    Then I am on homepage
