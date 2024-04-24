package com.aluracursos.modelos;

import java.util.HashMap;

public class TipoDeConversiones {
    private HashMap<Integer, String[]> conversionesMoneda= new HashMap<>();

    public TipoDeConversiones() {
        this.conversionesMoneda.put(1, new String[]{"USD","ARS"});
        this.conversionesMoneda.put(2, new String[]{"ARS","USD"});
        this.conversionesMoneda.put(3, new String[]{"USD","BRL"});
        this.conversionesMoneda.put(4, new String[]{"BRL","USD"});
        this.conversionesMoneda.put(5, new String[]{"USD","COP"});
        this.conversionesMoneda.put(6, new String[]{"COP","USD"});
        this.conversionesMoneda.put(7, new String[]{"USD","MXN"});
        this.conversionesMoneda.put(8, new String[]{"MXN","USD"});
    }


    public HashMap<Integer, String[]> getConversionesMoneda() {
        return conversionesMoneda;
    }
}
