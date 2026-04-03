import com.example.orangehrm.LoginPage
import com.example.orangehrm.LeavePage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
WebUI.maximizeWindow()

LoginPage.login('Admin', 'admin123')
LeavePage.verifyLeaveStatus('Pending Approval')

WebUI.takeScreenshot('Reports/OrangeHRM_VerifyLeave.png')
WebUI.closeBrowser()
