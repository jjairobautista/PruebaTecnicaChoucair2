package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestUltimoPasoPage extends PageObject {

    public static final Target INPUT_CLAVE = Target.the("Caja de texto para ingreso de la contraseña").
            located(By.id("password"));
    public static final Target CONFIRMAR_CLAVE = Target.the("Caja de texto para confirmar contraseña").
            located(By.id("confirmPassword"));
    public static final Target CHECKBOX_NEWS = Target.the("check box para recibir actualizaciones").
            located(By.name("newsletterOptIn"));
    public static final Target CHECKBOX_TERMINOS = Target.the("check box  de terminos y condiciones").
            located(By.id("termOfUse"));
    public static final Target CHECKBOX_SEGURIDAD = Target.the("check box de seguridad").
            located(By.id("privacySetting"));
    public static final Target COMPLETAR_PASOS = Target.the("Terminar Proceso").
            located(By.id("laddaBtn"));


}
