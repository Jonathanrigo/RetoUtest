package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUtestPageDevices {
    public static final Target LIST_YOUR_COMPUTER = Target.the("Lista con los sistemas operativos disponibles").located(By.xpath("(//span[@aria-label='Select OS'])[1]"));
    public static final Target SEARCH_COMPUTER = Target.the("Seleccionar sistema operativo").located(By.xpath("(//input[@aria-label='Select box'])[1]"));
    public static final Target LIST_VERSION = Target.the("Lista con las versiones disponibles").located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target SEARCH_VERSION = Target.the("Seleccionar version").located(By.xpath("(//input[@aria-label='Select box'])[2]"));
    public static final Target LIST_LANGUAGE = Target.the("Lista con las lenguajes disponibles").located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target SEARCH_LANGUAGE = Target.the("Seleccionar lenguaje").located(By.xpath("(//input[@aria-label='Select box'])[3]"));
    public static final Target LIST_MOVIL_DEVICE = Target.the("Lista con los devices mobiles disponibles").located(By.xpath("//span[contains(text(),'Select Brand')]"));
    public static final Target SEARCH_MOVIL_DEVICE = Target.the("Seleccionar device movil").located(By.xpath("(//input[@aria-label='Select box'])[4]"));
    public static final Target LIST_MODEL = Target.the("Lista con los modelos disponibles").located(By.xpath("//span[contains(text(),'Select a Model')]"));
    public static final Target SEARCH_MODEL = Target.the("Seleccionar modelo").located(By.xpath("(//input[@aria-label='Select box'])[5]"));
    public static final Target LIST_OPERATING_SYSTEM = Target.the("Lista con los sistemas operativos disponibles").located(By.xpath("(//span[@aria-label='Select OS'])[2]"));
    public static final Target SEARCH_OPERATING_SYSTEM = Target.the("Seleccionar sistema operativo").located(By.xpath("(//input[@aria-label='Select box'])[6]"));
    public static final Target BTN_NEXT_LAST_STEP = Target.the("Boton next last step").located(By.xpath("(//a[@role='button'])[1]"));
}
