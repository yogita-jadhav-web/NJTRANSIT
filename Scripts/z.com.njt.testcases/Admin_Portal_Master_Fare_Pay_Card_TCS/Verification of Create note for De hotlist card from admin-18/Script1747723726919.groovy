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

WebUI.callTestCase(findTestCase('com.login.page/Login_Into_NJT_LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.page/Click_On_Sign_In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Unregistered_fare_pay_card'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('com.Fare.Pay.Card.page/Enter_FP_Card_details_Purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/ProfileTAB'))

String userEmail = WebUI.getText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/EmailTextfromProfileTAB'))

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/FarePayCard_TAB'))

String farePayCardNumber = WebUI.getText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Fare_Card_Refund_Object_Repo/FarePayCardNumberXpath'))

String portalCardStatus = WebUI.getText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Card_Status'))

String portalCardValue = WebUI.getText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/Portal_Card_Value'))

String actualCardNumber = farePayCardNumber.replaceAll('-', '')

println(actualCardNumber)

WebUI.executeJavaScript(('window.open(\'' + GlobalVariable.ADMIN_PORTAL_URL) + '\', \'_blank\')', [])

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Admin_UserName_Filed'), GlobalVariable.ADMIN_USERNAME)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Admin_Password'), GlobalVariable.ADMIN_PASSWORD)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/Admin_SignInBTN'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Admin_Object_Repo/input_Guest - FARE-PAY Card_emailId'), userEmail)

WebUI.click(findTestObject('Object Repository/Fare_Card_Admin_Object_Repo/button_Search'))

WebUI.click(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/ClickOnEmail_fromAdmin'))

WebUI.click(findTestObject('Object Repository/Fare_Card_Admin_Object_Repo/button_FARE-PAY Card'))

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/hotlistFarePayCard'), 10)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/hotlistFarePayCard'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/hotListDropDown'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/hotListReason'))

String commentBoxText = CustomKeywords.'kw_web.kw_Random.generateRandomString'(10)

WebUI.setText(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/commentBoxText'), commentBoxText)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/saveButton'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/unHotlistFareCard'), 10)

WebUI.click(findTestObject('Object Repository/Fare_Card_Refund_Object_Repo/unHotlistFareCard'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Create Note'), 
    'Create Note')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Close'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Please provide the reason in the below co_e38858'), 
    'Please provide the reason in the below comments section')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/div_Action'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/div_Comments'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin_Portal_Master_Fare_Pay_Card_Object_Repo/p_Your comments must be at least 5 characters'), 
    'Your comments must be at least 5 characters.')

WebUI.setText(findTestObject('Fare_Card_Refund_Object_Repo/commentBoxText'), commentBoxText)

WebUI.click(findTestObject('Fare_Card_Refund_Object_Repo/saveButton'))

WebUI.closeBrowser()

