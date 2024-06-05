package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class selectItemsReviewOrderProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on image"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_plus'))
        "Step 2: Click on button"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_minus'))
        "Step 3: Click on button"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_minus'))
        "Step 4: Click on span"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_plus'))
        "Step 5: Click on span"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minusButton'))
        "Step 6: Click on span"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minusButton'))
        "Step 7: Click on span"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_minusButton'))
        "Step 8: Click on button 'CHECK OUT'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/input_fullName'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

