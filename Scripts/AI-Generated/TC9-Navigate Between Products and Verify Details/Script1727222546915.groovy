import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://eco.aut.katalon.com/"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("/")

"Step 4: Hover over div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_dynamicObject'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Hover over div dynamicObject object.png')

"Step 5: Click on image productCard (productCardImg) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productCard', ['image_productCard_class': image_productCard_class]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on image productCard productCardImg - Navigate to page product.png')

"Step 6: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link home - Navigate to page .png')

"Step 7: Hover over div dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/div_dynamicObject"
WebUI.mouseOver(findTestObject('AI-Generated/Dynamic Objects/Page_home/div_dynamicObject', ['div_dynamicObject_divNthChild': div_dynamicObject_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Hover over div dynamicObject object3.png')

"Step 8: Click on image productCard (productCardImg2) -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/image_productCard"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/image_productCard', ['image_productCard_class': image_productCard_class_1, 'image_productCard_divNthChild': image_productCard_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on image productCard productCardImg2 - Navigate to page product.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Navigate Between Products and Verify Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}