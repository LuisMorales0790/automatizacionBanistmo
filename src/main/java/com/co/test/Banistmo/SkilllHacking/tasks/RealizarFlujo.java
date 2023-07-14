package com.co.test.Banistmo.SkilllHacking.tasks;

import com.co.test.Banistmo.SkilllHacking.model.BanistmoData;
import com.co.test.Banistmo.SkilllHacking.userinterface.Secciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RealizarFlujo implements Task {

    private int intTasaInteres;
    private String strPeriodicidad;
    private String strCapitalizacion;

    public RealizarFlujo(int intTasaInteres, String strPeriodicidad, String strCapitalizacion) {
        this.intTasaInteres = intTasaInteres;
        this.strPeriodicidad = strPeriodicidad;
        this.strCapitalizacion = strCapitalizacion;
    }

    public static RealizarFlujo pasos(int intTasaInteres, String strPeriodicidad, String strCapitalizacion) {
        return Tasks.instrumented(RealizarFlujo.class, intTasaInteres, strPeriodicidad, strCapitalizacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Secciones.ENLACE_NEGOCIOS),
                Click.on(Secciones.ENLACE_HERRAMIENTAS),
                Click.on(Secciones.BOTON_DERECHA),
                Click.on(Secciones.ENLACE_GESTIONAR_FINANZAS_DE_NEGOCIO),
                Click.on(Secciones.ENLACE_CONVERTIDOR_TASA_INTERES),
                Click.on(Secciones.BOTON_CALCULAR_TASA_EFECTIVA),
                Enter.theValue(String.valueOf(intTasaInteres)).into(Secciones.INPUT_TASA_INTERES),
                SelectFromOptions.byVisibleText(strPeriodicidad).from(Secciones.SELECT_PERIODICIDAD_DESEADA),
                SelectFromOptions.byVisibleText(strCapitalizacion).from(Secciones.SELECT_CAPITALIZACION_DESEADA)



                );
    }
}
