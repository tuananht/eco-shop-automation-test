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

"Step 2: Hover over div productDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_productDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Hover over div productDisplay.png')

"Step 3: Click on image productCardImg -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_productCardImg'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on image productCardImg - Navigate to page product.png')

"Step 4: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Hover over div object.png')

"Step 5: Click on header schefferaOctophylla"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/header_schefferaOctophylla'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on header schefferaOctophylla.png')

"Step 6: Click on link featured -> Navigate to page 'featured'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_featured'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on link featured - Navigate to page featured.png')

"Step 7: Click on link shop -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/featured?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured/link_shop'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on link shop - Navigate to page shop.png')

"Step 8: Click on link recommended -> Navigate to page 'recommended'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/link_recommended'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on link recommended - Navigate to page recommended.png')

"Step 9: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/recommended?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_recommended/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Hover over div object.png')

"Step 10: Click on image object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/recommended?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/image_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on image object - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Navigate and Verify Home Page After Product Interactions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}