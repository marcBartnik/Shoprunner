package pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

@Slf4j
public abstract class AmazonHomePage extends ApplicationBasePage {

    @Getter
    @AllArgsConstructor
    public enum Locator {

        PAGE_BODY(By.id("root"));

        Locator(By locatorValue) {}
    }

    public void click() {

    }
}
