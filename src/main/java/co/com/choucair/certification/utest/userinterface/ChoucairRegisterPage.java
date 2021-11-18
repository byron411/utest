package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairRegisterPage extends PageObject {

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

    public static final Target NEXT_BUTTON=Target.the("button that sign in utest system")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));
}
