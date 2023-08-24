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

WebUI.callTestCase(findTestCase('TC_Login_Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_PIM'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList')

WebUI.setText(findTestObject('PIM_Search/Page_OrangeHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'), '0001')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.verifyTextPresent('(1) Record Found', false)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Reset'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), 'AppleOrange')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/div_InfoNo Records Found'), 10)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/div_InfoNo Records Found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_OrangeHRM/button_Reset'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), '@#$!!!!!')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.waitForElementVisible(findTestObject('Page_OrangeHRM/div_InfoNo Records Found'), 10)

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/div_InfoNo Records Found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Reset'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input'), 'Orange Test')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.verifyTextPresent('(1) Record Found', false)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Reset'))

WebUI.click(findTestObject('PIM_Search/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-down-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('Page_OrangeHRM/div_Full-Time Contract'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.verifyTextPresent('(5) Records Found', false)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Reset'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--JobTitle'))

WebUI.click(findTestObject('PIM_Search/Page_OrangeHRM/div_Account Assistant'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.verifyTextPresent('(3) Records Found', false)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Reset'))

WebUI.delay(2)

WebUI.click(findTestObject('PIM_Search/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill oxd-select-text--arrow'))

WebUI.click(findTestObject('PIM_Search/Page_OrangeHRM/div_Administration'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.verifyTextPresent('(5) Records Found', false)

WebUI.delay(2)

WebUI.closeBrowser()

