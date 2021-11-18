package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairRegisterPage extends PageObject {
    //primera vista
    public static final Target REGISTER_BUTTON=Target.the("button that sign in utest system")
            .located(By.xpath("//a[contains(@class, 'unauthenticated-nav-bar__sign-up')]"));
    public static final Target INPUT_FIRST_NAME=Target.the("Where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME=Target.the("Where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("Where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_MONTH=Target.the("Where do we write the month of birth")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY=Target.the("Where do we write the day of birth")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR=Target.the("Where do we write the year of birth")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON=Target.the("button that show the next page")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));

    //segunda vista
    /*public static final Target INPUT_CITY=Target.the("Where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_CODPOSTAL=Target.the("Where do we write the postal code")
            .located(By.id("zip"));
    /*public static final Target SELECT_COUNTRY=Target.the("Where do we select the country")
            .located(By.xpath("//div[@class='ui-select-match']//span[contains(text(),'Colombia')]"));*/
    public static final Target NEXT_DEVICES=Target.the("button that show the next page")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));

    //tercera vista
    public static final Target NEXT_STEP=Target.the("button that show the next page")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));

    //cuarta vista
    public static final Target INPUT_PASS=Target.the("Where do we write the past")
            .located(By.id("password"));

    public static final Target INPUT_REPEAT_PASS=Target.the("Where we repeat the password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK1=Target.the("check that acept policy")
            .located(By.id("termOfUse"));

    public static final Target CHECK2=Target.the("check that acept policy")
            .located(By.id("privacySetting"));

    public static final Target NEXT_COMPLETE=Target.the("button that show the next page")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));
}
