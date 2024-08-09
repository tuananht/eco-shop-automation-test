package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class completeCheckoutWithPaymentDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button nextStep -> Navigate to page 'checkout/step2'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step1/button_nextStep'))
        
        "Step 2: Enter input value in input fullName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_fullName'), data['var_1_input_fullName'])
        
        "Step 3: Enter input value in input emailAddress"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_emailAddress'), data['var_2_input_emailAddress'])
        
        "Step 4: Enter input value in input shippingAddress"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_shippingAddress'), data['var_3_input_shippingAddress'])
        
        "Step 5: Enter input value in input 09254461351"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_09254461351'), data['var_4_input_09254461351'])
        
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
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_nameOnCard'), data['var_5_input_nameOnCard'])
        
        "Step 12: Enter input value in input cardNumber"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_cardNumber'), data['var_6_input_cardNumber'])
        
        "Step 13: Enter input value in input ccv"
        
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_ccv'), data['var_7_input_ccv'])
        
        "Step 14: Click on button confirm"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step3/button_confirm'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['var_5_input_nameOnCard'] = testData.getValue('var_5_input_nameOnCard', rowIndex)
        data['var_1_input_fullName'] = testData.getValue('var_1_input_fullName', rowIndex)
        data['var_3_input_shippingAddress'] = testData.getValue('var_3_input_shippingAddress', rowIndex)
        data['var_6_input_cardNumber'] = testData.getValue('var_6_input_cardNumber', rowIndex)
        data['var_4_input_09254461351'] = testData.getValue('var_4_input_09254461351', rowIndex)
        data['var_2_input_emailAddress'] = testData.getValue('var_2_input_emailAddress', rowIndex)
        data['var_7_input_ccv'] = testData.getValue('var_7_input_ccv', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['var_5_input_nameOnCard'] = 'default_data'
        data['var_1_input_fullName'] = 'default_data'
        data['var_3_input_shippingAddress'] = 'default_data'
        data['var_6_input_cardNumber'] = 'default_data'
        data['var_4_input_09254461351'] = 'default_data'
        data['var_2_input_emailAddress'] = 'default_data'
        data['var_7_input_ccv'] = 'default_data'
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

