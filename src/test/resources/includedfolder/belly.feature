Feature: Belly


  Scenario: Eating too many cakes
    Given I have 42 cakes in my belly
    When I wait 1 hour
    Then my belly should growl


  Scenario: Drinking beer
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

  @status=run_from_test_runner
  Scenario:
    This passes a table of values to the underlying clause
    Given the values below are passed
    |London|
    |Milan |
    |Zurich|
    When I choose the city
    Then I say Hello


      Scenario Outline: doubler
      Test mutplier function
      Given I have my doubler function
      When an <inputnumber> is entered
      Then the <outputnumber> is shown

      Examples: Numbers
      |inputnumber|outputnumber|
      |3          |6            |
      |4          |8            |