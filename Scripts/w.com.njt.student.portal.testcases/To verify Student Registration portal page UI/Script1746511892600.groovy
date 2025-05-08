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

WebUI.callTestCase(findTestCase('com.student.portal/Student_Portal_URLS/Launch_NJT_StudentPortal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_New Student Registration'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Denotes required fields'), 
    '* Denotes required fields')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Create your Mobile MyTix Student Month_4d4521'), 
    'Create your Mobile MyTix Student Monthly Pass account with these simple steps.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_1. Fill in all required fields on the _8c4dec'), 
    '1. Fill in all required fields on the registration form.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_2. Verify your student email address'), 
    '2. Verify your student email address.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_3. Download the NJ TRANSIT App and buy_b75a2d'), 
    '3. Download the NJ TRANSIT App and buy your Mobile MyTix Student Monthly Pass.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_First Name'), 
    'First Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Last Name'), 
    'Last Name')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Email'), 'Email')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2_3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Confirm Email'), 
    'Confirm Email')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2_3_4'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Password'), 
    'Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2_3_4_5'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Confirm Password'), 
    'Confirm Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2_3_4_5_6'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Phone'), 'Phone')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2_3_4_5_6_7'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Country'), 
    'Country')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2_3_4_5_6_7_8'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_ZipPostal Code'), 
    'Zip/Postal Code')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span__1_2_3_4_5_6_7_8_9'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Date Of Birth (MMDD)'), 
    'Date Of Birth (MM/DD)')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs'), 
    'Student Monthly Pass FAQs.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/b_Terms of Use'), 
    'Terms of Use')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_The student monthly pass is for the pe_827c5d'), 
    'The student monthly pass is for the personal use of the student who purchased it and is restricted for use traveling to/from stations indicated on the pass for the sole purpose of attending school. Student passes are not honored to or from any other rail station except those printed on the pass. But they may be used on certain buses and light rail vehicles as permitted under NJ TRANSIT cross-honoring policies. Details are available in the ‘Travel Flexibility’ section of the rail, bus or light rail ticket webpages. NJ TRANSIT reserves the right to review the applications for student passes. To ensure compliance with NJ TRANSIT policies, Students must present their student identification card upon request by train crew personnel or any NJ TRANSIT representative.')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_2025  NJ TRANSIT All Rights Reserved'), 
    '2025 © NJ TRANSIT All Rights Reserved.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/a_Terms of Use'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Note Password is case sensitive and mu_d934e5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/a_Sitemap'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Create Account  NJ Transit/span_Version 3.0.b.8'), 
    0)

WebUI.closeBrowser()

