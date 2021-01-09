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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(urlContact)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Object Repository/Formularz kontaktowy/NameField'), Name)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz kontaktowy/NameField'), 'value', Name, 0)

WebUI.sendKeys(findTestObject('Object Repository/Formularz kontaktowy/EmailField'), Email)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz kontaktowy/EmailField'), 'value', Email, 0)

WebUI.sendKeys(findTestObject('Object Repository/Formularz kontaktowy/MessageField'), Message)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz kontaktowy/MessageField'), 'value', Message, 
    0)

WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/Button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz kontaktowy/SuccessMessage'))

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/SuccessMessage'), SuccessMessage)

WebUI.closeBrowser()

