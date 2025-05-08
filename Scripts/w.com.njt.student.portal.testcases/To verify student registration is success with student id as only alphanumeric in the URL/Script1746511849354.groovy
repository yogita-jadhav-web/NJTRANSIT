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

WebUI.callTestCase(findTestCase('com.student.portal/Student_Portal_URLS/Launch_User_Registration_alphanumeric_URL'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('com.student.portal/user.creation/UserRegistration'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/div_User created successfully. A verificati_bb94a3_1'), 
    'User created successfully. A verification code has been sent to your email ID. Please verify.')

WebUI.callTestCase(findTestCase('com.db.student.portal/get_link_from_dB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/div_User activated successfully_1'), 
    'User activated successfully.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_You have Successfully activated your NJ T_ca5d10_1'), 
    'You have Successfully activated your NJ TRANSIT student mobile account')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Use your account to purchase discounted s_452b14_1'), 
    'Use your account to purchase discounted student monthly passes.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Your student account is valid through Jul_ccf3b6_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_To purchase your Student Pass_1'), 
    'To purchase your Student Pass:')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Download the NJ TRANSIT app_1'), 
    'Download the NJ TRANSIT app')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Open the app and tap BUY_1'), 
    'Open the app and tap BUY')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Sign in with your .edu Email and Password_1'), 
    'Sign in with your .edu Email and Password')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Select your Student Monthly pass and pay _8fc6c2_1'), 
    'Select your Student Monthly pass and pay for it in the app')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_On the 1st of the month your student pass_a18770_1'), 
    'On the 1st of the month your student pass will display in the app')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Following the start of each semester, ret_d10cf8_1'), 
    'Following the start of each semester, return to your schools web portal and')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_click on the Existing NJ TRANSIT Mobile S_45d9ec_1'), 
    'click on the "Existing NJ TRANSIT Mobile Student Monthly Pass Account')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Management link to confirm your full-time_54ffc4_1'), 
    'Management" link to confirm your full-time status and continue through to')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_purchase your student pass_1'), 
    'purchase your student pass.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_NJTRANSIT/p_Thank you_1'), 'Thank you.')

WebUI.closeBrowser()

