Feature: Dashboard Language Switch
  @All
  Scenario: Validate dashboard elements in French language after language switch
   When user is on dashboard page able to view "Voir le Tableau de Bord"
   Then user validate all dashboard page elements
   |Element|Text|
   |Hi     |Salut|
   |UserName|Automated|
   |Risk Notes|Notes de Risque|
   |Tax Invoices|Factures Fiscales|
   |Receipts|Reçus|
   |Claims|Réclamations|
   |Renewals|Renouvellements|
   |Reports|Rapports|
   
  