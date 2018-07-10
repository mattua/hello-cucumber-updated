Feature: This feature file is inside an ignored folder and so will not be executed from the runner
All the scenrios in here will be ignored regardless of tag value

  @status=run_from_test_runner
  Scenario: a few more cakes
    Given I have 42 cakes in my belly
    When I wait 1 hour
    Then my belly should growl

  @status=run_from_test_runner
  Scenario: dummy2
    Given I drink 4 beers
    When I drive my car
    Then I lose my license