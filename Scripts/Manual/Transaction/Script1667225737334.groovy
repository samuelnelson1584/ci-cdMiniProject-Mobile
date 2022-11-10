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

Mobile.verifyElementExist(findTestObject('order_btn'), 10)

title = Mobile.getAttribute(findTestObject('order_btn'), 'contentDescription', 10)

Mobile.verifyMatch(title, '0', false)

Mobile.tap(findTestObject('beli_btn'), 0)

Mobile.verifyElementExist(findTestObject('order_btn'), 10)

title = Mobile.getAttribute(findTestObject('order_btn'), 'contentDescription', 10)

Mobile.verifyMatch(title, '1', false)

Mobile.closeApplication()

