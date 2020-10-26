Feature: Flipkart login

@sanity
 Scenario: Order an Iphone
  Given I launch browser 
  When Open Flipkart and login as "9791016357" and password as "vicky@1995"
  Then Search for "iphone 11" and select iphone
  And Add to kart and proceed to home
  Then view the kart 
  Then close browser 
  