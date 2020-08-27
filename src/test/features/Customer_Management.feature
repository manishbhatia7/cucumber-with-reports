Feature: Add a customer
  Background: Login to application
  Scenario:Navigate to dashboard and click on add customer button
    Given I have already logged into application
    When  I click on Parent customer link
    And   I click on child customer link
    Then  Add Customer button should be visible


  Scenario Outline: Add details in customer
    When I click on Add new customer button
    And  I enter Email as "<email>"
    And  I enter Password as "<password>"
    And  I enter FirstName as "<firstname>"
    And  I enter LastName as "<lastname>"
    And  I select Gender
    And  I enter  DOB as "<dob>"
    And  I click on save
    Then New customer should be added

    Examples:
      | email                     |  password         | firstname           |      lastname     |     dob       |   newsletter      |
      |ManSinghvi125@gmail.com    |    manu123         | Manu               |      Singhvi      |   06/13/1970 |   Your store name |
      |rkapoor125@gmail.com       |    rkapoor         | Raj                    |      kapoor       |   12/14/1924     |   Your store name |