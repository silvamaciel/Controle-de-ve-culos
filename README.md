# Sistema de Cadastro de Veículos em Java

Este é um projeto em Java para a disciplina de POO que implementa um sistema de cadastro de veículos associados a colaboradores, utilizando um banco de dados MySQL para armazenamento de dados.

## Estrutura do Projeto

O projeto é composto por duasclasses principais:

1. **Colaborador:**
   - Representa um colaborador.
   - Atributos: `nome` e `matricula`.
   - Métodos: Construtores e acessadores/modificadores.

2. **Veiculo:**
   - Representa um veículo.
   - Atributos: `cor`, `ano`, `modelo`, `placa`, `chn`, `crlv`, `nomeColaborador`, `matriculaColaborador`.
   - Métodos: Construtores e acessadores/modificadores.

## Banco de Dados (MySQL)

O projeto utiliza um banco de dados MySQL com duas tabelas principais:

1. **Tabela Colaboradores:**
   - `matricula` (primary key)
   - `nome`

2. **Tabela Veiculos:**
   - `placa` (primary key)
   - `cor`, `ano`, `modelo`, `chn`, `crlv`, `nomeColaborador`, `matriculaColaborador` (foreign keys referenciando `Colaboradores.matricula`)

## Controle de Estacionamento

O sistema oferece a listagem e cadastro de colaboradores e carros para maior controle do estacionamento.

### Create
   - Permite que um colaborador cadastre um novo veículo (carro ou moto).
   - Permite a adição de um novo colaborador.

### Read
   - Recupera informações sobre um veículo específico ou lista todos os veículos de um colaborador.
   - Lista todos os colaboradores cadastrados.

## Implementação em Java

O projeto utiliza JDBC para a conexão com o MySQL e implementa métodos Java para realizar operações no banco de dados. 

## Interface de Usuário

O sistema pode ser utilizado por meio de uma interface gráfica ou linha de comando, conforme necessário.

## Como Iniciar

1. Clone o repositório.
2. Configure as informações do banco de dados no arquivo de configuração.
3. Execute a aplicação.

## Dependências

- Java 8 ou superior
- MySQL

## Contribuições (A - Z)

- João Pedro Nery
- Leandro Lima
- Maciel Silva
- Pablo França
- Sergio Ricardo



