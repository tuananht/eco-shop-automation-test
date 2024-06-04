package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillCheckoutDetailsAndConfirmOrder {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on button 'Next Step' -> Navigate to page 'checkout/step2'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step1?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step1/button_nextStep'))
        WebUI.takeScreenshot()
        "Step 2: Enter input value in input field 'fullname'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_emailAddress'), data['input_fullname'])
        WebUI.takeScreenshot()
        "Step 3: Enter input value in input field 'email'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_phoneNumber'), data['input_email'])
        WebUI.takeScreenshot()
        "Step 4: Enter input value in input field 'address'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/input_shippingAddress'), data['input_address'])
        WebUI.takeScreenshot()
        "Step 5: Enter input value in input field"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step2/header_internationalShipping'), data['input_object'])
        WebUI.takeScreenshot()
        "Step 6: Click on header"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step2/input_shippingOption'))
        WebUI.takeScreenshot()
        "Step 7: Click on input field"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step2/button_nextStep'))
        WebUI.takeScreenshot()
        "Step 8: Click on button 'Next Step' -> Navigate to page 'checkout/step3'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step2?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step2/div_creditCardPayWithVisa'))
        WebUI.takeScreenshot()
        "Step 9: Click on div"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step3/input_creditCardPayWithVisa'))
        WebUI.takeScreenshot()
        "Step 10: Click on input field"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step3/input_name'))
        WebUI.takeScreenshot()
        "Step 11: Enter input value in input field 'name'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_cardNumber'), data['input_name'])
        WebUI.takeScreenshot()
        "Step 12: Enter input value in input field 'cardnumber'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/input_ccv'), data['input_cardnumber'])
        WebUI.takeScreenshot()
        "Step 13: Enter input value in input field 'ccv'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_checkout_step3/button_confirm'), data['input_ccv'])
        WebUI.takeScreenshot()
        "Step 14: Click on button 'Confirm'"
        //WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout/step3?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_step3/link_shop'))
        WebUI.takeScreenshot()
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

