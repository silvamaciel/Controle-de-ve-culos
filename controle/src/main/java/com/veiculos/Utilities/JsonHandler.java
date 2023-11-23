package com.veiculos.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.veiculos.Model.Colaborador;
import com.veiculos.Model.Veiculo;

public class JsonHandler {

    private static final String JSON_FILE_PATH = "src/main/resources/dados.json";

    public static Map<String, Colaborador> lerColaboradoresMap() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(JSON_FILE_PATH));
            JsonNode colaboradoresNode = jsonNode.get("colaboradores");

            Colaborador[] colaboradores = objectMapper.treeToValue(colaboradoresNode, Colaborador[].class);

            Map<String, Colaborador> colaboradorMap = new HashMap<>();
            for (Colaborador colaborador : colaboradores) {
                colaboradorMap.put(colaborador.getMatricula(), colaborador);
            }

            return colaboradorMap;
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo JSON", e);
        }
    }

    public static List<Veiculo> lerVeiculos() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(JSON_FILE_PATH));
            JsonNode veiculosNode = jsonNode.get("veiculos");

            Veiculo[] veiculos = objectMapper.treeToValue(veiculosNode, Veiculo[].class);
            return Arrays.asList(veiculos);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao ler o arquivo JSON", e);
        }
    }

    public static void escreverColaboradoresNoJson(List<Colaborador> colaboradores) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
            objectWriter.writeValue(new File(JSON_FILE_PATH), colaboradores);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no arquivo JSON", e);
        }
    }

    public static void escreverVeiculosNoJson(List<Veiculo> veiculos) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
            objectWriter.writeValue(new File(JSON_FILE_PATH), veiculos);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no arquivo JSON", e);
        }
    }
}
