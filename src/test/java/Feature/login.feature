Feature: Test Automation for Adactin loginpage

  Scenario: login should pass and navigate to next
    Given user enter the userName as "rupeshdevendran"
    And user enter the Password as "rupesh123456789"
    When user click the login button
    Then user login should pass navigate to search hotel page
    And user should Select the location of the Hotel
    And user Should select the Hotel
    And user should Select Room type Required to stay
    And user should select Number of Rooms Required
    And user select the check In Date
    And user select the check out Date
    And user select Number of Adults per Room
    And user select Number of children per Room
    When user clicks the Search button
    Then user should navigate to SelectHotel page
    And user should select the selecthotel radiobtn
    When user click the continue button
    Then user should navigate to Book a Hotel page
    And user should enter the Firstname
    And user enters the lastname
    And user fills the Billing Address
    And user enters the Credit Card Number
    And user Selects the Credit Card type
    And user selects the Expiry date
    And User Selects the Expiry Month
    And user enters the CVV Number
    When user Clicks the Book Now button
    Then user Should navigate to Booking confirmation page
    And user should get oderid for Booking Confirmation
    When user should click the My Itinerary button
    Then user should navigate to Booked Itinerary page
    And user Selects the oder id 
    When user clicks the cancel selected button
    And user select the logout button to exit 
    Then user navigate to loggedout page to confirm
