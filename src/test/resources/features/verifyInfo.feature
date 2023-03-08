
Feature: Verify info stored correctly to DB

  Background: Establish DB connection
    Given establish the database connection

  @test1
  Scenario: Verify characters info stored correctly in DB
    When Execute query to get all IDS from users
    Then verify all users has unique ID

  @test2
  Scenario: verify book table columns
    When Execute query to get all columns
    Then verify the below columns are listed in result
      | characterId |
      | firstName  |
      | lastName   |
      | occupation  |
      | age        |

