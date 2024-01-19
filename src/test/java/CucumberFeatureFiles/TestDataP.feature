
  Feature: Registeration form

    Scenario: verify user able to enter all required details
      Given user is navigated to registartion form
      When user enter the following details
          |Sanganagouda | Bhavikatti |Gondabal |
          |Manjunath    | Meti       |sira     |
      Then click on submit button


