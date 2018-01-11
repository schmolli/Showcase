Narrative:
  In order to work on shipments
  As a transport specialist
  I want to see a list of current shipments
  

Scenario: List open shipments with 5 shipments
Given There are 5 shipments
When I show the list of current shipments
Then I see 5 shipments

Scenario: List open shipments without shipments
Given There are no open shipments
When I show the list of current shipments
Then I see an empty list

Scenario: List open shipments with 1 shipment
Given There is 1 shipment
When I show the list of current shipments
Then I see 1 shipment
