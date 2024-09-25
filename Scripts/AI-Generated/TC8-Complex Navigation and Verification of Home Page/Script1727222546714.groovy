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

"Step 4: Click on button shopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_shopping'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on button shopping.png')

"Step 5: Click on button clearBasket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_clearBasket'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button clearBasket.png')

"Step 6: Click on div plantAtreeMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_plantAtreeMessage2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on div plantAtreeMessage2.png')

"Step 7: Click on link signIn -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on link signIn - Navigate to page signin.png')

"Step 8: Click on button continueWithGoogle -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_continueWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on button continueWithGoogle - Navigate to page .png')

"Step 9: Click on image userNavImg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/image_userNavImg'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on image userNavImg.png')

"Step 10: Click on link viewAccount -> Navigate to page '/account'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_viewAccount'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on link viewAccount - Navigate to page account.png')

"Step 11: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/account?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on div object.png')

"Step 12: Click on header viewAccount -> Navigate to page '/signin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/account?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_account/header_viewAccount'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on header viewAccount - Navigate to page signin.png')

"Step 13: Click on button continueWithGoogle -> Navigate to page 'admin/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/signin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signin/button_continueWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on button continueWithGoogle - Navigate to page admindashboard.png')

"Step 14: Click on header users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/header_users'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on header users.png')

"Step 15: Click on header users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/header_users'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on header users.png')

"Step 16: Click on header users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/header_users'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on header users.png')

"Step 17: Click on link products -> Navigate to page 'admin/products'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/link_products'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on link products - Navigate to page adminproducts.png')

"Step 18: Click on header users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_products/header_users'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on header users.png')

"Step 19: Click on button showMoreItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_products/button_showMoreItems'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on button showMoreItems.png')

"Step 20: Click on header users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_products/header_users'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on header users.png')

"Step 21: Click on link adminPanel -> Navigate to page 'admin/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_products/link_adminPanel'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on link adminPanel - Navigate to page admindashboard.png')

"Step 22: Click on link adminPanel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/link_adminPanel'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on link adminPanel.png')

"Step 23: Click on link adminPanel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/link_adminPanel'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Click on link adminPanel.png')

"Step 24: Click on header users"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/header_users'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on header users.png')

"Step 25: Click on link products -> Navigate to page 'admin/products'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_dashboard/link_products'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25-Click on link products - Navigate to page adminproducts.png')

"Step 26: Click on button moreFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_products/button_moreFilters'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Click on button moreFilters.png')

"Step 27: Click on div object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/products?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_products/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27-Click on div object - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Complex Navigation and Verification of Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}