import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to"

TrueTestScripts.navigate("")

"Step 2: Click on link shop2 -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on link shop2 - Navigate to page shop.png')

"Step 3: Click on link logo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on link logo - Navigate to page .png')

"Step 4: Click on input searchProduct -> Navigate to page 'search/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_searchProduct'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on input searchProduct - Navigate to page search.png')

"Step 5: Enter input value in input searchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_search/input_searchProduct'), var_1_input_searchProduct)

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Enter input value in input searchProduct.png')

"Step 6: Click on div loader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/div_loader'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on div loader.png')

"Step 7: Click on link home -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on link home - Navigate to page .png')

"Step 8: Click on input searchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_searchProduct'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on input searchProduct.png')

"Step 9: Enter input value in input searchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_searchProduct'), var_2_input_searchProduct)

WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Enter input value in input searchProduct.png')

"Step 10: Click on main content"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/main_content'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on main content.png')

"Step 11: Click on link logo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Click on link logo.png')

"Step 12: Click on link shop2 -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on link shop2 - Navigate to page shop.png')

"Step 13: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Hover over div object.png')

"Step 14: Click on button addToBasket -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/button_addToBasket_2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on button addToBasket - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Search and Add Product to Basket from Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}