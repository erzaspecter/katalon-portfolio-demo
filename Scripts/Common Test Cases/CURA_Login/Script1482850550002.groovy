import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// buka browser kosong
WebUI.openBrowser('')

// arahkan ke site demo
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

// klik tombol appointment
WebUI.click(findTestObject('CURA/Homepage/btn_MakeAppointment'))

// isi username & password
WebUI.setText(findTestObject('CURA/Login/txt_UserName'), 'John Doe')
WebUI.setText(findTestObject('CURA/Login/txt_Password'), 'ThisIsNotAPassword')

// klik login
WebUI.click(findTestObject('CURA/Login/btn_Login'))

// verifikasi halaman appointment muncul
WebUI.verifyElementPresent(findTestObject('CURA/Appointment/div_Appointment'), GlobalVariable.G_Timeout)

// tutup browser
//WebUI.closeBrowser()
