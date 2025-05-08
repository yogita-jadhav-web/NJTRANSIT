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

WebUI.scrollToElement(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs'),
	10)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs'), 
    'Student Monthly Pass FAQs.')

WebUI.click(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs'))

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_Student Monthly Pass FAQs_1'), 
    'Student Monthly Pass FAQs')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_About the App'), 
    'About the App')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_Which mobile devices can run the app'), 
    'Which mobile devices can run the app?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_The NJ TRANSIT Mobile App is available fo_77c13d'), 
    'The NJ TRANSIT Mobile App@ is available for iPhone, iPad & Android devices only. iPhone and iPad devices require iOS 13.0 or higher, and Android devices require Android OS 8.0 or higher. Rooted and jailbroken devices are not supported.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_Can I use MyTix on multiple devices'), 
    'Can I use MyTix on multiple devices?')

WebUI.verifyElementPresent(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_To ensure access to your ticket(s), your _d62720'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_What forms of payment can I use'), 
    'What forms of payment can I use?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_The app accepts credit and debit cards, A_e4d234'), 
    'The app accepts credit and debit cards, Apple Pay, Google Pay and PayPal.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Student Monthly Passes'), 
    'Student Monthly Passes')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_Where can I use a Student Monthly Pass'), 
    'Where can I use a Student Monthly Pass?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Student passes are available for travel o_952788'), 
    'Student passes are available for travel on all NJ TRANSIT rail lines, bus routes and light rail lines.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_How do I purchase my first mobile Studen_5c530a'), 
    'How do I purchase my first mobile Student Monthly Pass?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Full-time college students can save 25 pe_434a6f'), 
    'Full-time college students can save 25 percent on NJ TRANSIT Monthly Passes when their school participates in our University Partnership Program. Sign up through the participating college/university student web portal and click the Student Enrollment link to complete your enrollment.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_Once I have completed my enrollment, how_923b30'), 
    'Once I have completed my enrollment, how do I purchase my student monthly pass in subsequent months?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_During the enrollment process your status_cce12f'), 
    'During the enrollment process your status as a full-time student is confirmed with your college/university, you are then eligible to purchase the discounted student pass for the balance of that semester. You can purchase the discounted pass directly in the NJT app.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_Do I have to renew my Student Pass accou_54ad61'), 
    'Do I have to renew my Student Pass account at any time?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_You may purchase a monthly pass beginning_79db52'), 
    'You may purchase a monthly pass beginning at 5:00 p.m. on the 19th of the previous month until 11:59 pm on the 10th of the month in which the pass is valid.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_If I have a Student Monthly Pass, can I _4e332c'), 
    'If I have a Student Monthly Pass, can I purchase round trip and one-way rail tickets for friends & family traveling with me?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/p_Yes, you may. Simply select the Buy optio_550563'), 
    'Yes, you may. Simply select the Buy option in the navigation menu to purchase any additional tickets.')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/h6_How do I use my Student Monthly Pass'), 
    'How do I use my Student Monthly Pass?')

WebUI.verifyElementText(findTestObject('Object Repository/student_Registartion_Page_Object_Repository/Page_Create Account  NJ Transit/span_The Student Monthly Pass is for the pe_6c3f16'), 
    'The Student Monthly Pass is for the personal use of the student who purchased it and is restricted for use traveling to/from stations indicated on the pass for the sole purpose of attending school. Student passes are not honored to or from any other rail station except those printed on the pass, but they may be used on certain buses and light rail vehicles as permitted under NJ TRANSIT cross-honoring policies. Get details from the ‘Travel Flexibility’ section of the NJ TRANSIT train, bus or light rail ticket webpages')

WebUI.closeBrowser()

