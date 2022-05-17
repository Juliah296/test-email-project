package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import tools.UiUtils

open class BasePage(_driver: WebDriver) {

    val driver: WebDriver
    private val utils: UiUtils

    init {
        driver = _driver
        utils = UiUtils(driver)
    }

    protected open fun clickElement(element: WebElement) {
        utils.checkElementIsVisible(element).click()
    }

}