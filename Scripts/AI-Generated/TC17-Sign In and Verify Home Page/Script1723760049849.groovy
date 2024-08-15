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

"Step 2: Click on header button"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_button'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on header button.png')

"Step 3: Click on header button -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_button_1'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on header button - Navigate to page signin.png')

"Step 4: Click on main content"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/main_content'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on main content.png')

"Step 5: Click on div authUndefined"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/div_authUndefined'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on div authUndefined.png')

"Step 6: Click on button signInArrowRight -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signInArrowRight'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on button signInArrowRight - Navigate to page .png')

"Step 7: Click on main content"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/main_content'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on main content.png')

"Step 8: Click on span button"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_button'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on span button.png')

"Step 9: Click on header button -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_button_1'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on header button - Navigate to page signin.png')

"Step 10: Login into Application"

TrueTestScripts.login()

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Sign In and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}