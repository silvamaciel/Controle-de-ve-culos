package com.veiculos;

import java.util.List;

import com.veiculos.Model.Colaborador;
import com.veiculos.Model.Veiculo;
import com.veiculos.Utilities.JsonHandler;

public class Main {
    public static void main(String[] args) {
        // Ler colaboradores do JSON
        List<Colaborador> colaboradores = JsonHandler.lerColaboradoresDoJson();

        // Ler veículos do JSON
        List<Veiculo> veiculos = JsonHandler.lerVeiculosDoJson();

        // Imprimir colaboradores
        System.out.println("Colaboradores:");
        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador);
        }

        // Imprimir veículos
        System.out.println("\nVeículos:");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }
}