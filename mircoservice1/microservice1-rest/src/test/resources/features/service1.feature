Feature: Process microservice 1

  Scenario: 1 - Call service 1 business
    When call service1 serviceMethod cucumber

  Scenario: 2 - Call service 1 rest
    When call service1 controllerMethod cucumber