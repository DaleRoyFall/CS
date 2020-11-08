/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deviantart;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author User
 */
public class DeviantartAuthentification {

    private WebDriver driver;

    @Given("Launch Chrome browser and open deviantart.com/login page")
    public void launch_chrome_browser_and_open_deviantart_com_login_page() {
        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.deviantart.com/users/login");
    }

    @When("Login in my account")
    public void login_in_my_account() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));

        usernameField.sendKeys("DaleRoyFall");
        passwordField.sendKeys("didas1");
        loginButton.click();
    }

    @Then("Make a search from browser")
    public void make_a_search_from_browser() {
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/header/div[1]/div[2]/button"));
        searchButton.click();

        WebElement searchField = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/form/div/div/div[1]/input"));
        searchField.sendKeys("DaleRoyFall");

        WebElement searchImagesButton = driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div/form/button"));
        searchImagesButton.click();
    }

    @And("Check the list with images")
    public void check_the_list_with_images() {
        WebElement frstImagesButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div/div[3]/div[2]/div/div/div/div[1]/div/section/a/div/img"));
        frstImagesButton.click();
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.close();
    }
}
