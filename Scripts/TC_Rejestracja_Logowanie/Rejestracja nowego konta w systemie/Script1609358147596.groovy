import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
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

WebUI.openBrowser("https://bed-booking.com/pl/rejestracja/");
WebUI.maximizeWindow();
WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz rejestracji/CheckboxTerm'));
WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz rejestracji/EmailField'));
WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz rejestracji/PasswordField'));
WebUI.verifyElementVisible(findTestObject('Object Repository/Formularz rejestracji/RegisterBtn'));

Random rand = new Random();
int min = 1;
int max = 100000000;
int result = (rand.nextFloat() * (max - min)) + min;

String email = "test" + result + "@test.pl";

WebUI.sendKeys(findTestObject('Object Repository/Formularz rejestracji/EmailField'), email);
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz rejestracji/EmailField'), "value", email, 0);

WebUI.sendKeys(findTestObject('Object Repository/Formularz rejestracji/PasswordField'), "Rafal9898");
WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Formularz rejestracji/PasswordField'), "value", "Rafal9898", 0);

WebUI.click(findTestObject('Object Repository/Formularz rejestracji/CheckboxTerm'));
WebUI.verifyElementChecked(findTestObject('Object Repository/Formularz rejestracji/CheckboxTerm'), 10);

WebUI.click(findTestObject('Object Repository/Formularz rejestracji/RegisterBtn'));
Thread.sleep(3000);
WebUI.verifyElementText(findTestObject('Object Repository/Formularz rejestracji/SuccessMessage'), "Zaloguj się");


WebUI.closeBrowser();

