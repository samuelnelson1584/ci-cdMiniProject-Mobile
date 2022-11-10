Feature: Transaction
  As user, 
  I have be able to add product to cart
  So I can buy product

  Scenario: User add  product to cart
    Given I am on home page
    When I click beli button
    Then I see item added to cart
