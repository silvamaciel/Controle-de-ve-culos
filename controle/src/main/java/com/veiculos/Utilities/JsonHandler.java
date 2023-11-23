package com.veiculos.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    public static void escreverColaboradoresNoJson(List<Colaborador> novosColaboradores) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File(JSON_FILE_PATH);
            JsonNode jsonNode = objectMapper.readTree(jsonFile);
            JsonNode colaboradoresNode = jsonNode.get("colaboradores");
    
            List<Colaborador> colaboradoresAntigos = Arrays.asList(objectMapper.treeToValue(colaboradoresNode, Colaborador[].class));
    
            List<Colaborador> colaboradoresAtualizados = new ArrayList<>(colaboradoresAntigos);
            colaboradoresAtualizados.addAll(novosColaboradores);
    
            ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
            objectWriter.writeValue(jsonFile, colaboradoresAtualizados);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no arquivo JSON", e);
        }
    }
    
    public static void escreverVeiculosNoJson(List<Veiculo> novosVeiculos) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File(JSON_FILE_PATH);
            JsonNode jsonNode = objectMapper.readTree(jsonFile);
            JsonNode veiculosNode = jsonNode.get("veiculos");
    
            List<Veiculo> veiculosAntigos = Arrays.asList(objectMapper.treeToValue(veiculosNode, Veiculo[].class));
    
            List<Veiculo> veiculosAtualizados = new ArrayList<>(veiculosAntigos);
            veiculosAtualizados.addAll(novosVeiculos);
    
            ObjectWriter objectWriter = objectMapper.writerWithDefaultPrettyPrinter();
            objectWriter.writeValue(jsonFile, veiculosAtualizados);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao escrever no arquivo JSON", e);
        }
    }
    
}
