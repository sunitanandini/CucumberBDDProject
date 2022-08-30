Feature: Login

Scenario: Successful Login With valid Credentials
   Given User launch Chrome Browser
   When User opens URL "https://admin-demo.nopcommerce.com/login"
   And User enters Email as "admin@yourstore.com" and Password as "admin"
   #here we are using hardcode email n pwd.
   And Click on login
   Then Page Title should be "Dashboard / nopCommerce administration"
   When User click on log out link
   Then Page title should be "Your store. Login" 
   And Close Browser 
 
 ##@SmokeTest
 Scenario Outline: Successful Login With valid Credentials DDT
   Given User launch Chrome Browser
   When User opens URL "https://admin-demo.nopcommerce.com/login"
   And User enters Email as "<email>" and Password as "<password>"
   And Click on login
   Then Page Title should be "Dashboard / nopCommerce administration"
   When User click on log out link
   Then Page title should be "Your store. Login" 
   And Close Browser 
   
   Examples:
   #Variables ko data provide karane k liye hum Examples likhte hain
   |email||password|     
   #here we are running our code with given email n password, here it will run 2 times because we have
   #given 2 different input set values for email n password
   |admin@yourstore.com||admin|
   |test@yourstore.com||admin|
   
   #Total it will run 3 times

   