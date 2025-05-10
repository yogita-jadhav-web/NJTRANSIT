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

WebUI.waitForElementVisible(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/div_Find AccountSearch'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_User'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input_Guest - FARE-PAY Card_emailId'), 
    0)

WebUI.setText(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/input_Guest - FARE-PAY Card_emailId'), 
    'Rashmi.KS@maildrop.cc')

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Search'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Search'))

WebUI.click(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/th_rashmi.ksmaildrop.cc'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/div_Find AccountSearchUser Account Details'), 
    0)

