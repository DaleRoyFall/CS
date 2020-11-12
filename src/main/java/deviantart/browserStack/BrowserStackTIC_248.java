package deviantart.browserStack;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTIC_248 {
    public static final String USERNAME = "daleroyfall1";
    public static final String AUTOMATE_KEY = "xTof8xDa94yi5LifPNqP";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private static WebDriver driver;

    public static void main(String[] args) throws Exception {
        launch_chrome_browser();
        open_loving_hermann_com_login_page();
        enter_name_of_the_product();
        press_on_find_button();
        close_the_browser();
    }

    public static void launch_chrome_browser() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");

        caps.setCapability("name", "TIC-248");

        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new RemoteWebDriver(new URL(URL), caps);
    }

    public static void open_loving_hermann_com_login_page() {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html#");
    }

    public static void enter_name_of_the_product() {
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[1]"));
        searchInput.sendKeys("watch");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void press_on_find_button() {
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[2]"));
        searchButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void close_the_browser() {
        driver.quit();
    }
}
