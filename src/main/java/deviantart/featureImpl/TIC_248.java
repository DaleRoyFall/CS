package deviantart.featureImpl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TIC_248 {
    private WebDriver driver;

    @Given("Launch Chrome browser TIC-248")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("Open loving-hermann.com page TIC-248")
    public void open_loving_hermann_com_login_page() {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html#");
    }

    @Given("Enter name of the product")
    public void enter_name_of_the_product() {
        WebElement searchInput = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[1]"));
        searchInput.sendKeys("watch");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("Press on \"Find\" button")
    public void press_on_find_button() {
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/input[2]"));
        searchButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Close the browser TIC-248")
    public void close_the_browser() {
        driver.close();
    }
}
