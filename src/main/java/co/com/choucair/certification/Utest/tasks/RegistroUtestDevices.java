package co.com.choucair.certification.Utest.tasks;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPageDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class RegistroUtestDevices implements Task {
    UtestData utestData;

    public RegistroUtestDevices(UtestData utestData) {
        this.utestData = utestData;
    }

    public static RegistroUtestDevices registro(UtestData utestData) {
        return Tasks.instrumented(RegistroUtestDevices.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistroUtestPageDevices.LIST_YOUR_COMPUTER),
                theValue(utestData.getComputer()).into(RegistroUtestPageDevices.SEARCH_COMPUTER),
                //SendKeys.of(Keys.ENTER).into(RegistroUtestPage.SEARCH_COMPUTER),
                Click.on(RegistroUtestPageDevices.LIST_VERSION),
                theValue(utestData.getVersion()).into(RegistroUtestPageDevices.SEARCH_VERSION),
                Click.on(RegistroUtestPageDevices.LIST_LANGUAGE),
                theValue(utestData.getLanguage()).into(RegistroUtestPageDevices.SEARCH_LANGUAGE),
                Click.on(RegistroUtestPageDevices.LIST_MOVIL_DEVICE),
                theValue(utestData.getMobile()).into(RegistroUtestPageDevices.SEARCH_MOVIL_DEVICE),
                SendKeys.of(Keys.ENTER).into(RegistroUtestPageDevices.SEARCH_MOVIL_DEVICE),
                Click.on(RegistroUtestPageDevices.LIST_MODEL),
                theValue(utestData.getModel()).into(RegistroUtestPageDevices.SEARCH_MODEL),
                SendKeys.of(Keys.ENTER).into(RegistroUtestPageDevices.SEARCH_MODEL),
                Click.on(RegistroUtestPageDevices.LIST_OPERATING_SYSTEM),
                theValue(utestData.getOperating_system()).into(RegistroUtestPageDevices.SEARCH_OPERATING_SYSTEM),
                SendKeys.of(Keys.ENTER).into(RegistroUtestPageDevices.SEARCH_OPERATING_SYSTEM),
                Click.on(RegistroUtestPageDevices.BTN_NEXT_LAST_STEP));
    }
}
