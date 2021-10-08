package co.com.choucair.certification.Utest.tasks;

import co.com.choucair.certification.Utest.model.UtestData;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPage;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPage2;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPage3;
import co.com.choucair.certification.Utest.userinterface.RegistroUtestPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import java.util.List;

public class RegistroUtest implements Task {
    private String first_name;
    private String last_name;
    private String email;
    private String month;
    private String day;
    private String year;
    private String city;
    private String postal_code;
    private String country;
    private String computer;
    private String version;
    private String language;
    private String mobile;
    private String model;
    private String operating_system;
    private String password;
    private String confirm_password;
    private List<UtestData> utestData;

    public RegistroUtest(List<UtestData> utestData) {
        this.first_name =  utestData.get(0).getFirst_name();
        this.last_name =  utestData.get(0).getLast_name();
        this.email = utestData.get(0).getEmail();
        this.month =  utestData.get(0).getMonth();
        this.day = utestData.get(0).getDay();
        this.year =  utestData.get(0).getYear();
        this.city = utestData.get(0).getCity();
        this.postal_code = utestData.get(0).getPostal_code();
        this.country =  utestData.get(0).getCountry();
        this.computer = utestData.get(0).getComputer();
        this.version = utestData.get(0).getVersion();
        this.language =  utestData.get(0).getLanguage();
        this.mobile =  utestData.get(0).getMobile();
        this.model =  utestData.get(0).getModel();
        this.operating_system =  utestData.get(0).getOperating_system();
        this.password =  utestData.get(0).getPassword();
        this.confirm_password =  utestData.get(0).getConfirm_password();
        this.utestData = utestData;
    }

    public static RegistroUtest registro(List<UtestData> utestData){
        return Tasks.instrumented(RegistroUtest.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        pageOne(actor);
        pageTwo(actor);
        pageThree(actor);
        pageFor(actor);
        espera();
    }

    public void pageOne(Actor actor){
        actor.attemptsTo(Click.on(RegistroUtestPage.BUTTON_JOIN_TODAY),
                Enter.theValue(first_name).into(RegistroUtestPage.INPUT_FIRST_NAME),
                Enter.theValue(last_name).into(RegistroUtestPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(RegistroUtestPage.INPUT_EMAIL),
                Click.on(RegistroUtestPage.LIST_MONTH),
                SelectFromOptions.byVisibleText(month).from(RegistroUtestPage.LIST_MONTH),
                Click.on(RegistroUtestPage.LIST_DAY),
                SelectFromOptions.byVisibleText(day).from(RegistroUtestPage.LIST_DAY),
                Click.on(RegistroUtestPage.LIST_YEAR),
                SelectFromOptions.byVisibleText(year).from(RegistroUtestPage.LIST_YEAR),
                Click.on(RegistroUtestPage.BUTTON_NEXT_LOCATION)
        );
    }

    public void pageTwo(Actor actor){
        actor.attemptsTo(Enter.theValue(city).into(RegistroUtestPage2.INPUT_CITY),
                Enter.theValue(postal_code).into(RegistroUtestPage2.INPUT_CODE_POSTAL),
                Click.on(RegistroUtestPage2.LIST_COUNTRY),
                Enter.theValue(country).into(RegistroUtestPage2.SEARCH_COUNTRY),
                Scroll.to(RegistroUtestPage2.SEARCH_COUNTRY),
                Click.on(RegistroUtestPage2.BUTTON_NEXT_DEVICES)
        );
    }

    public void pageThree(Actor actor){
        actor.attemptsTo(Click.on(RegistroUtestPage3.LIST_YOUR_COMPUTER),
                Enter.theValue(computer).into(RegistroUtestPage3.SEARCH_COMPUTER),
                //SendKeys.of(Keys.ENTER).into(RegistroUtestPage.SEARCH_COMPUTER),
                Click.on(RegistroUtestPage3.LIST_VERSION),
                Enter.theValue(version).into(RegistroUtestPage3.SEARCH_VERSION),
                Click.on(RegistroUtestPage3.LIST_LANGUAGE),
                Enter.theValue(language).into(RegistroUtestPage3.SEARCH_LANGUAGE),
                Click.on(RegistroUtestPage3.LIST_MOVIL_DEVICE),
                Enter.theValue(mobile).into(RegistroUtestPage3.SEARCH_MOVIL_DEVICE),
                SendKeys.of(Keys.ENTER).into(RegistroUtestPage3.SEARCH_MOVIL_DEVICE),
                Click.on(RegistroUtestPage3.LIST_MODEL),
                Enter.theValue(model).into(RegistroUtestPage3.SEARCH_MODEL),
                SendKeys.of(Keys.ENTER).into(RegistroUtestPage3.SEARCH_MODEL),
                Click.on(RegistroUtestPage3.LIST_OPERATING_SYSTEM),
                Enter.theValue(operating_system).into(RegistroUtestPage3.SEARCH_OPERATING_SYSTEM),
                SendKeys.of(Keys.ENTER).into(RegistroUtestPage3.SEARCH_OPERATING_SYSTEM),
                Click.on(RegistroUtestPage3.BTN_NEXT_LAST_STEP)
        );
    }

    public void pageFor(Actor actor){
        actor.attemptsTo(Enter.theValue(password).into(RegistroUtestPage4.INPUT_PASSWORD),
                Enter.theValue(confirm_password).into(RegistroUtestPage4.INPUT_CONFIRM_PASSWORD),
                Click.on(RegistroUtestPage4.CHECKBOX_UTEST),
                Click.on(RegistroUtestPage4.CHECKBOX_PRIVACY_POLICY),
                Click.on(RegistroUtestPage4.BTN_COMPLETE)
        );
    }
    public void espera(){
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
