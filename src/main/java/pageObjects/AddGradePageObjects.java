package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddGradePageObjects {

    public AddGradePageObjects(AppiumDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@index='3']/android.widget.LinearLayout[@index='1']")
    public WebElement NotenIcon;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/grades_list_add_fab")
    public WebElement AddButton;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='3']")
    public WebElement GradeSystem;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/grade_system_continue")
    public WebElement Weiter;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/subject_circle_text")
    public WebElement SelectSubject;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/dropdown_header_close_img")
    public WebElement PencilIcon;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/grade_add_accept_btn")
    public WebElement NoteHinzufugen;

    @AndroidFindBy(id = "de.scoolio.app.dev:id/toolbar_profile_textview_title")
    public WebElement HeaderText;






}
