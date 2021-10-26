package co.com.choucair.certification.Utest.tasks;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPageStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class RegistroUtestStep implements Task {
    UtestData utestData;

    public RegistroUtestStep(UtestData utestData) {
        this.utestData = utestData;
    }

    public static RegistroUtestStep registro(UtestData utestData) {
        return Tasks.instrumented(RegistroUtestStep.class,utestData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(theValue(utestData.getPassword()).into(RegistroUtestPageStep.INPUT_PASSWORD),
                theValue(utestData.getConfirm_password()).into(RegistroUtestPageStep.INPUT_CONFIRM_PASSWORD),
                Click.on(RegistroUtestPageStep.CHECKBOX_UTEST),
                Click.on(RegistroUtestPageStep.CHECKBOX_PRIVACY_POLICY),
                Click.on(RegistroUtestPageStep.BTN_COMPLETE)
        );
    }
}
