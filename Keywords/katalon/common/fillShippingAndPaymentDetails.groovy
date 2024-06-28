package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingAndPaymentDetails {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button nextStep -> Navigate to page 'checkout/step2'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step1/button_nextStep'))
        "Step 2: Enter input value in input fullName"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_fullName'), data['input_fullname'])
        "Step 3: Enter input value in input emailAddress"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_emailAddress'), data['input_email'])
        "Step 4: Enter input value in input shippingAddress"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_shippingAddress'), data['input_address'])
        "Step 5: Enter input value in input 09254461351"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_09254461351'), data['input_object'])
        "Step 6: Click on header mainH5"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step2/header_mainH5'))
        "Step 7: Click on checkbox shippingOption"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step2/checkbox_shippingOption'))
        "Step 8: Click on button nextStep2 -> Navigate to page 'checkout/step3'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step2/button_nextStep2'))
        "Step 9: Click on input creditCardPayWithVisa"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step3/input_creditCardPayWithVisa'))
        "Step 10: Click on radio creditCardPayWithVisa"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step3/radio_creditCardPayWithVisa'))
        "Step 11: Enter input value in input nameOnCard"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_nameOnCard'), data['input_name'])
        "Step 12: Enter input value in input cardNumber"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_cardNumber'), data['input_cardnumber'])
        "Step 13: Enter input value in input ccv"
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_ccv'), data['input_ccv'])
        "Step 14: Click on button confirm"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step3/button_confirm'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_fullname'] = testData.getValue('input_fullname', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_address'] = testData.getValue('input_address', rowIndex)
        data['input_object'] = testData.getValue('input_object', rowIndex)
        data['input_name'] = testData.getValue('input_name', rowIndex)
        data['input_cardnumber'] = testData.getValue('input_cardnumber', rowIndex)
        data['input_ccv'] = testData.getValue('input_ccv', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_fullname'] = 'default_data'
        data['input_email'] = 'default_data'
        data['input_address'] = 'default_data'
        data['input_object'] = 'default_data'
        data['input_name'] = 'default_data'
        data['input_cardnumber'] = 'default_data'
        data['input_ccv'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

