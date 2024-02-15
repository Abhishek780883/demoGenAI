package com.genaidemo.demo.page;

import com.genaidemo.demo.annotation.LazyAutowired;
import com.genaidemo.demo.annotation.Page;
import com.genaidemo.demo.config.webElement.PageElement;
import com.genaidemo.demo.utility.Constants;
import com.genaidemo.demo.utility.TestUtility;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

@Page
@Slf4j
public class ContactUsPage extends GenericPage {
    @LazyAutowired
    private PageElement pageElement;
    @LazyAutowired
    private TestUtility testUtility;


    public boolean isAt() throws InterruptedException {
        return true;
    }

    public void goToCategory() throws InterruptedException {
        waitForPageLoad();
        String choose = this.mockTestData.returnCategory();
        if (choose.contains("Individual")) {
            conditionalWait(this.pageElement.getContactUsIndividual(), "presenceOfElementLocated");
            conditionalWait(this.pageElement.getContactUsIndividual(), "elementToBeVisible");
            conditionalWait(this.pageElement.getContactUsIndividual(), "elementToBeClickable");
            mouseHover(this.pageElement.getContactUsIndividual());
            highlightElement(this.pageElement.getContactUsIndividual());
            clickTheElementByXpath(this.pageElement.getContactUsIndividual());
        } else if (choose.contains("Business")) {
            conditionalWait(this.pageElement.getContactUsBusinessBrokers(), "presenceOfElementLocated");
            conditionalWait(this.pageElement.getContactUsBusinessBrokers(), "elementToBeVisible");
            conditionalWait(this.pageElement.getContactUsBusinessBrokers(), "elementToBeClickable");
            mouseHover(this.pageElement.getContactUsBusinessBrokers());
            highlightElement(this.pageElement.getContactUsBusinessBrokers());
            clickTheElementByXpath(this.pageElement.getContactUsBusinessBrokers());
        } else if (choose.contains("Media")) {
            conditionalWait(this.pageElement.getContactUsMediaPress(), "presenceOfElementLocated");
            conditionalWait(this.pageElement.getContactUsMediaPress(), "elementToBeVisible");
            conditionalWait(this.pageElement.getContactUsMediaPress(), "elementToBeClickable");
            mouseHover(this.pageElement.getContactUsMediaPress());
            highlightElement(this.pageElement.getContactUsMediaPress());
            clickTheElementByXpath(this.pageElement.getContactUsMediaPress());
        } else if (choose.contains("Investors")) {
            conditionalWait(this.pageElement.getContactUsInvestors(), "presenceOfElementLocated");
            conditionalWait(this.pageElement.getContactUsInvestors(), "elementToBeVisible");
            conditionalWait(this.pageElement.getContactUsInvestors(), "elementToBeClickable");
            mouseHover(this.pageElement.getContactUsInvestors());
            highlightElement(this.pageElement.getContactUsInvestors());
            clickTheElementByXpath(this.pageElement.getContactUsInvestors());
        } else if (choose.contains("Career")) {
            conditionalWait(this.pageElement.getConatctUsCareerSeek(), "presenceOfElementLocated");
            conditionalWait(this.pageElement.getConatctUsCareerSeek(), "elementToBeVisible");
            conditionalWait(this.pageElement.getConatctUsCareerSeek(), "elementToBeClickable");
            mouseHover(this.pageElement.getConatctUsCareerSeek());
            highlightElement(this.pageElement.getConatctUsCareerSeek());
            clickTheElementByXpath(this.pageElement.getConatctUsCareerSeek());
        } else if (choose.contains("General")) {
            conditionalWait(this.pageElement.getContaxtUsGeneral(), "presenceOfElementLocated");
            conditionalWait(this.pageElement.getContaxtUsGeneral(), "elementToBeVisible");
            conditionalWait(this.pageElement.getContaxtUsGeneral(), "elementToBeClickable");
            mouseHover(this.pageElement.getContaxtUsGeneral());
            highlightElement(this.pageElement.getContaxtUsGeneral());
            clickTheElementByXpath(this.pageElement.getContaxtUsGeneral());
        }
        waitForPageLoad();
    }


