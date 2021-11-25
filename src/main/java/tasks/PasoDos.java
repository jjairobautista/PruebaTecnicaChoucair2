package tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import userinterface.UtestFormularioLocalizacionPages;


public class PasoDos extends PageObject implements Task {

    private UtestFormularioLocalizacionPages utestFormularioLocalizacionPages;
    private String ciudad;
    private String codPostal;
    private String pais;

    public PasoDos(String ciudad, String codPostal, String pais) {
        this.ciudad = ciudad;
        this.codPostal = codPostal;
        this.pais = pais;
    }

    public static PasoDos ingreseLocalizacion(String ciudad, String codPostal, String pais) {

        return Tasks.instrumented(PasoDos.class, ciudad, codPostal, pais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.keyValues(ciudad).into(utestFormularioLocalizacionPages.INPUT_CITY),
                SendKeys.of(Keys.DOWN).into(utestFormularioLocalizacionPages.INPUT_CITY),
                SendKeys.of(Keys.ENTER).into(utestFormularioLocalizacionPages.INPUT_CITY),
                Enter.keyValues(codPostal).into(utestFormularioLocalizacionPages.INPUT_CODPOSTAL),
                Click.on(utestFormularioLocalizacionPages.BUTTON_NEXT));


    }
}
