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

WebUI.callTestCase(findTestCase('com.student.portal/Student_Portal_URLS/Launch NJT Student Login Portal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_Sign In  NJ Transit/a_Contact Us'))

WebUI.switchToWindowTitle('NJ Transit Customer Service')

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/h1_CONTACT US'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/p_Use this form to submit feedback to NJ TR_64e14b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/p_Note If your feedback is related to MyTix_779619'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/legend_Your feedback'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/fieldset_Your feedback Feedback TypeSelect._e91c53'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/div_Select LanguageAbkhazAcehneseAcholiAfar_85328f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Feedback Type'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Mode  Service'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Incident Date'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Incident Time'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/div_Subject'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Subject'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Description'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/div_Select LanguageAbkhazAcehneseAcholiAfar_85328f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Attachment'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/small_Hold Control key to select up to three files'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/legend_Incident Specifics'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Employee Number'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Employee Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Employee Number_input.Employee_Number__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Employee Name_input.Employee_Name__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/legend_Contact Information'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_First Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_First Name_input.Customer_First_Name__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Last Name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Last Name_input.Customer_Last_Name__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Street Address'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Street Address_input.Web_Street__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_City'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_City_input.Customer_City__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_State'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_State_input.Web_State__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Zip'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Zip_input.Web_Zip__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Zip_input.Web_Zip__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Phone_input.Customer_Phone__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Phone_input.Customer_Phone__c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Email'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Email_input.SuppliedEmail'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/label_Confirm Email'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Verify_Contact_Us_Link_Object_Repository/Page_NJ Transit Customer Service/input_Confirm Email_input.verifiedEmail'), 
    0)

