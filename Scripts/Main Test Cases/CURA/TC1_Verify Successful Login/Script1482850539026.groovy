import com.example.cura.LoginPage

LoginPage.openLoginPage()
LoginPage.login('John Doe', 'ThisIsNotAPassword')
LoginPage.verifyLoginSuccess()
LoginPage.closeBrowser()
