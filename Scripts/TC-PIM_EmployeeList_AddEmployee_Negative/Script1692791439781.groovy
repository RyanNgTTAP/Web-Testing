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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('TC_Login_Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/a_PIM'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList')

WebUI.click(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/a_Add Employee'))

WebUI.setText(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/input_Employee Full Name_firstName'), 'TEST123')

WebUI.setText(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/input_Employee Full Name_lastName'), 'Katalon')

WebUI.click(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/div_Create Login Details'))

WebUI.setText(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 
    'Admin')

WebUI.delay(3)

WebUI.verifyTextPresent('Username already exists', false)

WebUI.setEncryptedText(findTestObject('PIM_EmployeeList/Page_OrangeHRM/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 
    'D7Y+m3IaFBZU3B8AZ3G19g==')

WebUI.verifyTextPresent('Weak', false)

WebUI.click(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/div_Confirm Password'))

WebUI.setEncryptedText(findTestObject('PIM_EmployeeList/Page_OrangeHRM/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 
    'D7Y+m3IaFBYbCsBiWHMmrg==')

WebUI.click(findTestObject('Object Repository/PIM_EmployeeList/Page_OrangeHRM/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('PIM_EmployeeList/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'))

WebUI.sendKeys(findTestObject('PIM_EmployeeList/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
    Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('PIM_EmployeeList/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
    Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('PIM_EmployeeList/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Employee Id_oxd-input oxd-input--active'), 
    '0320')

WebUI.verifyTextPresent('Employee Id already exists', false)

WebUI.closeBrowser()

