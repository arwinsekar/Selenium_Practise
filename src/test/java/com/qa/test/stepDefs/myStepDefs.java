package com.qa.test.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myStepDefs {

        @Given("^sample feature file is ready$")
        public void givenStatement() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://askomdch.com");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
            driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Blue");
            driver.findElement(By.cssSelector("button[value='Search']")).click();
            Thread.sleep(5000);
            Assert.assertEquals( driver.findElement(By.cssSelector(".woocommerce-products-header__title.page-title")).getText(),"Search results: “Blue”");
            driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("a[title='View cart']")).click();
            Assert.assertEquals( driver.findElement(By.cssSelector("td[class='product-name'] a")).getText(),"Blue Shoes");
            driver.findElement(By.cssSelector(".checkout-button")).click();
            driver.findElement(By.id("billing_first_name")).sendKeys("demo");
            driver.findElement(By.id("billing_last_name")).sendKeys("user");
            driver.findElement(By.id("billing_company")).sendKeys("San Francisco");
            driver.findElement(By.id("billing_address_1")).sendKeys("San Francisco");
            driver.findElement(By.id("billing_city")).sendKeys("San Francisco");
            driver.findElement(By.id("billing_postcode")).sendKeys("94188");
            driver.findElement(By.id("billing_email")).sendKeys("askomdch@gmail.com");
            driver.findElement(By.id("place_order")).click();
            Thread.sleep(5000);
            Assert.assertEquals( driver.findElement(By.cssSelector(".woocommerce-notice")).getText(),"Thank you. Your order has been received.");

        System.out.println("Given statement executed successfully");
    }

        @When("^I run the feature file$")
        public void whenStatement() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://askomdch.com");
            driver.manage().window().maximize();
            driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
            driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Blue");
            driver.findElement(By.cssSelector("button[value='Search']")).click();
            Thread.sleep(5000);
            Assert.assertEquals( driver.findElement(By.cssSelector(".woocommerce-products-header__title.page-title")).getText(),"Search results: “Blue”");
            driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("a[title='View cart']")).click();
            Assert.assertEquals( driver.findElement(By.cssSelector("td[class='product-name'] a")).getText(),"Blue Shoes");
            driver.findElement(By.cssSelector(".checkout-button")).click();
            driver.findElement(By.className("showlogin")).click();
            driver.findElement(By.id("username")).sendKeys("sample");
            driver.findElement(By.id("password")).sendKeys("demopwd");
            driver.findElement(By.name("login")).click();
            driver.findElement(By.id("billing_first_name")).sendKeys("demo");
            driver.findElement(By.id("billing_last_name")).sendKeys("user");
            driver.findElement(By.id("billing_company")).sendKeys("San Francisco");
            driver.findElement(By.id("billing_address_1")).sendKeys("San Francisco");
            driver.findElement(By.id("billing_city")).sendKeys("San Francisco");
            driver.findElement(By.id("billing_postcode")).sendKeys("94188");
            driver.findElement(By.id("billing_email")).clear();
            driver.findElement(By.id("billing_email")).sendKeys("askomdch@gmail.com");
            driver.findElement(By.id("place_order")).click();
            Thread.sleep(5000);
            Assert.assertEquals( driver.findElement(By.cssSelector(".woocommerce-notice")).getText(),"Thank you. Your order has been received.");
        System.out.println("When statement executed successfully");
    }

        @Then("^run should be successful$")
        public void thenStatement(){
        System.out.println("Then statement executed successfully");
    }

}
