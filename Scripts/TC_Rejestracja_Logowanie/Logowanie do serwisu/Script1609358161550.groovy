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

WebUI.openBrowser("https://app.bed-booking.com/");
WebUI.maximizeWindow();

WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz logowania/SubmitBtn'));
WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz logowania/EmailField'));
WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz logowania/PasswordField'));

WebUI.sendKeys(findTestObject('Object Repository/Formularz logowania/EmailField'), "rafi@rafi.pl");
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz logowania/EmailField'), "value", "rafi@rafi.pl", 0);

WebUI.sendKeys(findTestObject('Object Repository/Formularz logowania/PasswordField'), "1234567");
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz logowania/PasswordField'), "value", "1234567", 0);
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz logowania/PasswordField'), "type", "password", 0);

WebUI.click(findTestObject('Object Repository/Formularz logowania/SubmitBtn'));
WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz logowania/AddReservationBtn'));
WebUI.verifyElementText(findTestObject('Object Repository/Formularz logowania/LoginSpan'), "rafi@rafi.pl");

WebUI.closeBrowser();