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

"Step 2: Click on link signIn -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on button signUp -> Navigate to page 'signup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on button signUp - Navigate to page signup.png')

"Step 5: Login into Application"

TrueTestScripts.login()

"Step 6: Click on span button"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/span_button'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on span button.png')

"Step 7: Click on header button -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_button_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on header button - Navigate to page signin.png')

"Step 8: Login into Application"

TrueTestScripts.login()

"Step 9: Click on button signUp -> Navigate to page 'signup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on button signUp - Navigate to page signup.png')

"Step 10: Login into Application"

TrueTestScripts.login()

"Step 11: Click on div button"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_button'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on div button.png')

"Step 12: Click on header button -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_button_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on header button - Navigate to page signin.png')

"Step 13: Click on button signUp -> Navigate to page 'signup'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_signUp'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Click on button signUp - Navigate to page signup.png')

"Step 14: Login into Application"

TrueTestScripts.login()

"Step 15: Click on div button"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_button'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Click on div button.png')

"Step 16: Click on header button -> Navigate to page 'signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/header_button_1'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Click on header button - Navigate to page signin.png')

"Step 17: Click on link home -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Click on link home - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Multiple SignUp and SignIn Attempts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}