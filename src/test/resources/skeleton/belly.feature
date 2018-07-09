Feature: Belly


  Scenario: a few cakes
    Given I have 42 cakes in my belly
    When I wait 1 hour
    Then my belly should growl


  Scenario: dummy
    Given I drink 4 beers
    When I drive my car
    Then I lose my license

  @status=run_from_test_runner
  Scenario Outline: Simple Google searches
    This example shows how it's possible to use examples tables.
    Cucumber will run the scenario once for each row in the table
    and use the parameters in the clauses.
    Given a web browser is on the Google page
    When the search phrase "<animal>" is entered
    Then results for "<animal>" are shown with the "<exctinct>"

    Examples: Animals
      | animal   | exctinct |
      | panda    | yes      |
      | elephant | no       |
      | rhino    | yes      |