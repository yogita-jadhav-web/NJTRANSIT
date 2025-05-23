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

WebUI.verifyElementPresent(findTestObject('Admin portal _TC_objectRepo/Page_Add Fare-Pay Card  NJ Transit/p_Inactive_status'), 
    0)

WebUI.scrollToElement(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Resend Verification Code'), 
    50)

WebUI.click(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Resend Verification Code'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/textarea__cacheComments_popup'), 
    0)

WebUI.setText(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/textarea__cacheComments_popup'), 
    'ashjjjjaa')

WebUI.click(findTestObject('Admin portal _TC_objectRepo/Page_Conduent Transport Solutions, Inc/button_Save'), FailureHandling.STOP_ON_FAILURE)

