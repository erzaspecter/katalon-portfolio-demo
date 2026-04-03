WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Common Test Cases/OrangeHRM/OrangeHRM_Login'),
    [('Username') : 'Admin', ('Password') : 'admin123'],
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Test Cases/OrangeHRM/OrangeHRM_NavigateToEmployee'), [:], FailureHandling.STOP_ON_FAILURE)

EmployeePage.addEmployee('John', 'Doe')

WebUI.closeBrowser()
