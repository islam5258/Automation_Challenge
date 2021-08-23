Feature: End To End Functionality

  Scenario: Buy A Product
    Given User open browser and navigate to the url
    And User is on homePage and search for men shoes
    And User click on the shoes
    When User select color
    And User select size
    Then User add the iteam into the cart
