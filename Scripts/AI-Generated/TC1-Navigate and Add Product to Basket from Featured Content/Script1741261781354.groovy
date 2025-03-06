import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link Featured -> Navigate to page 'featured content page#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Featured'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link Featured - Navigate to page featured content page.png')

"Step 3: Hover over div FeaturedContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_featured_content_page/div_FeaturedContent'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Hover over div FeaturedContent.png')

"Step 4: Click on image ProductCard -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured_content_page/image_ProductCard'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on image ProductCard - Navigate to page productproduct.png')

"Step 5: Click on div SelectSize"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SelectSize'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on div SelectSize.png')

"Step 6: Click on div SizeOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_SizeOption'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on div SizeOption.png')

"Step 7: Click on div ChooseColor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ChooseColor'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on div ChooseColor.png')

"Step 8: Click on button AddToBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_AddToBasket'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button AddToBasket.png')

"Step 9: Click on link Featured -> Navigate to page 'featured content page#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Featured'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link Featured - Navigate to page featured content page.png')

"Step 10: Hover over div FeaturedContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_featured_content_page/div_FeaturedContent2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Hover over div FeaturedContent2.png')

"Step 11: Click on image ProductDisplay -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured_content_page/image_ProductDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on image ProductDisplay - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Add Product to Basket from Featured Content_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}