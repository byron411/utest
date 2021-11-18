package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.ChoucairRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairRegisterPage.REGISTER_BUTTON),
                Enter.theValue("IngresarPrimerNombre").into(ChoucairRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue("IngresarApellido").into(ChoucairRegisterPage.INPUT_LAST_NAME),
                Enter.theValue("IngresarCorreo@gmail.com").into(ChoucairRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("April").from(ChoucairRegisterPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText("15").from(ChoucairRegisterPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("1993").from(ChoucairRegisterPage.INPUT_YEAR),
                Click.on(ChoucairRegisterPage.NEXT_BUTTON));

    }
}