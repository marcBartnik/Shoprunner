package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@Slf4j
public abstract class ApplicationBasePage<T> {

    WebElement driver;

    @Getter
    @AllArgsConstructor
    public enum Locator {

        PAGE_ONE(By.id("root")),
        PAGE_BODY(By.id("root"));

        private final By locatorValue;
    }

    public void clickOnContinueButton() {

    }

    public T clickOnElementWithJsExecutor(WebElement element) {

        (new Actions(this.driver)).moveToElement(element).perform();
        JavascriptExecutor executor = (JavascriptExecutor)this.driver;
        executor.executeScript("arguments[0].click;"), new Object[]{element};
        return this;
    }


}
