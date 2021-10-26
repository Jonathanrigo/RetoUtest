package co.com.choucair.certification.Utest.tasks;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPageAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class RegistroUtestAddress implements Task {
    UtestData utestData;

    public RegistroUtestAddress(UtestData utestData) {
        this.utestData = utestData;
    }

    public static  RegistroUtestAddress registro(UtestData utestData) {
        return Tasks.instrumented( RegistroUtestAddress.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(theValue(utestData.getCity()).into(RegistroUtestPageAddress.INPUT_CITY),
                theValue(utestData.getPostal_code()).into(RegistroUtestPageAddress.INPUT_CODE_POSTAL),
                Click.on(RegistroUtestPageAddress.LIST_COUNTRY),
                theValue(utestData.getCountry()).into(RegistroUtestPageAddress.SEARCH_COUNTRY),
                Scroll.to(RegistroUtestPageAddress.SEARCH_COUNTRY),
                Click.on(RegistroUtestPageAddress.BUTTON_NEXT_DEVICES)
        );
    }
}
