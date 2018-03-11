Feature: Calculate the total amount due by the customer once they have selected the products they would like to purchase

  Scenario: A customer has chose two products to purchase and wishes to checkout
    Given the customer has chosen a bag of apples at 20.00 rand each
    And the customer has chosen a bag of crisps at 7.00 rand each
    And the current month is JANUARY
    When the customer chooses to checkout
    Then return a total amount due of 27.00 rand

  Scenario: A customer picks up two loaves of bread (R12.99 each) and a 2l bottle of soda (R14.99 rand each) and chooses to checkout
    Given the customer has chosen 2 loaves of bread at 20.00 rand each
    And the current month is SEPTEMBER
    And the customer has chosen a 2l bottle of soda at 14.99 rand each
    When the customer chooses to checkout
    Then return a total amount due of 54.99 rand

#  The product owner has requested new functionality to be added that caters for a “two for the price of one” special offer on all chocolate bars during the month of September.
#
#  You will need to:
#  Create the scenarios (more than one) in the feature file using gherkin syntax
#  Implement the glue code that matches the gherkin syntax
#  Use TDD to implement the code that will make your test pass

  Scenario: A customer picks up two chocolate bars during the month of September and chooses to checkout
    Given the customer has chosen 2 chocolate bars at 10.00 rand each
    And the current month is SEPTEMBER
    When the customer chooses to checkout
    Then return a total amount due of 10.00 rand

  Scenario: A customer picks up two chocolate bars during the month of August and chooses to checkout
    Given the customer has chosen 2 chocolate bars at 10.00 rand each
    And the current month is AUGUST
    When the customer chooses to checkout
    Then return a total amount due of 20.00 rand

  Scenario: A customer picks up 3 chocolate bars during the month of September
    Given the customer has chosen 3 chocolate bars at 10.00 rand each
    And the current month is SEPTEMBER
    When the customer chooses to checkout
    Then return a total amount due of 20.00 rand

  #  A customer got 1.5 kg of chicken from the butchery section @R32.90/kg and chooses to checkout
 # Scenario: A customer got 1.5 kg of chicken from the butchery section @R32.90/kg and chooses to checkout
 #   Given the customer has chosen 1.5 kg of chicken at 32.90 rand per kilogram
 #   When the customer chooses to checkout
 #   Then return a total amount due of 49.35 rand
