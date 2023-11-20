# Sistema de Cadastro de Veículos em Java

Este é um projeto em Java para a disciplina de POO que implementa um sistema de cadastro de veículos associados a colaboradores, utilizando um banco de dados MySQL para armazenamento de dados.

## Estrutura do Projeto

O projeto é composto por quatro classes principais:

1. **Colaborador:**
   - Representa um colaborador.
   - Atributos: `nome` e `matricula`.
   - Métodos: Construtores e acessadores/modificadores.

2. **Veiculo:**
   - Representa um veículo.
   - Atributos: `cor`, `ano`, `modelo`, `placa`, `chn`, `crlv`, `nomeColaborador`, `matriculaColaborador`.
   - Métodos: Construtores e acessadores/modificadores.

3. **Moto:**
   - Herda de `Veiculo`.
   - Pode ter atributos específicos para motos.

4. **Carro:**
   - Herda de `Veiculo`.
   - Pode ter atributos específicos para carros.

## Banco de Dados (MySQL)

O projeto utiliza um banco de dados MySQL com duas tabelas principais:

1. **Tabela Colaboradores:**
   - `matricula` (primary key)
   - `nome`

2. **Tabela Veiculos:**
   - `placa` (primary key)
   - `cor`, `ano`, `modelo`, `chn`, `crlv`, `nomeColaborador`, `matriculaColaborador` (foreign keys referenciando `Colaboradores.matricula`)

## Operações CRUD

O sistema oferece operações CRUD (Create, Read, Update, Delete) para gerenciar os veículos associados aos colaboradores.

### Create
   - Permite que um colaborador cadastre um novo veículo (carro ou moto).

### Read
   - Recupera informações sobre um veículo específico ou lista todos os veículos de um colaborador.

### Update
   - Permite a atualização das informações de um veículo.

### Delete
   - Permite que um colaborador remova um veículo cadastrado.

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



