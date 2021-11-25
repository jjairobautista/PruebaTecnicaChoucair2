package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestHomePage;
import userinterface.UtestLoginPage;

public class Login implements Task {

    private UtestLoginPage utestLoginPage;
    private String usuario;
    private String clave;

    public Login(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static Login inciarSesion(String usuario, String clave) {
        return Tasks.instrumented(Login.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(usuario).into(utestLoginPage.INPUT_USUARIO),
                Enter.keyValues(clave).into(utestLoginPage.INPUT_CLAVE),
                Click.on(utestLoginPage.BUTTON_INICIO));
    }
}
