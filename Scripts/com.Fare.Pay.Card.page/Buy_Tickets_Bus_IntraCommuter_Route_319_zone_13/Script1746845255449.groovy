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

WebUI.setText(findTestObject('Purchase tickets-Bus Intrastate-Route22/Page_Fare-Pay Dashboard  NJ Transit/input__origin'), 
    '319')

WebUI.sendKeys(findTestObject('Purchase tickets-Bus Intrastate-Route22/Page_Fare-Pay Dashboard  NJ Transit/input__origin'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Bus IntrCommuter Route 319 zone13/Page_Fare-Pay Dashboard  NJ Transit/li_319-New York - Atlantic City - Cape May'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Bus IntrCommuter Route 319 zone13/Page_Fare-Pay Dashboard  NJ Transit/div_Select Tickets_MuiBackdrop-root MuiBack_935451'))

WebUI.verifyElementText(findTestObject('Object Repository/Bus IntrCommuter Route 319 zone13/Page_Fare-Pay Dashboard  NJ Transit/li_tofrom Jersey City or Newark'), 
    'to/from Jersey City or Newark')

WebUI.click(findTestObject('Object Repository/Bus IntrCommuter Route 319 zone13/Page_Fare-Pay Dashboard  NJ Transit/li_tofrom Jersey City or Newark'))

not_run: WebUI.click(findTestObject('Object Repository/Bus IntrCommuter Route 319 zone13/Page_Fare-Pay Dashboard  NJ Transit/li_13'))

