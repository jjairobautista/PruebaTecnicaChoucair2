package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestUltimoPasoPage;

public class PasoCuatro implements Task {


    private UtestUltimoPasoPage utestUltimoPasoPage;

    private String asignarClave;
    private String confirmarClave;

    public PasoCuatro(String asignarClave, String confirmarClave) {
        this.asignarClave = asignarClave;
        this.confirmarClave = confirmarClave;
    }

    public static PasoCuatro AsignarClave(String asignarClave, String confirmarClave) {
        return Tasks.instrumented(PasoCuatro.class,asignarClave,confirmarClave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(asignarClave).into(utestUltimoPasoPage.INPUT_CLAVE),
                Enter.keyValues(confirmarClave).into(utestUltimoPasoPage.CONFIRMAR_CLAVE),
                Click.on(utestUltimoPasoPage.CHECKBOX_NEWS),
                Click.on(utestUltimoPasoPage.CHECKBOX_TERMINOS),
                Click.on(utestUltimoPasoPage.CHECKBOX_SEGURIDAD),
                Click.on(utestUltimoPasoPage.COMPLETAR_PASOS));
    }
}
