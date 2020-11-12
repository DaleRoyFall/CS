package deviantart.featureImpl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deviantart {

    private WebDriver driver;

    @Given("Launch Chrome browser")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("Open deviantart.com login page")
    public void open_deviantart_com_login_page() {
        driver.get("https://www.deviantart.com/users/login");
    }

    @Then("Login in my account")
    public void login_in_my_account() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));

        usernameField.sendKeys("DaleRoyFall");
        passwordField.sendKeys("didas1");
        loginButton.click();
    }

    @And("Make a search from browser")
    public void make_a_search_from_browser() {
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[1]/div[1]/button"));
        searchButton.click();

        WebElement searchField = driver.findElement(By.xpath("/html/body/div[15]/div/div/div/div/form/div/div/div[1]/input"));
        searchField.sendKeys("DaleRoyFall");

        WebElement searchImagesButton = driver.findElement(By.xpath("/html/body/div[15]/div/div/div/div/form/button"));
        searchImagesButton.click();
    }

    @Then("Check the list with images")
    public void check_the_list_with_images() {
        WebElement frstImagesButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/div/div[3]/div[2]/div/div/div/div[1]/div/section/a/div/img"));
        frstImagesButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("Close the browser")
    public void close_the_browser() {
        driver.close();
    }
}
