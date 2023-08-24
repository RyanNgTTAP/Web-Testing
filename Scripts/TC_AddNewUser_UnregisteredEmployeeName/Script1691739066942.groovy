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

WebUI.click(findTestObject('Object Repository/AddNewUser/Page_OrangeHRM/span_Admin'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers')

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/span_AdminUser Management'), 0)

WebUI.click(findTestObject('Object Repository/AddNewUser/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input'), 'Marry Ann')

WebUI.click(findTestObject('Object Repository/AddNewUser/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/AddNewUser/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'RyanNg')

WebUI.setEncryptedText(findTestObject('Object Repository/AddNewUser/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    '/5S6MFFLcE7gZB81Yy9zZg==')

WebUI.click(findTestObject('Object Repository/AddNewUser/Page_OrangeHRM/div_Confirm Password'))

WebUI.setEncryptedText(findTestObject('AddNewUser/Page_OrangeHRM/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 
    '/5S6MFFLcE7gZB81Yy9zZg==')

WebUI.click(findTestObject('AddNewUser/Page_OrangeHRM/div_Admin'))

WebUI.click(findTestObject('AddNewUser/Page_OrangeHRM/div_Enabled'))

WebUI.click(findTestObject('AddNewUser/Page_OrangeHRM/button_Save'))

WebUI.verifyElementText(findTestObject('AddNewUser/Page_OrangeHRM/span_Invalid'), 'Invalid')

