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

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Auto Reload'), 
    0)

WebUI.verifyElementText(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Auto Reload'), 
    'AUTO RELOAD')

WebUI.verifyEqual(null, null)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Card Value'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Active'), 0)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Status'), 0)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Threshold Amount'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_10.00'), 0)

//String price = '$10.00'
//String number = price.replace('$', '').split('\\.')[0]
String ThreshHoldAmnt = WebUI.getText(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_10.00'), 
    FailureHandling.STOP_ON_FAILURE)

ThreshHoldAmnt_updated = (ThreshHoldAmnt.replace('$', '').split('\\.')[0])

println(ThreshHoldAmnt_updated)

WebUI.verifyEqual(ThreshHoldAmnt_updated, 10)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Credit Card Number'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_XXXX-XXXX-XXXX-0286'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_Reload Amount'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_25.00'), 0)

reloadAmount_admin = WebUI.getText(findTestObject('Admin_Auto Reload_Values/Page_Conduent Transport Solutions, Inc/p_25.00'), 
    FailureHandling.STOP_ON_FAILURE)

reloadAmount_admin_updated = (reloadAmount_admin.replace('$', '').split('\\.')[0])

println(reloadAmount_admin_updated)

WebUI.verifyEqual(reloadAmount_admin_updated, 25)

