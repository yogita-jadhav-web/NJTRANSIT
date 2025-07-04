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

//select ticket
TestObject ticket = findTestObject('Page_Fare-Pay Dashboard  NJ Transit/div_Hudson Bergen Light Rail')

String ticketText = WebUI.getAttribute(ticket, 'textContent')

println('ticketText :' + ticketText)

WebUI.comment('ticketText :' + ticketText)

WebUI.verifyElementAttributeValue(ticket, 'aria-disabled', 'true', 5)

WebUI.comment('Tickets should not be editable')

//Tariff Type
TestObject tariff_type = findTestObject('Page_Fare-Pay Dashboard  NJ Transit/div_Within New Jersey')

String tariff_type_Text = WebUI.getAttribute(tariff_type, 'textContent')

println('tariff_type_Text :' + tariff_type_Text)

WebUI.comment('tariff_type_Text :' + tariff_type_Text)

WebUI.verifyElementAttributeValue(tariff_type, 'aria-disabled', 'true', 5)

WebUI.comment('tariff_type should not be editable')

//select_zone
TestObject select_zone = findTestObject('Page_Fare-Pay Dashboard  NJ Transit/div_1')

select_zone_value = WebUI.getAttribute(select_zone, 'textContent')

println('select_zone_value :' + select_zone_value)

WebUI.comment('select_zone_value :' + select_zone_value)

WebUI.verifyElementAttributeValue(select_zone, 'aria-disabled', 'true', 5)

WebUI.comment('select zone value should not be editable')

