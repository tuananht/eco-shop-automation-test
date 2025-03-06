import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
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

"Step 2: Click on input SearchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_SearchProduct'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on input SearchProduct.png')

"Step 3: Enter input value in input SearchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_SearchProduct'), input_SearchProduct)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Enter input value in input SearchProduct.png')

"Step 4: Press key Enter on input SearchProduct -> Navigate to page 'search#search/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_home/input_SearchProduct'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Press key Enter on input SearchProduct - Navigate to page searchsearch.png')

"Step 5: Click on link Featured -> Navigate to page 'featured content page#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/link_Featured'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link Featured - Navigate to page featured content page.png')

"Step 6: Click on input SearchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured_content_page/input_SearchProduct'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on input SearchProduct.png')

"Step 7: Click on input SearchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured_content_page/input_SearchProduct'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on input SearchProduct.png')

"Step 8: Enter input value in input SearchProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_featured_content_page/input_SearchProduct'), input_SearchProduct_1)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Enter input value in input SearchProduct.png')

"Step 9: Press key Enter on input SearchProduct -> Navigate to page 'search#search/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_featured_content_page/input_SearchProduct'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Press key Enter on input SearchProduct - Navigate to page searchsearch.png')

"Step 10: Hover over div SearchContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_search/div_SearchContent'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Hover over div SearchContent.png')

"Step 11: Click on div ProductCard -> Navigate to page 'product#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'search/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search/div_ProductCard'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on div ProductCard - Navigate to page productproduct.png')

"Step 12: Click on link SeeAll -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_SeeAll'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on link SeeAll - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Search for Products and View Featured Content_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}