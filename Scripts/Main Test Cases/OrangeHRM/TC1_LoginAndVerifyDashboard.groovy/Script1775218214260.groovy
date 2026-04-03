import com.example.orangehrm.LoginPage
import com.example.orangehrm.DashboardPage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
WebUI.maximizeWindow()

LoginPage.login('Admin', 'admin123')
DashboardPage.verifyDashboard()

WebUI.takeScreenshot('Reports/OrangeHRM_Login.png')
WebUI.closeBrowser()
