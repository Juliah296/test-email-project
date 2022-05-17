import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
open class BaseTest {

    private lateinit var driver: WebDriver

    @BeforeAll
    fun createChromeDriver() {
        WebDriverManager.chromedriver().setup()
        val options = ChromeOptions()
        options.setCapability("showChromedriverLog ", true)
        options.setCapability("recreateChromeDriverSessions", true)
        driver = ChromeDriver(options)
    }

    @BeforeEach
    fun openUrl() {
        driver.get("https://mail.ru/")
    }

    fun getDriver(): WebDriver {
        return driver
    }

    @AfterAll
    fun teardown() {
        driver?.quit()
    }
}