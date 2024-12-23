package com.solvd.carina.demo.gui.bookcart.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BookcartHeader extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='brand-title']/button")
    private ExtendedWebElement bookcartIcon;
    @FindBy(xpath = "//input[@aria-label='search']")
    private ExtendedWebElement bookcartSearchBar;
    @FindBy(xpath = "[role='listbox'] span")
    private List<ExtendedWebElement> searchResults;
    @FindBy(xpath = "//mat-icon[contains(text(), 'shopping_cart')]")
    private ExtendedWebElement bookcartCartButton;
    @FindBy(xpath = "//button[@mattooltip='Login']")
    private ExtendedWebElement bookcartLoginButton;
    @FindBy(xpath = "//span[contains(text(), 'Swagger')]")
    private ExtendedWebElement bookcartSwaggerButton;
    @FindBy(xpath = "//span[contains(text(), 'GitHub')]")
    private ExtendedWebElement bookcartGithubButton;

    public BookcartHeader(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickBookcartIconButton () {
        bookcartIcon.click();
    }

    public void clickSearchbar () {
        bookcartSearchBar.click();
    }

    public void typeSearchInput (String searchInput) {
        bookcartSearchBar.type(searchInput);
    }

    public List<String> getBookcartSearchResultList () {
        List<String> list = new ArrayList<>();

        for (int i = 0; i > searchResults.size(); i++) {
            list.add(searchResults.get(i).getText());
        }
        return list;
    }

    public void clickCartButton () {
        bookcartCartButton.click();
    }

    public void clickLoginButton () {
        bookcartLoginButton.click();
    }

    public void clickSwaggerButton () {
        bookcartSwaggerButton.click();
    }

    public void clickGithubButton () {
        bookcartSwaggerButton.click();
    }


}
