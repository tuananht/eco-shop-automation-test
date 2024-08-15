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

"Step 2: Click on link signUp -> Navigate to page 'signup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 2-Click on link signUp - Navigate to page signup.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on main content"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/main_content'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 4-Click on main content.png')

"Step 5: Click on button continueWithFacebook"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_continueWithFacebook'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 5-Click on button continueWithFacebook.png')

"Step 6: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signup?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 6-Click on link signIn - Navigate to page signin.png')

"Step 7: Click on link home -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 7-Click on link home - Navigate to page .png')

"Step 8: Click on link home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 8-Click on link home.png')

"Step 9: Hover over div productDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_home/div_productDisplay'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 9-Hover over div productDisplay.png')

"Step 10: Click on image productCardImg -> Navigate to page 'product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_productCardImg'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 10-Click on image productCardImg - Navigate to page product.png')

"Step 11: Click on div loader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_loader'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 11-Click on div loader.png')

"Step 12: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 12-Click on image object.png')

"Step 13: Click on image productModalImageCollection3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_productModalImageCollection3'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 13-Click on image productModalImageCollection3.png')

"Step 14: Click on image productModalImageCollection4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_productModalImageCollection4'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 14-Click on image productModalImageCollection4.png')

"Step 15: Click on image productModalImageCollection1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_productModalImageCollection1'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 15-Click on image productModalImageCollection1.png')

"Step 16: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 16-Click on image object.png')

"Step 17: Click on image object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 17-Click on image object.png')

"Step 18: Click on image productModalImageCollection3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_productModalImageCollection3'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 18-Click on image productModalImageCollection3.png')

"Step 19: Click on image productModalImageCollection4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_productModalImageCollection4'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 19-Click on image productModalImageCollection4.png')

"Step 20: Click on image productModalImageCollection5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_productModalImageCollection5'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 20-Click on image productModalImageCollection5.png')

"Step 21: Hover over div aglaonemaRotundumPinkOfficeBonsai"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_product/div_aglaonemaRotundumPinkOfficeBonsai'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 21-Hover over div aglaonemaRotundumPinkOfficeBonsai.png')

"Step 22: Click on image productCardImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/image_productCardImage'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 22-Click on image productCardImage.png')

"Step 23: Click on link featured -> Navigate to page 'featured'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_featured'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 23-Click on link featured - Navigate to page featured.png')

"Step 24: Click on link recommended -> Navigate to page 'recommended'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/featured?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_featured/link_recommended'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 24-Click on link recommended - Navigate to page recommended.png')

"Step 25: Click on link home -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/recommended?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_recommended/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 25-Click on link home - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-Explore Products and Verify Homepage Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}