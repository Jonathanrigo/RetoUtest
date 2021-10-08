package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUtestPage3 {
    public static final Target LIST_YOUR_COMPUTER = Target.the("Lista con los sistemas operativos disponibles").located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[1]"));
    public static final Target SEARCH_COMPUTER = Target.the("Seleccionar sistema operativo").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target LIST_VERSION = Target.the("Lista con las versiones disponibles").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target SEARCH_VERSION = Target.the("Seleccionar version").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target LIST_LANGUAGE = Target.the("Lista con las lenguajes disponibles").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target SEARCH_LANGUAGE = Target.the("Seleccionar lenguaje").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target LIST_MOVIL_DEVICE = Target.the("Lista con los devices mobiles disponibles").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target SEARCH_MOVIL_DEVICE = Target.the("Seleccionar device movil").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target LIST_MODEL = Target.the("Lista con los modelos disponibles").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target SEARCH_MODEL = Target.the("Seleccionar modelo").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target LIST_OPERATING_SYSTEM = Target.the("Lista con los sistemas operativos disponibles").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target SEARCH_OPERATING_SYSTEM = Target.the("Seleccionar sistema operativo").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target BTN_NEXT_LAST_STEP = Target.the("Boton next last step").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
