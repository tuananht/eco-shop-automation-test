import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.selectSizeAndColorAddToBasket
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

"Step 2: Click on link Recommended -> Navigate to page 'recommended#recommended'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Recommended'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link Recommended - Navigate to page recommendedrecommended.png')

"Step 3: Hover over div RecommendedContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'recommended?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_recommended/div_RecommendedContent'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Hover over div RecommendedContent.png')

"Step 4: Click on image RecommendedProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'recommended?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/image_RecommendedProduct'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on image RecommendedProduct.png')

"Step 5: Select size and color then add item to basket"

selectSizeAndColorAddToBasket.execute()

"Step 6: Click on input SearchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shop/input_SearchProduct'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on input SearchProduct.png')

"Step 7: Enter input value in input SearchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shop/input_SearchProduct'), input_SearchProduct)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Enter input value in input SearchProduct.png')

"Step 8: Press key Enter on input SearchProduct -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'shop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_shop/input_SearchProduct'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Press key Enter on input SearchProduct - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Search and Add Recommended Product to Basket_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}