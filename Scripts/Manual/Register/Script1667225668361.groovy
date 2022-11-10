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

Mobile.startApplication('C:\\Users\\Dell\\Downloads\\app-release.apk', false)

Mobile.verifyElementExist(findTestObject('home_title'), 10)

title = Mobile.getAttribute(findTestObject('home_title'), 'contentDescription', 10)

Mobile.verifyMatch(title, 'Products', false)

Mobile.tap(findTestObject('login_page_btn'), 10)

Mobile.verifyElementExist(findTestObject('login_title'), 10)

title = Mobile.getAttribute(findTestObject('login_title'), 'contentDescription', 10)

Mobile.verifyMatch(title, 'Login', false)

Mobile.tap(findTestObject('register_page_btn'), 0)

Mobile.clearText(findTestObject('Fullname_register_txt'), 0)

Mobile.setText(findTestObject('Fullname_register_txt'), 'Branz', 10)

Mobile.clearText(findTestObject('Email_register_txt'), 0)

Mobile.setText(findTestObject('Email_register_txt'), 'branz@bmail.com', 10)

Mobile.clearText(findTestObject('Password_register_txt'), 0)

Mobile.setText(findTestObject('Password_register_txt'), 'branz123', 10)

Mobile.tap(findTestObject('login_login_btn'), 10)

Mobile.verifyElementExist(findTestObject('home_title'), 10)

title = Mobile.getAttribute(findTestObject('home_title'), 'contentDescription', 10)

Mobile.verifyMatch(title, 'Products', false)

Mobile.closeApplication()

