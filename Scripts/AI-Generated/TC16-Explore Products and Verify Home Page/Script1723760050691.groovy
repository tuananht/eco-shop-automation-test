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

"Step 2: Click on div plantAtreeMakeTheWorld"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_plantAtreeMakeTheWorld'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Click on div plantAtreeMakeTheWorld.png')

"Step 3: Click on link seeAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_seeAll'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link seeAll.png')

"Step 4: Click on link seeAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_seeAll'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Click on link seeAll.png')

"Step 5: Click on link shop2 -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_shop2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on link shop2 - Navigate to page shop.png')

"Step 6: Click on div productGrid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/div_productGrid'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on div productGrid.png')

"Step 7: Click on link featured -> Navigate to page 'featured'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/link_featured'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on link featured - Navigate to page featured.png')

"Step 8: Click on link recommended -> Navigate to page 'recommended'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/featured?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured/link_recommended'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on link recommended - Navigate to page recommended.png')

"Step 9: Click on link logo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/recommended?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on link logo - Navigate to page .png')

"Step 10: Click on link logo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on link logo.png')

"Step 11: Click on span main -> Navigate to page 'shop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_main'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on span main - Navigate to page shop.png')

"Step 12: Click on link logo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on link logo - Navigate to page .png')

"Step 13: Click on input searchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_searchProduct'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on input searchProduct.png')

"Step 14: Click on span navigationButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_navigationButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on span navigationButton.png')

"Step 15: Click on span close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on span close.png')

"Step 16: Click on list navigationMenuMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/list_navigationMenuMain'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on list navigationMenuMain.png')

"Step 17: Click on link logo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on link logo.png')

"Step 18: Click on link logo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_logo'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on link logo.png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Explore Products and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}