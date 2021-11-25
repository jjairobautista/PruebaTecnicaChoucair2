package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormularioLocalizacionPages extends PageObject {

    public static final Target INPUT_CITY = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.id("city"));

    public static final Target INPUT_CODPOSTAL = Target.the("caja de texto para ingreso del codigo postal de la ciudad ").
            located(By.id("zip"));

    public static final Target INPUT_PAIS = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.id("city"));
    public static final Target BUTTON_NEXT = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
