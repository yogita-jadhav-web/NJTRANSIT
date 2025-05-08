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

WebUI.callTestCase(findTestCase('z.com.njt.testcases/Login_Module_TCs/TC_108379_To_Verify_that_user_login_successfully - R'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Fare-Pay Dashboard  NJ Transit/Select Fare Cards'))

WebUI.verifyElementText(findTestObject('Object Repository/Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/li_6375-0041-0225-4139'), 
    '6375-0041-0225-4139')

WebUI.click(findTestObject('Object Repository/Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/li_6375-0041-0225-4139'))

WebUI.click(findTestObject('Object Repository/Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/button_TRX. History'))

WebUI.click(findTestObject('Object Repository/Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/button_page 25'))

WebUI.scrollToElement(findTestObject('Object Repository/Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/button_page 24'), 
    0)

WebUI.click(findTestObject('Object Repository/Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/button_page 24'))

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/td_10 Trip Adult'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Expired Cards status_Object Repo/Page_Fare-Pay Dashboard  NJ Transit/td_Expired'), 
    'Expired')

