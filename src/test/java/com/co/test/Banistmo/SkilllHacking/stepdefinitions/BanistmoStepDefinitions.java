package com.co.test.Banistmo.SkilllHacking.stepdefinitions;

import com.co.test.Banistmo.SkilllHacking.model.BanistmoData;
import com.co.test.Banistmo.SkilllHacking.tasks.AbrirPagina;
import com.co.test.Banistmo.SkilllHacking.tasks.RealizarFlujo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class BanistmoStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^luis quiere validar la tasa nominal a efectiva$")
    public void luis_quiere_validar_la_tasa_nominal_a_efectiva() {
        OnStage.theActorCalled("luis").wasAbleTo(AbrirPagina.paginaBanistmo()
        );
    }

    @When("^accedo al portal de Banistmo$")
    public void accedo_al_portal_de_Banistmo(List<BanistmoData> banistmoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RealizarFlujo.pasos(banistmoData.get(0).getIntTasaInteres(), banistmoData.get(0).getStrPeriodicidad(), banistmoData.get(0).getStrCapitalizacion())

        );
    }

    @Then("^puedo ver el resultado de la tasa efectiva$")
    public void puedo_ver_el_resultado_de_la_tasa_efectiva(List<BanistmoData> banistmoData) throws Exception {

    }

}
