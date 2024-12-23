package com.solvd.carina.demo.gui.bookcart.pages;

import com.solvd.carina.demo.gui.bookcart.common.BookcartBasePage;
import com.solvd.carina.demo.gui.bookcart.components.BookcartBookCard;
import com.solvd.carina.demo.gui.bookcart.components.BookcartHeader;
import org.openqa.selenium.WebDriver;

public class BookcartHomePage extends BookcartBasePage {

    public BookcartHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BookcartHeader getBookcartHeader() {
        return super.getBookcartHeader();
    }

    @Override
    public BookcartBookCard getBookcartBookCard() {
        return super.getBookcartBookCard();
    }

    public void searchBook (String bookName) {

    }
}
