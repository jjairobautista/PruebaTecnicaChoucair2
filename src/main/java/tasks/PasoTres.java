package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UtestFormularioDispositivos;

public class PasoTres implements Task {


    private UtestFormularioDispositivos utestFormularioDispositivos;
    private String computadora;
    private String versionSo;
    private String lenguajeCom;
    private String dispMovil;
    private String modelo;
    private String sisOperativo;

    public PasoTres(String computadora, String versionSo, String lenguajeCom, String dispMovil, String modelo, String sisOperativo) {
        this.computadora = computadora;
        this.versionSo = versionSo;
        this.lenguajeCom = lenguajeCom;
        this.dispMovil = dispMovil;
        this.modelo = modelo;
        this.sisOperativo = sisOperativo;
    }

    public static PasoTres dispositivos(String computadora, String versionSo, String lenguajeCom, String dispMovil, String modelo, String sisOperativo) {

        return Tasks.instrumented(PasoTres.class, computadora, versionSo, lenguajeCom, dispMovil, modelo, sisOperativo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(utestFormularioDispositivos.INPUT_COMPUTADOR),Click.on(utestFormularioDispositivos.SELECT_OPTION.of(computadora)),
                Click.on(utestFormularioDispositivos.INPUT_VERSION),Click.on(utestFormularioDispositivos.SELECT_OPTION.of(versionSo)),
                Click.on(utestFormularioDispositivos.INPUT_LENGUAJE),Click.on(utestFormularioDispositivos.SELECT_OPTION.of(lenguajeCom)),
                Click.on(utestFormularioDispositivos.INPUT_MOVIL),Click.on(utestFormularioDispositivos.SELECT_OPTION.of(dispMovil)),
                Click.on(utestFormularioDispositivos.INPUT_MODELO),Click.on(utestFormularioDispositivos.SELECT_OPTION.of(modelo)),
                Click.on(utestFormularioDispositivos.INPUT_SO),Click.on(utestFormularioDispositivos.SELECT_OPTION.of(sisOperativo)),
                Click.on(utestFormularioDispositivos.BUTTON_NEXT));
    }
}
