@smoke
Feature:F08| Users be able to add products to wish List

  Scenario: user will click on wishlist icon in the third product to add it to wishlist
    Given user click on wishlist icon
    Then  user assert that product added successfully


  Scenario: user will click on wishlist icon in the third product to add it to wishlist
    Given user click on wishlist icon
    When  user will use explicit Wait until message disappeared
    And  user click on Wishlist Tab on the top of the page
    Then user should get Qty value and verify it's bigger than 0