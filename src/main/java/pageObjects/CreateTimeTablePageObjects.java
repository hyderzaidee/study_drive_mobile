package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreateTimeTablePageObjects {

    public CreateTimeTablePageObjects(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



    @AndroidFindBy(id = "de.scoolio.app.dev:id/market_highlight_button_image")
    public WebElement StundenPlanErstellen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bio']")
    public WebElement SelectSubjectBio;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/timetable_cell_add")
    public WebElement AddSubject;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AWT']")
    public WebElement SelectSubjectAWT;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Che']")
    public WebElement SelectSubjectChe;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='B-Woche']")
    public WebElement SelectWeekB;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/timetable_edit_end")
    public WebElement Create;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/timetable_edit_start")
    public WebElement Edit;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/timetable_share_skip_to_dashboard_btn")
    public WebElement Skip;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/dashboard_item_timetable_button_text")
    public WebElement EditTimeTable;










}
