package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestHomePage extends PageObject {

    public static final Target REGISTRARSE_BOTON = Target.the("Boton para ir al formulario de registro").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target LOGIN_BOTON = Target.the("Boton para Iniciar Sesion").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__link']"));
}
