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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alerabat.com/dodaj-kupon-rabatowy')

WebUI.setText(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Informacje o kuponie_user_create_vouchershop'), 
    shopName)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Informacje o kuponie_user_create_vouchershop'), 'value', shopName, 0)

WebUI.click(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/span_Kod rabatowy'));


Thread.sleep(1800);

WebUI.click(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/div_Promocja'))


WebUI.verifyElementText(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/selectedValueTypeOfVoucher'), promotionValue);

WebUI.setText(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Darmowa dostawa_user_create_vouchercodecode'), 
    voucherCode)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Darmowa dostawa_user_create_vouchercodecode'), 'value', voucherCode, 0)


WebUI.setText(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Darmowa dostawa_user_create_voucherurl'), 
    voucherUrl)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Darmowa dostawa_user_create_voucherurl'), 'value', voucherUrl, 0)


WebUI.waitForElementVisible(findTestObject('Object Repository/Formularz kontaktowy/CloseIconPopup'), 10)


WebUI.setText(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Opis promocji_user_create_vouchertitle'), 
    voucherTitle);

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/input_Opis promocji_user_create_vouchertitle'), 'value', voucherTitle, 0)


WebUI.click(findTestObject('Object Repository/Formularz kontaktowy/CloseIconPopup'));


WebUI.setText(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/textarea_Opis promocji_user_create_vouchers_a7c144'), 
    voucherDesc)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/textarea_Opis promocji_user_create_vouchers_a7c144'), 'value', voucherDesc, 0)


WebUI.click(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/button_Dodaj kupon'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dodaj nowy kupon  AleRabat.com/SuccessMessage'), successMessage);


WebUI.closeBrowser()

