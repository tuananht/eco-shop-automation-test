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

WebUI.takeScreenshot(reportLocation + '/TC27/Step 2-Click on link shop2 - Navigate to page shop.png')

"Step 3: Hover over div herringbonePineTreeIndoorPlants"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_shop/div_herringbonePineTreeIndoorPlants'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3-Hover over div herringbonePineTreeIndoorPlants.png')

"Step 4: Click on div productDetails -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/div_productDetails'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4-Click on div productDetails - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-View Product Details from Shop Link_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}