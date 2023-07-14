# Author: Luis Morales
@stories
Feature: Tasa nominal a efectiva
  Como usuario, quiero validar la tasa nominal a efectiva .
  @Scenario 1
  Scenario: Validar tasa nominal a efectiva
    Given luis quiere validar la tasa nominal a efectiva
    When accedo al portal de Banistmo
      | intTasaInteres | strPeriodicidad | strCapitalizacion|
      | 10             | Anual           | Semestral        |
    Then puedo ver el resultado de la tasa efectiva
     |strResultado|
     |10.25 %     |

