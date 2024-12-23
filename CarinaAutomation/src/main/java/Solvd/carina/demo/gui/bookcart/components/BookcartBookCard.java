package com.solvd.carina.demo.gui.bookcart.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookcartBookCard extends AbstractUIObject {

    @FindBy(xpath = "//a[@aria-label='Book title' and contains(@href, '%s')]//img")
    private ExtendedWebElement bookCartImage;
    @FindBy(xpath = "//strong[contains(text(), '%s')]")
    private ExtendedWebElement bookCartTitle;
    @FindBy(xpath = "//strong[contains(text(), '%s')]/following::p")
    private ExtendedWebElement bookCartPrice;
    @FindBy(xpath = "//strong[contains(text(), '%s')]/following::button")
    private ExtendedWebElement bookCartAddToCartButton;

    public BookcartBookCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}
