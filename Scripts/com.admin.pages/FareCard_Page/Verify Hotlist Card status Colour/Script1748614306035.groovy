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

TestObject Hotlist_status =findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/card_status-Hotlisted')

String hotlist_card_status_text = WebUI.getText(findTestObject('Admin_Portal_Master_Fare_Pay_Card_Object_Repo/card_status-Hotlisted'))

println('hotlist_card_status_text : ' + hotlist_card_status_text)

WebUI.comment('card status :' + hotlist_card_status_text)

String colorValue_hotlist = WebUI.getCSSValue(Hotlist_status, 'color')

println('colorValue : ' + colorValue_hotlist)

String expectedColor = 'rgba(175, 26, 26, 1)'//dark red colour

WebUI.verifyMatch(colorValue_hotlist, expectedColor, false)

