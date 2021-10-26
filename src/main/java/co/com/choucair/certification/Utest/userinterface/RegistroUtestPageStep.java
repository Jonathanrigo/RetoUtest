package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUtestPageStep {
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar contraseña").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Campo para confirmar contraseña").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_UTEST = Target.the("Checkbox para aceptar las politicas de Utest").located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target CHECKBOX_PRIVACY_POLICY = Target.the("Checkbox para aceptar terminos y condiciones").located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target BTN_COMPLETE = Target.the("Boton confirmacion de registro").located(By.id("laddaBtn"));
}
