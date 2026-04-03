import com.example.orangehrm.LoginPage
import com.example.orangehrm.LeavePage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
WebUI.maximizeWindow()

LoginPage.login('Admin', 'admin123')
LeavePage.applyLeave('Annual Leave', '2026-04-05', '2026-04-07')

WebUI.takeScreenshot('Reports/OrangeHRM_ApplyLeave.png')
WebUI.closeBrowser()
