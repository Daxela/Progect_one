package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mail {
    public WebDriver driver;

    @FindBy(xpath = "//*[contains(@class,'menu__item menu__item_type_link count-me legouser__menu-item legouser__menu-item_action_passport legouser__menu-item legouser__menu-item_action_passport')]")
    private WebElement account;

    @FindBy(xpath = "//*[contains(@class, 'user-pic user-pic_has-plus_ user-account__pic')]")
    private WebElement profile;

    public Mail(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickProfile(){
        profile.click();
    }

    public void returnToProfile(){
        account.click();
    }
}
