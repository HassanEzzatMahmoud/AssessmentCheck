@Smoke
Feature: User can register when entering valid credentials
  Scenario Outline: User can register with valid mandatory fields
  Given User enters valid mandatory fields"<FirstName>","<LastName>","<Email>","<phone>","<CourseNumber>","<batchNumber>"
  When User Click register button
  Then User registered successfully

    Examples:
    |FirstName| LastName| Email| phone| CourseNumber| batchNumber|
    |hassan   |ezzat    |hassanezzat4@gmail.com|01060940018|selenium-automation|april|

