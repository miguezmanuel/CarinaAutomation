package com.solvd.carina.demo.gui.bookcart.common;

import com.solvd.carina.demo.gui.bookcart.components.BookcartBookCard;
import com.solvd.carina.demo.gui.bookcart.components.BookcartHeader;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BookcartBasePage extends AbstractPage {

    @FindBy(xpath = "//mat-toolbar-row")
    private BookcartHeader bookcartHeader;
    @FindBy(xpath = "//strong[contains(text(), '%s')]/ancestor::div[contains(@class, 'p-1')]")
    private BookcartBookCard bookcartBookCard;

    public BookcartBasePage(WebDriver driver) {
        super(driver);
    }

    public BookcartHeader getBookcartHeader() {
        return bookcartHeader;
    }

    public BookcartBookCard getBookcartBookCard() {
        return bookcartBookCard;
    }

}
