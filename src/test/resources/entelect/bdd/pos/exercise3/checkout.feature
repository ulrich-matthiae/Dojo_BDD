Feature: Calculate the total amount due by the customer once they have selected the products they would like to purchase

  Scenario: A customer has chose two products to purchase and wishes to checkout
    Given the customer has chosen a bag of apples at 20.00 rand each
    And the customer has chosen a bag of crisps at 7.00 rand each
    When the customer chooses to checkout
    Then return a total amount due of 27.00 rand

  Scenario: A customer picks up two loaves of bread (R12.99 each) and a 2l bottle of soda (R14.99 rand each) and chooses to checkout
    Given the customer has chosen 2 loaves of bread at 12.99 rand each
    And the customer has chosen a 2l bottle of soda at 14.99 rand each
    When the customer chooses to checkout
    Then return a total amount due of 40.97 rand

#  The product owner has requested new functionality to be added that caters for a “two for the price of one” special offer on all chocolate bars during the month of September.
#  Chocolate bars cost R10
#
#  You will need to:
#  Create the scenarios (more than one) in the feature file using gherkin syntax
#  Implement the glue code that matches the gherkin syntax
#  Use TDD to implement the code that will make your test pass
