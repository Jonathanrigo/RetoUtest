package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUtestPage  {
    public static final Target BUTTON_JOIN_TODAY = Target.the("Boton de registro").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target INPUT_FIRST_NAME = Target.the("Campo para ingresar el nombre del usuario").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME= Target.the("Campo para ingresar los apellidos del usuario").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Campo para ingresar el correo electronico").located(By.id("email"));
    public static final Target LIST_MONTH = Target.the("Campo para seleccionar el mes de nacimiento").located(By.id("birthMonth"));
    public static final Target LIST_DAY = Target.the("Campo para seleccionar el dia de nacimiento").located(By.id("birthDay"));
    public static final Target LIST_YEAR = Target.the("Campo para ingresar el año de nacimiento").located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Boton siguiente locacion").located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target LBL_REGISTRO_COMPLETO = Target.the("Mensaje de bienvenida").located(By.xpath("//div[@class='image-box-header']/h1"));
}