    public HashMap<String, String> contactDetailsGet() throws Exception {
        HashMap<String, String> UIcontactUsDetails = null;
        try {
            waitForPageLoad();
            UIcontactUsDetails = new HashMap<>();

            if (presentElement(this.pageElement.getCusIndiReportCard())) {
                conditionalWait(this.pageElement.getCusIndiReportCard(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiReportCard(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiReportCard(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiReportCard());
                highlightElement(this.pageElement.getCusIndiReportCard());
                conditionalWait(this.pageElement.getCusIndiReportCardContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiReportCardContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiReportCardContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiReportCardContact());
                highlightElement(this.pageElement.getCusIndiReportCardContact());
            }

            if (presentElement(this.pageElement.getCusIndiItSecurityIssue())) {
                conditionalWait(this.pageElement.getCusIndiItSecurityIssue(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiItSecurityIssue(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiItSecurityIssue(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiItSecurityIssue());
                highlightElement(this.pageElement.getCusIndiItSecurityIssue());
                conditionalWait(this.pageElement.getCusIndiItSecurityIssueContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiItSecurityIssueContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiItSecurityIssueContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiItSecurityIssueContact());
                highlightElement(this.pageElement.getCusIndiItSecurityIssueContact());
                UIcontactUsDetails.put("IT_Security_Issues", getElementByXpath(this.pageElement.getCusIndiItSecurityIssueContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiFormerEmp())) {
                conditionalWait(this.pageElement.getCusIndiFormerEmp(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiFormerEmp(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiFormerEmp(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiFormerEmp());
                highlightElement(this.pageElement.getCusIndiFormerEmp());
                conditionalWait(this.pageElement.getCusIndiFormerEmpContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiFormerEmpContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiFormerEmpContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiFormerEmpContact());
                highlightElement(this.pageElement.getCusIndiFormerEmpContact());
            }

            if (presentElement(this.pageElement.getCusIndiAnnuitIndividualInsurance())) {
                conditionalWait(this.pageElement.getCusIndiAnnuitIndividualInsurance(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiAnnuitIndividualInsurance(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiAnnuitIndividualInsurance(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiAnnuitIndividualInsurance());
                highlightElement(this.pageElement.getCusIndiAnnuitIndividualInsurance());
                conditionalWait(this.pageElement.getCusIndiAnnuitIndividualInsuranceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiAnnuitIndividualInsuranceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiAnnuitIndividualInsuranceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiAnnuitIndividualInsuranceContact());
                highlightElement(this.pageElement.getCusIndiAnnuitIndividualInsuranceContact());
                UIcontactUsDetails.put("Annut_Individual_Insurance", getElementByXpath(this.pageElement.getCusIndiAnnuitIndividualInsuranceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiHomeAutoIndividualInsurance())) {
                conditionalWait(this.pageElement.getCusIndiHomeAutoIndividualInsurance(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiHomeAutoIndividualInsurance(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiHomeAutoIndividualInsurance(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiHomeAutoIndividualInsurance());
                highlightElement(this.pageElement.getCusIndiHomeAutoIndividualInsurance());
                conditionalWait(this.pageElement.getCusIndiHomeAutoIndividualInsuranceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiHomeAutoIndividualInsuranceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiHomeAutoIndividualInsuranceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiHomeAutoIndividualInsuranceContact());
                highlightElement(this.pageElement.getCusIndiHomeAutoIndividualInsuranceContact());
                UIcontactUsDetails.put("Home_Individual_Insurance", getElementByXpath(this.pageElement.getCusIndiHomeAutoIndividualInsuranceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiEmployerGroup())) {
                conditionalWait(this.pageElement.getCusIndiEmployerGroup(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiEmployerGroup(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiEmployerGroup(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiEmployerGroup());
                highlightElement(this.pageElement.getCusIndiEmployerGroup());
                conditionalWait(this.pageElement.getCusIndiEmployerGroupContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiEmployerGroupContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiEmployerGroupContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiEmployerGroupContact());
                highlightElement(this.pageElement.getCusIndiEmployerGroupContact());
                UIcontactUsDetails.put("Employersponsored_Group_Annuities", getElementByXpath(this.pageElement.getCusIndiEmployerGroupContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiAnnuiEmployerRetirement())) {
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirement(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirement(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirement(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiAnnuiEmployerRetirement());
                highlightElement(this.pageElement.getCusIndiAnnuiEmployerRetirement());
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiAnnuiEmployerRetirementContact());
                highlightElement(this.pageElement.getCusIndiAnnuiEmployerRetirementContact());
                UIcontactUsDetails.put("Employeroffered_Retirement_income_Annuity_Service", getElementByXpath(this.pageElement.getCusIndiAnnuiEmployerRetirementContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiAnnuiEmployerRetirementService())) {
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementService(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementService(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementService(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiAnnuiEmployerRetirementService());
                highlightElement(this.pageElement.getCusIndiAnnuiEmployerRetirementService());
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementServiceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementServiceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiAnnuiEmployerRetirementServiceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiAnnuiEmployerRetirementServiceContact());
                highlightElement(this.pageElement.getCusIndiAnnuiEmployerRetirementServiceContact());
                UIcontactUsDetails.put("Employeroffered_Retirement_income_Annuity_Service", getElementByXpath(this.pageElement.getCusIndiAnnuiEmployerRetirementServiceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiDentalInsurance())) {
                conditionalWait(this.pageElement.getCusIndiDentalInsurance(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiDentalInsurance(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiDentalInsurance(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiDentalInsurance());
                highlightElement(this.pageElement.getCusIndiDentalInsurance());
                conditionalWait(this.pageElement.getCusIndiDentalInsuranceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiDentalInsuranceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiDentalInsuranceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiDentalInsuranceContact());
                highlightElement(this.pageElement.getCusIndiDentalInsuranceContact());
                UIcontactUsDetails.put("Dental_Insurance", getElementByXpath(this.pageElement.getCusIndiDentalInsuranceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiDisabilityIndividualInsurance())) {
                conditionalWait(this.pageElement.getCusIndiDisabilityIndividualInsurance(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiDisabilityIndividualInsurance(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiDisabilityIndividualInsurance(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiDisabilityIndividualInsurance());
                highlightElement(this.pageElement.getCusIndiDisabilityIndividualInsurance());
                conditionalWait(this.pageElement.getCusIndiDisabilityIndividualInsuranceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiDisabilityIndividualInsuranceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiDisabilityIndividualInsuranceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiDisabilityIndividualInsuranceContact());
                highlightElement(this.pageElement.getCusIndiDisabilityIndividualInsuranceContact());
                UIcontactUsDetails.put("Dis_Individual_Insurance", getElementByXpath(this.pageElement.getCusIndiDisabilityIndividualInsuranceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiDisEmployerSponsInsurance())) {
                conditionalWait(this.pageElement.getCusIndiDisEmployerSponsInsurance(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiDisEmployerSponsInsurance(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiDisEmployerSponsInsurance(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiDisEmployerSponsInsurance());
                highlightElement(this.pageElement.getCusIndiDisEmployerSponsInsurance());
                conditionalWait(this.pageElement.getCusIndiDisEmployerSponsInsuranceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiDisEmployerSponsInsuranceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiDisEmployerSponsInsuranceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiDisEmployerSponsInsuranceContact());
                highlightElement(this.pageElement.getCusIndiDisEmployerSponsInsuranceContact());
                UIcontactUsDetails.put("Employersponsored_Insurance", getElementByXpath(this.pageElement.getCusIndiDisEmployerSponsInsuranceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiHomeEmployerSponsInsurance())) {
                conditionalWait(this.pageElement.getCusIndiHomeEmployerSponsInsurance(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiHomeEmployerSponsInsurance(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiHomeEmployerSponsInsurance(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiHomeEmployerSponsInsurance());
                highlightElement(this.pageElement.getCusIndiHomeEmployerSponsInsurance());
                conditionalWait(this.pageElement.getCusIndiHomeEmployerSponsInsuranceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiHomeEmployerSponsInsuranceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiHomeEmployerSponsInsuranceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiHomeEmployerSponsInsuranceContact());
                highlightElement(this.pageElement.getCusIndiHomeEmployerSponsInsuranceContact());
                UIcontactUsDetails.put("Home_Employersponsored", getElementByXpath(this.pageElement.getCusIndiHomeEmployerSponsInsuranceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiGroupEmpSponsored())) {
                conditionalWait(this.pageElement.getCusIndiGroupEmpSponsored(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiGroupEmpSponsored(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiGroupEmpSponsored(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiGroupEmpSponsored());
                highlightElement(this.pageElement.getCusIndiGroupEmpSponsored());
                conditionalWait(this.pageElement.getCusIndiGroupEmpSponsoredContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiGroupEmpSponsoredContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiGroupEmpSponsoredContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiGroupEmpSponsoredContact());
                highlightElement(this.pageElement.getCusIndiGroupEmpSponsoredContact());
                UIcontactUsDetails.put("Group_Employersponsored", getElementByXpath(this.pageElement.getCusIndiGroupEmpSponsoredContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiLifeIndividualLife())) {
                conditionalWait(this.pageElement.getCusIndiLifeIndividualLife(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiLifeIndividualLife(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiLifeIndividualLife(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiLifeIndividualLife());
                highlightElement(this.pageElement.getCusIndiLifeIndividualLife());
                conditionalWait(this.pageElement.getCusIndiLifeIndividualLifeContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiLifeIndividualLifeContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiLifeIndividualLifeContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiLifeIndividualLifeContact());
                highlightElement(this.pageElement.getCusIndiLifeIndividualLifeContact());
                UIcontactUsDetails.put("Individual_Life_Insurance", getElementByXpath(this.pageElement.getCusIndiLifeIndividualLifeContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiLongEmpSponsored())) {
                conditionalWait(this.pageElement.getCusIndiLongEmpSponsored(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiLongEmpSponsored(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiLongEmpSponsored(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiLongEmpSponsored());
                highlightElement(this.pageElement.getCusIndiLongEmpSponsored());
                conditionalWait(this.pageElement.getCusIndiLongEmpSponsoredContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiLongEmpSponsoredContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiLongEmpSponsoredContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiLongEmpSponsoredContact());
                highlightElement(this.pageElement.getCusIndiLongEmpSponsoredContact());
                UIcontactUsDetails.put("Long_Employer_sponsored", getElementByXpath(this.pageElement.getCusIndiLongEmpSponsoredContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiRetirementGroupAnnuit())) {
                conditionalWait(this.pageElement.getCusIndiRetirementGroupAnnuit(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiRetirementGroupAnnuit(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiRetirementGroupAnnuit(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiRetirementGroupAnnuit());
                highlightElement(this.pageElement.getCusIndiRetirementGroupAnnuit());
                conditionalWait(this.pageElement.getCusIndiRetirementGroupAnnuitContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiRetirementGroupAnnuitContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiRetirementGroupAnnuitContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiRetirementGroupAnnuitContact());
                highlightElement(this.pageElement.getCusIndiRetirementGroupAnnuitContact());
                UIcontactUsDetails.put("Retirement_Group_Annuities", getElementByXpath(this.pageElement.getCusIndiRetirementGroupAnnuitContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiVisionInsurance())) {
                conditionalWait(this.pageElement.getCusIndiVisionInsurance(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiVisionInsurance(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiVisionInsurance(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiVisionInsurance());
                highlightElement(this.pageElement.getCusIndiVisionInsurance());
                conditionalWait(this.pageElement.getCusIndiVisionInsuranceContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiVisionInsuranceContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiVisionInsuranceContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiVisionInsuranceContact());
                highlightElement(this.pageElement.getCusIndiVisionInsuranceContact());
                UIcontactUsDetails.put("Vision_Insurance", getElementByXpath(this.pageElement.getCusIndiVisionInsuranceContact()).getText());

            }

            if (presentElement(this.pageElement.getCusIndiBrighthouseFinancial())) {
                conditionalWait(this.pageElement.getCusIndiBrighthouseFinancial(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiBrighthouseFinancial(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiBrighthouseFinancial(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiBrighthouseFinancial());
                highlightElement(this.pageElement.getCusIndiBrighthouseFinancial());
                conditionalWait(this.pageElement.getCusIndiBrighthouseFinancialContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiBrighthouseFinancialContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiBrighthouseFinancialContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiBrighthouseFinancialContact());
                highlightElement(this.pageElement.getCusIndiBrighthouseFinancialContact());
            }

            if (presentElement(this.pageElement.getCusIndiStructureSettlement())) {
                conditionalWait(this.pageElement.getCusIndiStructureSettlement(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiStructureSettlement(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiStructureSettlement(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiStructureSettlement());
                highlightElement(this.pageElement.getCusIndiStructureSettlement());
                conditionalWait(this.pageElement.getCusIndiStructureSettlementContact(), "presenceOfElementLocated");
                conditionalWait(this.pageElement.getCusIndiStructureSettlementContact(), "elementToBeVisible");
                conditionalWait(this.pageElement.getCusIndiStructureSettlementContact(), "elementToBeClickable");
                mouseHover(this.pageElement.getCusIndiStructureSettlementContact());
                highlightElement(this.pageElement.getCusIndiStructureSettlementContact());
                UIcontactUsDetails.put("Structural_Settlements", getElementByXpath(this.pageElement.getCusIndiStructureSettlementContact()).getText());

            }
            waitForPageLoad();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return UIcontactUsDetails;
    }

    public void validateValuesFromScreen(String testCase) throws Exception{
        try {
            Constants.contactUsDetails.put(testCase,contactDetailsGet());
            Constants.testDataStore.put(testCase,this.testUtility.getTestDataFromDataSheetNew("Contact",testCase));
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(Constants.contactUsDetails.get(testCase).get("IT_Security_Issues") ,
                    Constants.testDataStore.get(testCase).get("IT_Security_Issues"));
            softAssert.assertAll();
        } catch (AssertionError e){
            e.printStackTrace();
            Assert.fail("MISMATCH");
        }



    }

}
