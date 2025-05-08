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

WebUI.callTestCase(findTestCase('com.login.admin.page/Login_into_NJT_Admin_Login_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.login.admin.page/Search User with Email Id_Block_user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/button_Unblock User'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/button_Unblock User'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/button_Unblock User'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/input_Site Map_action'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/textarea_Unblock'), 'Unblock')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/div_User has been unblocked successfully'), 
    'User has been unblocked successfully.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/button_Block User'), 'Block User')

WebUI.click(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/div_User InformationAccount Status Active  _f1727d'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Conduent Transport Solutions, Inc/p_Active'), 'Active')

WebUI.newTab('')

WebUI.navigateToUrl('https://cmsqa.cmsservices.us/njt-web/')

WebUI.setText(findTestObject('Object Repository/Page_Sign In  NJ Transit/input_Email_email'), GlobalVariable.Email_Admin_BlockUser)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In  NJ Transit/input_Password_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_Sign In  NJ Transit/button_Sign In'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Add Fare-Pay Card  NJ Transit/h1_Manage FARE-PAY Card'))

