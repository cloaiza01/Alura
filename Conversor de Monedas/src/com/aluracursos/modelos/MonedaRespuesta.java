package com.aluracursos.modelos;

import java.util.HashMap;

public record MonedaRespuesta(String base_code, HashMap<String, Double> conversion_rates) {
}
