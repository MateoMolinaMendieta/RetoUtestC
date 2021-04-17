package co_com_choucair_reto_retouTest.tasks;

import co_com_choucair_reto_retouTest.userinterface.UtestAcademyPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestAcademyPage utestAcademyPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Open.browserOn(utestAcademyPage));
    }
}
