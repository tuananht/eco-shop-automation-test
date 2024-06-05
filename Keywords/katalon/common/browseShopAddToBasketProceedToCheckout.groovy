package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class browseShopAddToBasketProceedToCheckout {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link 'Shop' -> Navigate to page 'shop'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInToCheckout'))
        "Step 2: Hover over div"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_herringbonePineTreeIndoorPlants'))
        "Step 3: Click on button 'Add to basket'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_addToBasket'))
        "Step 4: Click on span"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_navigationButton'))
        "Step 5: Click on button"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_close'))
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

