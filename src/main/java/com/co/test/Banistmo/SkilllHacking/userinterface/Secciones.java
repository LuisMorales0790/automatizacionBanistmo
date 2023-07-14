package com.co.test.Banistmo.SkilllHacking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Secciones extends PageObject {

    public static final Target ENLACE_NEGOCIOS = Target.the("enlace negocios de Banistmo").located(By.id("header-pymes"));
    public static final Target ENLACE_HERRAMIENTAS = Target.the("enlace herramientas de Banistmo").located(By.xpath("//div//nav[@id='header-lvl3']//ul[@role='menubar']//li[@role='menuitem']//a[contains(text(),'Herramientas')]"));
    public static final Target BOTON_DERECHA = Target.the("Boton para moverse a la derecha").located(By.xpath("//button[@class='bc-fab-button bc-fab-button-mini']//i[contains(text(),'arrow2-right')]"));
    public static final Target ENLACE_GESTIONAR_FINANZAS_DE_NEGOCIO = Target.the("Enlace que envia a la seccion de gestionar las finanzas de mi negocio").located(By.xpath("//div[@class='menu-item-link']//a[contains(text(),'Gestionar las finanzas de mi negocio')]"));
    public static final Target ENLACE_CONVERTIDOR_TASA_INTERES = Target.the("Enlace de convertidor de tasa de interes").located(By.xpath("//div[@class='bc-card bc-card-tools bc-direction-column bc-h-100']//a[@class='card-link']//h5[contains(text(),'Convertidor de tasas de')]"));
    public static final Target BOTON_CALCULAR_TASA_EFECTIVA = Target.the("Boton de calcular tasa efectiva a tasa nominal").located(By.xpath("//div[@id='btntoolUno']//a[contains(text(),'Calcular')]"));
    public static final Target INPUT_TASA_INTERES = Target.the("ingrese la tasa de interes").located(By.id("interes"));
    public static final Target SELECT_PERIODICIDAD_DESEADA = Target.the("seleccione la periodicidad deseada").located(By.id("periodicidad-deseada"));
    public static final Target SELECT_CAPITALIZACION_DESEADA = Target.the("seleccione la capitalizacion deseada").located(By.id("capitalizacion"));


}
