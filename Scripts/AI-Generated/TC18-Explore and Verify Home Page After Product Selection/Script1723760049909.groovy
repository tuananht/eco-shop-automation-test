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

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Click on link shop2 - Navigate to page shop.png')

"Step 3: Hover over div wealthTreeStoneLotus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_wealthTreeStoneLotus'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Hover over div wealthTreeStoneLotus.png')

"Step 4: Click on p productCardBrand -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/p_productCardBrand'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Click on p productCardBrand - Navigate to page product.png')

"Step 5: Hover over div aglaonemaRotundumPinkOfficeBonsai"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_aglaonemaRotundumPinkOfficeBonsai'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Hover over div aglaonemaRotundumPinkOfficeBonsai.png')

"Step 6: Click on header aglaonemaRotundumPink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/header_aglaonemaRotundumPink'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Click on header aglaonemaRotundumPink.png')

"Step 7: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Hover over div object.png')

"Step 8: Click on image object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_object'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Click on image object - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Explore and Verify Home Page After Product Selection_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}