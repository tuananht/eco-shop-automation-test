package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectSizeAndColorAddToBasket {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div SelectSize"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SelectSize'))
        
        "Step 2: Click on div SizeOption3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SizeOption3'))
        
        "Step 3: Click on div ChooseColor"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ChooseColor'))
        
        "Step 4: Click on button AddToBasket"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_AddToBasket'))
        
        "Step 5: Click on link BackToShop"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_BackToShop'))
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

