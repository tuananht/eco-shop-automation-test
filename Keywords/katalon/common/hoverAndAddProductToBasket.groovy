package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class hoverAndAddProductToBasket {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Hover over div dynamicObject (object)"
        
        WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_featured/div_dynamicObject'))
        
        "Step 2: Click on image productCard (productCardImg) -> Navigate to page 'product/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_featured/image_productCard"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_featured/image_productCard', ['image_productCard_class': data['image_productCard_class']]))
        
        "Step 3: Click on div dynamicObject (selectSize2)"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/div_dynamicObject'))
        
        "Step 4: Click on div dynamicObject (object)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/div_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/div_dynamicObject', ['div_dynamicObject_reactSelect': data['div_dynamicObject_reactSelect'], 'div_dynamicObject_option': data['div_dynamicObject_option'], 'div_dynamicObject_internalText': data['div_dynamicObject_internalText']]))
        
        "Step 5: Click on button addToBasket (addToBasket)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_addToBasket"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_addToBasket', ['button_addToBasket_class': data['button_addToBasket_class'], 'button_addToBasket_internalRoleButtonName': data['button_addToBasket_internalRoleButtonName']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_addToBasket_class'] = testData.getValue('button_addToBasket_class', rowIndex)
        data['button_addToBasket_internalRoleButtonName'] = testData.getValue('button_addToBasket_internalRoleButtonName', rowIndex)
        data['div_dynamicObject_internalText'] = testData.getValue('div_dynamicObject_internalText', rowIndex)
        data['div_dynamicObject_option'] = testData.getValue('div_dynamicObject_option', rowIndex)
        data['div_dynamicObject_reactSelect'] = testData.getValue('div_dynamicObject_reactSelect', rowIndex)
        data['image_productCard_class'] = testData.getValue('image_productCard_class', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_addToBasket_class'] = 'default_data'
        data['button_addToBasket_internalRoleButtonName'] = 'default_data'
        data['div_dynamicObject_internalText'] = 'default_data'
        data['div_dynamicObject_option'] = 'default_data'
        data['div_dynamicObject_reactSelect'] = 'default_data'
        data['image_productCard_class'] = 'default_data'
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

