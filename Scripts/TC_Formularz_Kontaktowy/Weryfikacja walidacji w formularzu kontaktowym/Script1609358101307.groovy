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

WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage1'), val1)

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage2'), val1)

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage3'), val1)

WebUI.sendKeys(findTestObject('Object Repository/Formularz kontaktowy/NameField'), Name)

WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage2'), val1)

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage3'), val1)

WebUI.sendKeys(findTestObject('Object Repository/Formularz kontaktowy/EmailField'), incorrectEmail)

WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/Button'))

Thread.sleep(1000)

WebUI.waitForElementVisible(findTestObject('Object Repository/Formularz kontaktowy/CloseIconPopup'), 10)

WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/CloseIconPopup'))

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage2'), val2)

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage3'), val1)

WebUI.clearText(findTestObject('Object Repository/Formularz kontaktowy/EmailField'))

WebUI.sendKeys(findTestObject('Object Repository/Formularz kontaktowy/EmailField'), Email)

WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/Button'))

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/Walidacja/ValidationMessage3'), val1)

WebUI.sendKeys(findTestObject('Object Repository/Formularz kontaktowy/MessageField'), 'Test')

WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/Button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz kontaktowy/SuccessMessage'))

WebUI.verifyElementText(findTestObject('Object Repository/Formularz kontaktowy/SuccessMessage'), 'Dziękujemy, wiadomość została wysłana, odpowiemy na nią tak szybko jak to tylko będzie możliwe.')

WebUI.closeBrowser()

