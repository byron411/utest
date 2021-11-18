package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.ChoucairRegisterPage;
import cucumber.api.java.vi.Cho;
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
                Click.on(ChoucairRegisterPage.NEXT_BUTTON),

                //vista 2
                //Enter.theValue("IngresarCodigoPostal").into(ChoucairRegisterPage.INPUT_CODPOSTAL),
                Click.on(ChoucairRegisterPage.NEXT_DEVICES),

                //vista 3
                Click.on(ChoucairRegisterPage.NEXT_STEP),

                //vista 4
                Enter.theValue("IngresarPASS").into(ChoucairRegisterPage.INPUT_PASS),
                Enter.theValue("IngresarPASS").into(ChoucairRegisterPage.INPUT_REPEAT_PASS),
                Click.on(ChoucairRegisterPage.CHECK1),
                Click.on(ChoucairRegisterPage.CHECK2),
                Click.on(ChoucairRegisterPage.NEXT_COMPLETE)
                );

    }
}