

 @all
Feature: ProjectMenu

  Background:
   Given  navigate to FireFlink Product
    And Login with valid Credentials & land on ProjectMenu page

    @smoke
  Scenario: verify_userAble_to_Create_WebProject
    Given  Click on create project button and provide necessary details and create a project and Click on create button
    When   Validate the created project and delete the project
    Then  Created project should get deleted with proper successful banner message

    @smoke
    Scenario: verify_userAble_to_Create_WebserviceProject
      Given Click on create project button and provide necessary details and create a web service  project and Click on create button
      When  Validate the created web service project and delete the project
      Then  Created web service project should get deleted with proper successful banner message


    @sanity
    Scenario: verify_userAble_to_Create_SalesforceProject
    Given  Click on create project button and provide necessary details and create a sales force project and Click on create button
    When   Validate the created  sales force project and delete the project
    Then  Created  sales force project should get deleted with proper successful banner message