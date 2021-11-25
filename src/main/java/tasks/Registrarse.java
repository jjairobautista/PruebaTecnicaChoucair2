package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UtestHomePage;

public class Registrarse implements Task {

    private UtestHomePage utestHomePage;

    public static Registrarse irFormulario() {
        return Tasks.instrumented(Registrarse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(utestHomePage.REGISTRARSE_BOTON));
    }
}
