package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestFormularioInfoPersonalPages;

public class PasoUno implements Task {

    private UtestFormularioInfoPersonalPages utestFormularioInfoPersonalPages;

    private String nombre;
    private String apellido;
    private String email;
    private String mesC;
    private String dayC;
    private String anioC;
    private String lenguajeUs;

    public PasoUno(String nombre, String apellido, String email, String mesC, String dayC, String anioC, String lenguajeUs) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.mesC = mesC;
        this.dayC = dayC;
        this.anioC = anioC;
        this.lenguajeUs = lenguajeUs;
    }

    public static PasoUno ingresarDatos(String nombre, String apellido, String email, String mesC, String dayC, String anioC, String lenguajeUs) {
        return Tasks.instrumented(PasoUno.class, nombre, apellido, email, mesC, dayC, anioC, lenguajeUs);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(nombre).into(utestFormularioInfoPersonalPages.INPUT_NOMBRE),
                Enter.keyValues(apellido).into(utestFormularioInfoPersonalPages.INPUT_APELLIDO),
                Enter.keyValues(email).into(utestFormularioInfoPersonalPages.INPUT_EMAIL),
                Click.on(utestFormularioInfoPersonalPages.SELECT_MES),Click.on(utestFormularioInfoPersonalPages.OPCION_MES.of(mesC)),
                Click.on(utestFormularioInfoPersonalPages.SELECT_DAY),Click.on(utestFormularioInfoPersonalPages.OPCION_DAY.of(dayC)),
                Click.on(utestFormularioInfoPersonalPages.SELECT_ANIO),Click.on(utestFormularioInfoPersonalPages.OPCION_ANIO.of(anioC)),
                Enter.keyValues(lenguajeUs).into(utestFormularioInfoPersonalPages.SELECT_IDIOMA),Click.on(utestFormularioInfoPersonalPages.OPCION_IDIOMA),
                Click.on(utestFormularioInfoPersonalPages.SIGUIENTE_BOTON));
    }
}
