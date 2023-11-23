package com.veiculos.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.veiculos.Model.Colaborador;
import com.veiculos.Model.Veiculo;

public class JsonHandler {

    private static final String JSON_FILE_PATH = "caminho/do/seu/arquivo.json";

    public static List<Colaborador> lerColaboradoresDoJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File(JSON_FILE_PATH);
            return objectMapper.readValue(file,
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Colaborador.class));
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo JSON", e);
        }
    }

    public static List<Veiculo> lerVeiculosDoJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File(JSON_FILE_PATH);
            return objectMapper.readValue(file,
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Veiculo.class));
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo JSON", e);
        }
    }
}
