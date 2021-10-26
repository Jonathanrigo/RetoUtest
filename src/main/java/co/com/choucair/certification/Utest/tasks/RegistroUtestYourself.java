package co.com.choucair.certification.Utest.tasks;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPageYourself;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import static net.serenitybdd.screenplay.actions.Enter.*;

public class RegistroUtestYourself implements Task {
    UtestData utestData;

    public RegistroUtestYourself(UtestData utestData) {
        this.utestData = utestData;
    }

    public static RegistroUtestYourself registro(UtestData utestData) {
        return Tasks.instrumented(RegistroUtestYourself.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroUtestPageYourself.BUTTON_JOIN_TODAY),
                theValue(utestData.getFirst_name()).into(RegistroUtestPageYourself.INPUT_FIRST_NAME),
                theValue(utestData.getLast_name()).into(RegistroUtestPageYourself.INPUT_LAST_NAME),
                theValue(utestData.getEmail()).into(RegistroUtestPageYourself.INPUT_EMAIL),
                Click.on(RegistroUtestPageYourself.LIST_MONTH),
                SelectFromOptions.byVisibleText(utestData.getMonth()).from(RegistroUtestPageYourself.LIST_MONTH),
                Click.on(RegistroUtestPageYourself.LIST_DAY),
                SelectFromOptions.byVisibleText(utestData.getDay()).from(RegistroUtestPageYourself.LIST_DAY),
                Click.on(RegistroUtestPageYourself.LIST_YEAR),
                SelectFromOptions.byVisibleText(utestData.getYear()).from(RegistroUtestPageYourself.LIST_YEAR),
                Click.on(RegistroUtestPageYourself.BUTTON_NEXT_LOCATION)
        );
    }
}
