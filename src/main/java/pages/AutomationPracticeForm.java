package pages;

import manager.dto.StudentDTO;
import manager.enums.Gender;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AutomationPracticeForm extends BasePage{

    public AutomationPracticeForm(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,10), this);
    }

    @FindBy(id ="firstName")
    WebElement fieldFirstName;

    @FindBy(id ="lastName")
    WebElement fieldLastName;

    @FindBy(xpath = "//*[@placeholder='name@example.com']")
    WebElement fieldEmail;


    public AutomationPracticeForm fillStudentsForm(StudentDTO student){
        fieldFirstName.sendKeys(student.getName());
        fieldLastName.sendKeys(student.getLastName());
        fieldEmail.sendKeys(student.getEmail());
        clickGender(student.getGender());

        return this;
    }

    private void clickGender(Gender gender) {
        WebElement elementGender = driver.findElement(By.xpath(gender.getLocator()));
        elementGender.click();
    }
}
