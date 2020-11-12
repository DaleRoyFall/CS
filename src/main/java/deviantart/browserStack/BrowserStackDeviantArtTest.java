package deviantart.browserStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackDeviantArtTest {
    public static final String USERNAME = "daleroyfall1";
    public static final String AUTOMATE_KEY = "xTof8xDa94yi5LifPNqP";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private static WebDriver driver;

    public static void main(String[] args) throws Exception {
        launch_chrome_browser();
        open_deviantart_com_login_page();
        login_in_my_account();
        make_a_search_from_browser();
        check_the_list_with_images();
        close_the_browser();
    }

    public static void launch_chrome_browser() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");

        caps.setCapability("name", "DeviantArt verify images");

        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new RemoteWebDriver(new URL(URL), caps);
    }

    public static void open_deviantart_com_login_page() {
        driver.get("https://www.deviantart.com/users/login");
    }

    public static void login_in_my_account() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));

        usernameField.sendKeys("DaleRoyFall");
        passwordField.sendKeys("didas1");
        loginButton.click();
    }

    public static void make_a_search_from_browser() {
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[1]/div[1]/button"));
        searchButton.click();

        WebElement searchField = driver.findElement(By.xpath("/html/body/div[15]/div/div/div/div/form/div/div/div[1]/input"));
        searchField.sendKeys("DaleRoyFall");

        WebElement searchImagesButton = driver.findElement(By.xpath("/html/body/div[15]/div/div/div/div/form/button"));
        searchImagesButton.click();
    }

    public static void check_the_list_with_images() {
        WebElement frstImagesButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/div/div[3]/div[2]/div/div/div/div[1]/div/section/a/div/img"));
        frstImagesButton.click();
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
