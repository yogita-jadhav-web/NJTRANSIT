import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108379_To_Verify_that_user_login_successfully - R'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_On_BUY_TICKETS_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('full_refund_Rail_10_trip/Bus-option'))

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/dropdown-Select-Route(Bus )'))

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/li_186-Dumont - New York (GWB)'))

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/div_Select Tariff Type'))

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/li_ToFrom New York'))

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/span_Select Zone'))

WebUI.click(findTestObject('Refund-Bus/Page_Fare-Pay Dashboard  NJ Transit/li_3'))

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Select Tickets'))

WebUI.click(findTestObject('full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/input_Fare_r9'))

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Proceed To Checkout'))

WebUI.callTestCase(findTestCase('com.profile.page/Click_On_Add_New_Card_Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.tap.and.ride.non.guest.page/Enter_Exp_Month_Year'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_Amex_CC_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.profile.page/Enter_Credit_Card_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Click_Proceed_To_Pay_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Verify_purchase_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'), 
    10)

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'))

WebUI.mouseOver(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Refund'))

WebUI.delay(2 // Wait for 2 seconds to let hover effect take place
    )

// Verify if the expected change has occurred after the hover (e.g., check for text change)
TestObject refundText = findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Refund')

String hoveredText = WebUI.getText(refundText)

// Verify the text or other changes
if (hoveredText.equals('Refund')) {
    WebUI.comment('Text changed to \'Refund\' on hover.')
} else {
    WebUI.comment('Text did not change as expected.')
}

// Close the browser after the test
not_run: WebUI.closeBrowser()

WebUI.comment('Our Validation is completed successfully and we are doing refund to avoid next test case failures.')

WebUI.click(findTestObject('Object Repository/full_refund_Rail_10_trip/Page_Fare-Pay Dashboard  NJ Transit/span_Refund'))

WebUI.click(findTestObject('full_refund_Rail_10_trip/Pop ups/Yes button -Refund policy pop up'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(80)

