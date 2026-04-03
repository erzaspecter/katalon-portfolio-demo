import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys


WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.takeScreenshotAsCheckpoint("login page")

WebUI.callTestCase(
    findTestCase('Common Test Cases/CURA_Login'),
    [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'],
    FailureHandling.STOP_ON_FAILURE
)

WebUI.takeScreenshotAsCheckpoint("appointment page")

WebUI.selectOptionByLabel(findTestObject('CURA/Appointment/lst_Facility'),
    'Hongkong CURA Healthcare Center', false)

WebUI.check(findTestObject('CURA/Appointment/chk_Medicaid'))
WebUI.check(findTestObject('CURA/Appointment/chk_Readmission'))

WebUI.setText(findTestObject('CURA/Appointment/txt_VisitDate'), '27/12/2016')
WebUI.sendKeys(findTestObject('CURA/Appointment/txt_VisitDate'), Keys.chord(Keys.ESCAPE))
WebUI.setText(findTestObject('CURA/Appointment/txt_Comment'),
    'Please make appointment as soon as possible.')

WebUI.click(findTestObject('CURA/Appointment/btn_BookAppointment'))
WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.takeFullPageScreenshotAsCheckpoint("booked appointment",
    [findTestObject('CURA/AppointmentConfirmation/lbl_VisitDate')])

WebUI.closeBrowser()
