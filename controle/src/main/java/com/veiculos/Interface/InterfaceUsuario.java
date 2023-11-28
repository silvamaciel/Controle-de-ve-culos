package com.veiculos.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.veiculos.Model.Colaborador;
import com.veiculos.Model.Veiculo;
import com.veiculos.Utilities.JsonHandler;

public class InterfaceUsuario {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        int opcao;

        do {
            System.out.println("\n*** Menu Principal ***");
            System.out.println("1. Visualizar Colaboradores");
            System.out.println("2. Visualizar Veículos");
            System.out.println("3. Cadastrar Colaborador");
            System.out.println("4. Cadastrar Veículo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    visualizarColaboradores();
                    break;
                case 2:
                    visualizarVeiculos();
                    break;
                case 3:
                    cadastrarColaborador();
                    break;
                case 4:
                    cadastrarVeiculo();
                    break;
                case 5:
                    System.out.println("Encerrando o Programa... 'hasta la vista baby' ");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);
    }

    private static void visualizarColaboradores() {
        Map<String, Colaborador> colaboradoresMap = JsonHandler.lerColaboradoresMap();
        System.out.println("Colaboradores:");
        colaboradoresMap
                .values()
                .forEach(colaborador -> System.out.println(colaborador.toString()));
    }

    private static void visualizarVeiculos() {
        List<Veiculo> veiculos = JsonHandler.lerVeiculos();
        veiculos.forEach(veiculo -> System.out.println(veiculo.getPlaca()));
    }

    private static void cadastrarColaborador() {
        System.out.println("\n*** Cadastro de Colaborador ***");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("CNH: ");
        String cnh = scanner.nextLine();

        Colaborador novoColaborador = new Colaborador(nome, matricula, cnh);

        List<Colaborador> colaboradores = new ArrayList<>(
                JsonHandler.lerColaboradoresMap().values());

        colaboradores.add(novoColaborador);

        JsonHandler.escreverColaboradoresNoJson(colaboradores);

        System.out.println("Colaborador cadastrado com sucesso!");
    }

    private static void cadastrarVeiculo() {
        System.out.println("\n*** Cadastro de Veículo ***");
        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        System.out.print("Ano: ");
        String ano = scanner.nextLine();

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        System.out.print("Renavam: ");
        String renavam = scanner.nextLine();

        System.out.print("Matrícula do Colaborador: ");
        String matriculaColaborador = scanner.nextLine();

        Long idColaborador = obterIdColaboradorPelaMatricula(matriculaColaborador);

        if (idColaborador != null) {
            Veiculo novoVeiculo = new Veiculo(
                    null,
                    placa,
                    modelo,
                    marca,
                    cor,
                    ano,
                    tipo,
                    renavam,
                    idColaborador,
                    matriculaColaborador);

            List<Veiculo> veiculos = JsonHandler.lerVeiculos();
            veiculos.add(novoVeiculo);
            JsonHandler.escreverVeiculosNoJson(veiculos);

            System.out.println("Veículo cadastrado com sucesso!");
        } else {
            System.out.println(
                    "Matrícula do colaborador não encontrada. Veículo não cadastrado.");
        }
    }

    private static Long obterIdColaboradorPelaMatricula(String matricula) {
        Map<String, Colaborador> colaboradoresMap = JsonHandler.lerColaboradoresMap();

        Colaborador colaborador = colaboradoresMap.get(matricula);

        if (colaborador != null) {
            return colaborador.getId();
        } else {
            System.out.println("Colaborador com a matrícula " + matricula + " não encontrado.");
            return null;
        }
    }

}
