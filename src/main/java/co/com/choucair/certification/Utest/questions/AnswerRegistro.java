package co.com.choucair.certification.Utest.questions;

import co.com.choucair.certification.Utest.userinterface.RegistroUtestPageYourself;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerRegistro implements Question<Boolean> {
    private String question;
    String nameCourse;

    public AnswerRegistro(String question) {
        this.question = question;
    }

    public static AnswerRegistro answer(String question){
        return new AnswerRegistro(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        nameCourse = Text.of(RegistroUtestPageYourself.LBL_REGISTRO_COMPLETO).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            return true;
        }else{
            return false;
        }
    }
}
