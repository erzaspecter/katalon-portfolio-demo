import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys
import com.example.cura.LoginPage
import com.example.cura.AppointmentPage
import com.example.cura.AppointmentConfirmationPage


WebUI.comment('Story: Book an appointment')

//RunConfiguration.setWebDriverPreferencesProperty("args", ["--headless", "--disable-gpu", "--window-size=1920,1080"])

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.click(findTestObject('CURA/Appointment/Page_CURA Healthcare Service/a_btn-make-appointment'))

LoginPage.login('John Doe', 'ThisIsNotAPassword')

WebUI.comment('Fill appointment form')

AppointmentPage.fillAppointmentForm('Hongkong CURA Healthcare Center', '27/12/2016', 'Please make appointment as soon as possible.')

AppointmentPage.submitAppointment()

WebUI.comment('Verify confirmation')

AppointmentConfirmationPage.verifyConfirmation('Hongkong CURA Healthcare Center', 'Yes', 'Medicaid', '27/12/2016', 'Please make appointment as soon as possible.')

//WebUI.takeScreenshot('Reports/TC2_Appointment.png')

//WebUI.takeScreenshot('C:/Users/teuku/Katalon Studio/Personal Portfolio Erza/Reports/TC2_Appointment.png')



