package co.com.choucair.certification.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUtestPage2 {
    public static final Target INPUT_CITY = Target.the("Campo para ingresar la ciudad de origen").located(By.id("city"));
    public static final Target INPUT_CODE_POSTAL = Target.the("Campo para ingresar el codigo postal").located(By.id("zip"));
    public static final Target LIST_COUNTRY = Target.the("Campo para seleccionar el pais de origen").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target SEARCH_COUNTRY = Target.the("Lista de paises").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Boton next devices").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
