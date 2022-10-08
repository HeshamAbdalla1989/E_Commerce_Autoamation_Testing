@smoke
Feature: F04_Search | User will be able to search for products with different parameters
Scenario Outline: User could search using product name
When user clicks on search field
And  user search with "<productName>"
Then user could find "<productName>" relative results
  Examples:
    |productName|
    |book|
    |labTop|
    |Nike|

  Scenario Outline: User could search for product using sku
    When user clicks on search field
    And  user search with "<sku>"
    Then user could find "<sku>" inside product detail page
    Examples:
      |sku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|
