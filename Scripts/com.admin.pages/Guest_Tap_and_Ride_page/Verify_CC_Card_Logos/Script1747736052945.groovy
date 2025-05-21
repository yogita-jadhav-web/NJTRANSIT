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

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/img-vISA CARD'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/img-MasterCard'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/img-Amex card'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/IMG Unionpay'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/img JCB Card'), 
    0)

WebUI.verifyElementPresent(findTestObject('Admin-Portal-Guest-Tap-And-Ride/Page_Conduent Transport Solutions, Inc/img discover card'), 
    0)

