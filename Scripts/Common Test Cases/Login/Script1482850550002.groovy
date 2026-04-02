import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// buka browser kosong
WebUI.openBrowser('')

// arahkan ke site demo
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// klik tombol appointment
WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))

// isi username & password
WebUI.setText(findTestObject('Page_Login/txt_UserName'), 'John Doe')
WebUI.setText(findTestObject('Page_Login/txt_Password'), 'ThisIsNotAPassword')

// klik login
WebUI.click(findTestObject('Page_Login/btn_Login'))

// verifikasi halaman appointment muncul
WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), GlobalVariable.G_Timeout)

// tutup browser
WebUI.closeBrowser()
