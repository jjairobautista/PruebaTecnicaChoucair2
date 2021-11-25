package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestFormularioInfoPersonalPages extends PageObject {

    public static final Target INPUT_NOMBRE = Target.the("caja de texto para ingreso del nombre").
            located(By.name("firstName"));

    public static final Target INPUT_APELLIDO = Target.the("caja de texto para ingreso del apellido").
            located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Caja de texto para ingreso del correo").
            located(By.id("email"));

    public static final Target SELECT_MES = Target.the("Ingreso del mes de naciemiento").
            located(By.xpath("//select[@id='birthMonth']"));
    public static final Target OPCION_MES = Target.the("seleciona el mes de naciemiento").
            locatedBy(("//*[@id=\"birthMonth\"]/option[contains(text(),'{0}')]"));

    public static final Target SELECT_DAY = Target.the("Ingreso del day de naciemiento").
            located(By.xpath("//select[@id='birthDay']"));
    public static final Target OPCION_DAY = Target.the("seleciona el day de naciemiento").
            locatedBy(("//option[@label='{0}']"));

    public static final Target SELECT_ANIO = Target.the("Ingreso del año de naciemiento").
            located(By.xpath("//select[@id='birthYear']"));
    public static final Target OPCION_ANIO = Target.the("seleciona el año de naciemiento").
            locatedBy(("//option[@label='{0}']"));

    public static final Target SELECT_IDIOMA = Target.the("Agrega idioma ").
            located(By.xpath("//input[@class='ui-select-search input-xs ng-pristine ng-untouched ng-valid ng-empty']"));
    public static final Target OPCION_IDIOMA = Target.the("Agrega idioma ").
            located(By.xpath("//span[@class='ui-select-highlight']"));

    public static final Target SIGUIENTE_BOTON = Target.the("Agrega idioma ").
            located(By.xpath("//*[@class='btn btn-blue']"));

}
