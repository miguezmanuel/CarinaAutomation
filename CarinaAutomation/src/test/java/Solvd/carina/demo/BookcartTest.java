package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.bookcart.components.BookcartHeader;
import com.solvd.carina.demo.gui.bookcart.pages.BookcartHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BookcartTest implements IAbstractTest {

    Logger logger = LogManager.getLogger();

    @Test
    public void checkResultsList () {

        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        BookcartHomePage homePage = new BookcartHomePage(getDriver());
        BookcartHeader header = homePage.getBookcartHeader();

        getDriver().navigate().to("https://bookcart.azurewebsites.net/");
        header.typeSearchInput("Harry");

        List<String> resultsList = header.getBookcartSearchResultList();
        Assert.assertTrue(resultsList.contains("Harry"), "The list does not contain a result similar to the search");

        logger.info(resultsList);

    }
}
