package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Ingrese su usuario para iniciar sesion").
            located(By.id("username"));

    public static final Target INPUT_CLAVE = Target.the("Ingrese su clave para iniciar sesion ").
            located(By.id("password"));

    public static final Target BUTTON_INICIO = Target.the("Boton para iniciar sesion").
            located(By.id("kc-login"));

}
