package com.co.test.Banistmo.SkilllHacking.tasks;
import com.co.test.Banistmo.SkilllHacking.userinterface.UrlBanistmo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task{

    private UrlBanistmo urlBanistmo;
    public static AbrirPagina paginaBanistmo() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(urlBanistmo));
    }
}
