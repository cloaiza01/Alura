package com.aluracursos.modelos;

import java.util.HashMap;

public class Monedas {
    private String tipoMoneda;
    private String cambiarMoneda;
    private HashMap<String, Double> conversionesMoneda;
    private double valorInicial;
    private double conversionInicial;

    public Monedas(MonedaRespuesta datosDeMoneda) {
        this.tipoMoneda = datosDeMoneda.base_code();
        this.conversionesMoneda = datosDeMoneda.conversion_rates();
        this.valorInicial = 0;
        this.conversionInicial = 0;
    }

    public double realizaConversion(String cambiarMoneda,double valorInicialAConvertir){
        try {
            this.cambiarMoneda = cambiarMoneda;
            this.valorInicial = valorInicialAConvertir;
            this.conversionInicial = conversionesMoneda.get(cambiarMoneda) * valorInicialAConvertir;
            return this.conversionInicial;
        }catch (Exception e){
            System.out.println("Ingresa un número mayor a0 para conversión");
        }
        return 0;
    }

    public String gettipoMoneda() {
        return tipoMoneda;
    }

    public String getcambiarMoneda() {
        return cambiarMoneda;
    }

    public HashMap<String, Double> getConversionesMoneda() {
        return conversionesMoneda;
    }

    public double getvalorInicial() {
        return valorInicial;
    }

    public double getConversion() {
        return conversionInicial;
    }

    @Override
    public String toString() {
        String valorInicialDeMoneda = String.format("%.2f", this.valorInicial);
        String conversionDeMoneda = String.format("%.2f", this.conversionesMoneda);

        return "El valor Inicial de tu moneda " + valorInicialDeMoneda + " [" + this.tipoMoneda + ']' + " corresponde al valor Inicial de la Moneda" +
                " final de =>>> " + conversionDeMoneda + " [" + this.cambiarMoneda + "]\n";
    }
}
