Feature: Shopping and Checkout

Scenario: Home page Landing "https://www.kurtgeiger.es/"
Given I am on the homepage
When I select "brand" category from the header
Then I should see the list of brands
And I select "DKNY" brand from the list
Then I should see the list of products from "DKNY"

Scenario: Men Category list of products
Given I am on the homepage
And I select men category from the header
Then I should see the list of products
When I hover over a main navigation item
Then I should see an advert from "KG Kurt Geiger"
And I select a sub navigation link from the drop down
Then I should see another list of products

Scenario: PDP and Proceed to checkouts
Given I select men category from the header
And I am on PDP
When I select any "colour" and "size" for the chosen men category
And I add the product to the bag
Then I can see the bag with single item
And I click 'Proceed to Checkout'
Then I should be on checkout page