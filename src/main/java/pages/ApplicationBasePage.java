package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@Slf4j
public abstract class ApplicationBasePage {

    WebDriver driver;

    @Getter
    @AllArgsConstructor
    private enum Locator {

        CART_BUTTON(By.id("nav-cart-text-container")),
        PAGE_ONE(By.id("root")),
        PAGE_BODY(By.id("root"));

        Locator(By locatorValue) {}
    }


    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public void clickOnElement(By locator) {
        clickOnElementWithJsExecutor(findElement(locator));

    }
    public void clickOnContinueButton() {
    }

    public ApplicationBasePage clickOnElementWithJsExecutor(WebElement element) {

        (new Actions(this.driver)).moveToElement(element).perform();
        JavascriptExecutor executor = (JavascriptExecutor)this.driver;
        executor.executeScript("arguments[0].click;", new Object[]{element});
        return this;
    }


}
