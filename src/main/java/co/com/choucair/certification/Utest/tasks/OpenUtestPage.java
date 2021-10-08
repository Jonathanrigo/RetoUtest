package co.com.choucair.certification.Utest.tasks;

import co.com.choucair.certification.Utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtestPage implements Task {
    UtestPage utestPage;

    public static OpenUtestPage openPage(){
        return Tasks.instrumented(OpenUtestPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
