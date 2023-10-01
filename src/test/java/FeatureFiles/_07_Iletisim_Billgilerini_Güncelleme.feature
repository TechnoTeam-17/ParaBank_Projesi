Feature: User can update contact information

 +

  Background:



  Scenario: Updating profile contact information

    Given the user is on the profile page
    When the user clicks the "Edit Profile" option
    And enters the new address as "New Address, City, Country"
    And enters the new phone number as "555-555-5555"
    And updates other contact information
    And clicks the "Save" button