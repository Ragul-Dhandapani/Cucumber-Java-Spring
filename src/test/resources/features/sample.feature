Feature: Testing the Cucumber Java Spring Based Project

  Scenario Outline: Greet the user and provide the funds
    Given Greet the user with his name "<name>"
    When Retrieve the balance from account
    Then Donate the funds to user

    Examples:
      | name  |
      | Ragul |