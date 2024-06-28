package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addStoneLotusToBasket {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on span close"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_close'))
        "Step 2: Hover over div wealthTreeStoneLotus"
        WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_wealthTreeStoneLotus'))
        "Step 3: Click on button addToBasket"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_addToBasket'))
        "Step 4: Click on span navigationButton"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/span_navigationButton'))
        "Step 5: Click on input fullName"
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

