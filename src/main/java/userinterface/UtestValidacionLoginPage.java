package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestValidacionLoginPage extends PageObject {

    public static final Target VALIDACION = Target.the("Ingrese su usuario para iniciar sesion").
            located(By.xpath("//*[@id='kc-header-wrapper']/div/section/div[1]"));
}
