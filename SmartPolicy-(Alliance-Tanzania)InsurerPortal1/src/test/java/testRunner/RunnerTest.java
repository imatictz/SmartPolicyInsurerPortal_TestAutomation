package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(  
		           features="src/test/resources/Quotations/MoneyInsuranceCover.feature", 
                   tags= {"@All"}, 
                   glue={"cucumberMap1MoneyInsuranceCover","MyHooks"}, 
                   monochrome=true, 
                   strict=true, 
                   plugin= "pretty",   
                   dryRun=false 
                 )

public class RunnerTest 
{     
	
}

//         feature                                     |      glue                        |tags
// 1)IntermediaryCommission/  VoucherBase              |IntermediaryCommission            |@All
// 2)InDirectPremium                                   |PremiumCollection                 |@All
// 3)NonComplianceApproval                             |PendingApprovalsNonCompliance     |@All
// 4)ClaimApproval     (Provide Risk No)               |PendingApprovalsClaimApproval     |@All
// 5)DelayedTaxInvoicesApproval                        |PendingApprovalsDelayedTax        |@All
// 6)ManageClaims     (Provide Risk No)                |ManageClaims                      |@ManageClaims
// 7)ManageBids                                        |SalvageBidding                    |@All
// 8)BankAccountGLMapping                              |BankAccountGLMapping              |@All
// 9)DownloadRiskNotesTaxInvoices                      |DownloadRiskNotesTaxInvoices      |@All
//10)GlBatchPosting                                    |GlBatchPosting                    |@All
//11)BookProductionRequest /CoverNoteBooksAllotments   |ManualCoverNoteBooksControl       |@All
//12)BlackListedCustomers  /ClaimsRepository           |FraudControl                      |@All
//13)NotificationMaster                                |NotificationSetup                 |@All
//14)SmartAssistUpload                                 |SmartAssistUpload                 |@All





//PROBLEMS
//1)in voucher base no dropdown options provided
//2)in non compliance approval for bonds quotations broker partner name
//3)in bookproductionRequest enable printer dropdown options
//4)in CoverNoteBooksAllotments not able to click on add button




//1)In voucher base payment secheque start form 4
//2)manage bids no status is updating
//3)Account GL mapping screen error msg
//4)book production request screen
//5)claim repository screen
//6)not able to save notification master details 
//7)smartassist upload not able to view status as created