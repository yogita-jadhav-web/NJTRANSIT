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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


/*WebUI.click(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/From_Date_picker_for_suspend_auto_reload_admin_Page'))

tomarrow_date = CustomKeywords.'kw_web.ApplicationFunction.get_tomorrow_date_dd'()

TestObject dateInput = findTestObject('Page_Fare-Pay Dashboard  NJ Transit/button_date_input')

String dynamicXPath = ('//button[text()=\'' + tomarrow_date) + '\']'

TestObject dateCell = new TestObject().addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

WebUI.click(dateCell)

WebUI.delay(5)*/


// Click to open the date picker
WebUI.click(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/From_Date_picker_for_suspend_auto_reload_admin_Page'))

tomarrow_date = CustomKeywords.'kw_web.ApplicationFunction.get_tomorrow_date_dd'()
tomarrow_date = Integer.parseInt(tomarrow_date).toString() // strip leading 0


TestObject dateInput = findTestObject('Page_Fare-Pay Dashboard  NJ Transit/button_date_input-admin')

String dynamicXPath = ('//button[text()=\'' + tomarrow_date) + '\']'
TestObject dateCell = new TestObject('dynamicDate')
dateCell.addProperty('xpath', ConditionType.EQUALS, dynamicXPath)
//TestObject dateCell = new TestObject().addProperty('xpath', ConditionType.EQUALS, dynamicXPath)

WebUI.click(dateCell)

WebUI.delay(5)

