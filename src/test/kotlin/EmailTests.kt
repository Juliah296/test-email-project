import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.openqa.selenium.WebDriver
import pages.MainPage

class EmailTests : BaseTest() {

    @Test
    fun authorizationTest() {
        val mainPage = MainPage(getDriver())
        mainPage.clickSignInButton()
    }
}