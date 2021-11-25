package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UtestValidacionLoginPage;

public class Answer implements Question<Boolean> {

    private UtestValidacionLoginPage utestValidacionLoginPage;
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Question<Boolean> toThe(String validacion) {
        return new Answer(validacion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String cadenaTxt = Text.of(utestValidacionLoginPage.VALIDACION).viewedBy(actor).asString();

        if (cadenaTxt.equals(question)) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
