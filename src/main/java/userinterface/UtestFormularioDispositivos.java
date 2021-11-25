package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormularioDispositivos extends PageObject {

    public static final Target INPUT_COMPUTADOR = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.name("osId"));
    public static final Target INPUT_VERSION = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.name("osVersionId"));
    public static final Target INPUT_LENGUAJE = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.name("osLanguageId"));
    public static final Target INPUT_MOVIL = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.name("handsetMakerId"));
    public static final Target INPUT_MODELO = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.name("handsetModelId"));
    public static final Target INPUT_SO = Target.the("caja de texto para ingreso de la ciudad ").
            located(By.name("handsetOSId"));

    public static final Target SELECT_OPTION = Target.the("caja de texto para ingreso de la ciudad ").
            locatedBy(("//*[@class='ui-select-choices-row-inner']/div[contains(text(),'{0}')]"));

    public static final Target BUTTON_NEXT = Target.the("caja de texto para ingreso de la ciudad ").
            locatedBy(("//*[@class='btn btn-blue pull-right']"));

}
