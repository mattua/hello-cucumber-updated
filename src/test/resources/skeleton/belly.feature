Feature: Belly

  @status=dont_run_from_test_runner
  Scenario: a few cakes
    Given I have 42 cakes in my belly
    When I wait 1 hour
    Then my belly should growl

  @status=run_from_test_runner
  Scenario: dummy
    Given I drink 4 beers
    When I drive my car
    Then I lose my license

  Scenario Outline: Simple Google searches
    Given a web browser is on the Google page
    When the search phrase "<phrase>" is entered
    Then results for "<phrase>" are shown

    Examples: Animals
      | phrase   |
      | panda    |
      | elephant |
      | rhino    |