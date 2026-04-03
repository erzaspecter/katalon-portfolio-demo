import com.example.orangehrm.LoginPage
import com.example.orangehrm.EmployeePage
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
WebUI.maximizeWindow()

LoginPage.login('Admin', 'admin123')
EmployeePage.searchEmployee('John Doe')

WebUI.takeScreenshot('Reports/OrangeHRM_SearchEmployee.png')
WebUI.closeBrowser()
