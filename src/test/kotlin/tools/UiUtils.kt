package tools

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration


class UiUtils(_driver: WebDriver) {
    var driver: WebDriver

    init {
        driver = _driver
    }

    fun checkElementIsVisible(element: WebElement): WebElement {
        val wait = WebDriverWait(driver, Duration.ofSeconds(10))
        return wait.until(ExpectedConditions.visibilityOf(element))
    }
}