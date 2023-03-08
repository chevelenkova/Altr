
Feature: As a data consumer, I want to know the oldest character from the Sherlock Holmes novel

  @test3
  Scenario: verify the character's full name with the oldest age
    Given establish the database connection
    When execute query to find the oldest character
    Then verify "John Watson" is the oldest character in the book
