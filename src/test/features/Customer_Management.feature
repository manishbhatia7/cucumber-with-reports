Feature: Customer Management
  Customer Management includes adding a customer,searching a customer for deletion and then deleting the customer
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
      |ManSinghvi133@gmail.com    |    manu123         | Manu               |      Singhvi      |   06/13/1970 |   Your store name |
      |rkapoor133@gmail.com       |    rkapoor         | Raj                    |      kapoor       |   12/14/1924     |   Your store name |

  Scenario Outline: Delete Details in customer
    When I type "<email>" in Email textbox
    And  click on search button
    Then I should be able to click on edit button
    And click on Delete button
    And on alert confirm the deletion

    Examples:
      | email                  |
      |ManSinghvi133@gmail.com |
      |rkapoor133@gmail.com    |

  Scenario Outline: Assert That Delete is successful
    And I type "<email>" second time in Email textbox
    Then record should be deleted

    Examples:

      | email                  |
      |ManSinghvi133@gmail.com |
      |rkapoor133@gmail.com    |