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

WebUI.verifyElementVisible(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/img_Contact Us_MuiBox-root css-2qqyzr'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/a_Contact Us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/h1_Account Login'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_Denotes required fields'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_If you have an existing NJT account, p_1893a2'), 
    'If you have an existing NJT account, please use your Email and Password to Sign In.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/div_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Email_email'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/div_Password'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/input_Password_password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/div_Sign In'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_Remember Me'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_Forgot Password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_Student Monthly Pass FAQs'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/b_Terms of Use'), 'Terms of Use')

WebUI.verifyElementText(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_The student monthly pass is for the pe_827c5d'), 
    'The student monthly pass is for the personal use of the student who purchased it and is restricted for use traveling to/from stations indicated on the pass for the sole purpose of attending school. Student passes are not honored to or from any other rail station except those printed on the pass. But they may be used on certain buses and light rail vehicles as permitted under NJ TRANSIT cross-honoring policies. Details are available in the ‘Travel Flexibility’ section of the rail, bus or light rail ticket webpages. NJ TRANSIT reserves the right to review the applications for student passes. To ensure compliance with NJ TRANSIT policies, Students must present their student identification card upon request by train crew personnel or any NJ TRANSIT representative.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/a_Privacy'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/a_Terms of Use'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/a_Sitemap'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/select_Select LanguageAbkhazAcehneseAcholiA_2efbc6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Student_Portal/Page_Sign In  NJ Transit/span_Version 3.0.c.1'), 
    0)

WebUI.closeBrowser()

