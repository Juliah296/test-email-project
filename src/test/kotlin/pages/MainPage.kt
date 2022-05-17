package pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class MainPage(_driver: WebDriver) : BasePage(_driver) {

    //region elements
    private val signInButton: WebElement =
        driver.findElement(By.xpath("//button[contains(@class, 'resplash-btn_mailbox-big')]"));

    //region actions
    fun clickSignInButton(): AuthPage {
        clickElement(signInButton)
        return AuthPage(driver)
    }
}