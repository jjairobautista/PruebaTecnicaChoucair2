package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.UtestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

public class CreacionUsuarioUtestStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^Que un usuario desea registrarse en la plataforma de Utest$")
    public void queUnUsuarioDeseaRegistrarseEnLaPlataformaDeUtest() {
        OnStage.theActorCalled("Jhon").wasAbleTo(Abrir.platafroma(), Registrarse.irFormulario());
    }


    @Cuando("^Diligencie el primer paso del registro en la plataforma de Utest$")
    public void diligencieElPrimerPasoDelRegistroEnLaPlataformaDeUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PasoUno.ingresarDatos(
                utestData.get(0).getNombre(),
                utestData.get(0).getApellido(),
                utestData.get(0).getEmail(),
                utestData.get(0).getMesC(),
                utestData.get(0).getDayC(),
                utestData.get(0).getAnioC(),
                utestData.get(0).getLenguajeUs()));
    }

    @Cuando("^Diligencie el segundo paso del registro en la plataforma de Utest$")
    public void diligencieElSegundoPasoDelRegistroEnLaPlataformaDeUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PasoDos.ingreseLocalizacion(
                utestData.get(0).getCiudad(),
                utestData.get(0).getCodPostal(),
                utestData.get(0).getPais()));
    }

    @Cuando("^Diligencie el tercer paso del registro en la plataforma de Utest$")
    public void diligencieElTercerPasoDelRegistroEnLaPlataformaDeUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PasoTres.dispositivos(
                utestData.get(0).getComputadora(),
                utestData.get(0).getVersionSo(),
                utestData.get(0).getLenguajeCom(),
                utestData.get(0).getDispMovil(),
                utestData.get(0).getModelo(),
                utestData.get(0).getSisOperativo()
        ));
    }

    @Cuando("^Diligencie el cuarto paso del registro en la plataforma de Utest$")
    public void diligencieElCuartoPasoDelRegistroEnLaPlataformaDeUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(PasoCuatro.AsignarClave(
                utestData.get(0).getAsignarClave(),
                utestData.get(0).getConfirmarClave()
        ));
    }

    @Cuando("^puede hacer el login en la plataforma de Utest$")
    public void puedeHacerElLoginEnLaPlataformaDeUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(IrLogin.abrirLogin(),Login.inciarSesion(
                utestData.get(0).getUsuario(),
                utestData.get(0).getClave()));

    }
    @Entonces("^validar inicio de sesion$")
    public void validarInicioDeSesion(List<UtestData> utestData){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getValidacion())));


    }


}
