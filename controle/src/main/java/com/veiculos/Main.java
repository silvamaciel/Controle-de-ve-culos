package com.veiculos;

import java.util.List;
import java.util.Map;

import com.veiculos.Model.Colaborador;
import com.veiculos.Model.Veiculo;
import com.veiculos.Utilities.JsonHandler;

public class Main {
    public static void main(String[] args) {
        // Ler colaboradores do JSON
        Map<String, Colaborador> colaboradoresMap = JsonHandler.lerColaboradoresMap();

        // Ler veículos do JSON
        List<Veiculo> veiculos = JsonHandler.lerVeiculos();

        // Imprimir colaboradores
        System.out.println("Colaboradores:");
        colaboradoresMap.values().forEach(System.out::println);

        // Imprimir veículos
        System.out.println("\nVeículos:");
        veiculos.forEach(System.out::println);
    }
}
