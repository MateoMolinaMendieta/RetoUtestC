package co_com_choucair_reto_retouTest.questions;

import co_com_choucair_reto_retouTest.userinterface.UtestRegistrPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question) {
        this.question=question;
    }
    public  static Answer toThe(String question){
        return  new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String bottonRegistro= Text.of(UtestRegistrPage.BUTTON_COMPLETE_SETUP).viewedBy(actor).asString();
        if(question.equals(bottonRegistro)) {
            result= true;
        }else{
            result= false;
        }
        return result;
    }
}
