package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
@Given("Open chrome and facebook")
public void open_chrome_and_facebook() {
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
	
}

@When("To pass email and invalid pass")
public void to_pass_email_and_invalid_pass() {
    driver.findElement(By.id("email")).sendKeys("aafrin@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("1234");
    
}

@When("To get page title")
public void to_get_page_title() {
    String title = driver.getTitle();
    System.out.println(title);
}

@Then("close the browser")
public void close_the_browser() {
   driver.close();
}

@When("To pass invalid email and invalid pass")
public void to_pass_invalid_email_and_invalid_pass() {
	driver.findElement(By.id("email")).sendKeys("smartskills@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("7654");
    
}

@When("To click login button")
public void to_click_login_button() {
	driver.findElement(By.name("logi....n")).click();   
}


}
