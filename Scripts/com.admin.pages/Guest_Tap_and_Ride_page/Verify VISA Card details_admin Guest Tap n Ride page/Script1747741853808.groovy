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

WebUI.waitForElementVisible(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/img_Search_visa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_Account Id'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_0BEE741Q'), 
    GlobalVariable.VISA_Account_Id)

WebUI.waitForElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_Card Status'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_Active'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_Credit Card Number'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_XXXX-XXXX-XXXX-0286'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_02282029'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_Media Type'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_Contactless Card'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_First Trip'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_02212024'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_Last Trip'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_05072025'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_NJT Deny Status'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_YES'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_NJT Deny Start Date'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/p_05182025  192003'), 
    0)

