Feature: Aviva application flow --> LI = Proposer

  Background: Aviva application login verification
    Given Im on aviva login page
    Then I Entered the EmployeeID
    And I Entered the Password
    And I click on Login button
    Then Home Page of the Aviva application is successfully opened

  Scenario: Adding a new Lead - Status TAB
    Then I clicked on the Plus Icon in the aviva home page to add a new lead
    And Clicked on Add a new lead button above of the Plus icon
    And I Entered Mobile No. in Status tab -->About the Customer
    And I Entered Email ID in Status tab -->About the Customer
    And I Selected checkbox Proceed with e-KYC in Status tab -->About the Customer
    And I Entered the Adhar number
    And I clicked on Verify button
    And I wait for 20 sec to enter the otp
    And I Clicked on the Submit button Status tab --> Status

  Scenario: Adding a new lead - Lead Details TAB
    Then Clicked on self or Reference item in Lead Cart - Aviva home page
    And Click on Update button in Lead cart page
    And Clicked on lead details tab
    And Selected the title from the dropdown- Lead details tab- Personal details section

    And Selected the Marital Status- Lead details tab- Personal details section
    And I Clicked on Proceed button in Lead details tab- Personal details section
    And Selected the Country in Lead details tab- Contact details section
    And Selected the State in Lead details tab- Contact details section
    And Selected the City in Lead details tab- Contact details section
    And Clicked on Proceed button in Lead details tab- Contact details section
    And Selected the Educational Qualification in Lead details tab- Professional details section
    And Selected the Profession Type in Lead details tab- Professional details section
    And Selected the Income Group in Lead details tab- Professional details section
    And Clicked on Proceed button in Lead details tab- Professional details section
    And Selected the Smoking Status in Lead details tab- Additional details section
    And Clicked on Proceed button in Lead details tab- Additional details section
    And Selected the Age of Life Insured or Policy Holder in Need Analysis tab
    And Selected the Occupation of Life Insured or Policy Holder in Need analysis tab
    And Selected the Priority 1 in Need Analysis tab
    And Selected the Risk Profile in Need analysis tab
    And Clicked on Submit in Need analysis tab


