@All
Feature: Dashboard Language Switch   
     
     Scenario: Validate dashboard elements in Swahili language after language switch
       When user is on dashboard page able to view "Angalia Dashibodi"
       Then user validate all dashboard page elements
           |Element      |Text|
           |Hi           |Habari|
           |UserName     |Automated|
           |Risk Notes   |Vidokezo vya Hatari|
           |Tax Invoices |Ankara za Ushuru|
           |Receipts     |Risiti|
           |Claims       |Madai|
           |Renewals     |Upyaishaji|
           |Reports      |Ripoti|
     