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
   - Atributos: `cor`, `ano`, `modelo`, `placa`, `chn`, `Renavam`, `nomeColaborador`, `matriculaColaborador`.
   - Métodos: Construtores e acessadores/modificadores.

## Banco de Dados (JSON)

O projeto utiliza um Objeto JSON para simular um Banco de dados.

1. **Tabela Colaboradores:**
   - `matricula` (primary key)
   - `nome`

2. **Tabela Veiculos:**
   - `placa` (primary key)
   - `cor`, `ano`, `modelo`, `chn`, `crlv`, `nomeColaborador`, `matriculaColaborador` (foreign keys referenciando `Colaboradores.matricula`)
  
## Demonstração

Link do vídeo no Youtube **https://youtu.be/xyx3dXXzgvc**

## Controle de Estacionamento

O sistema oferece a listagem e cadastro de colaboradores e carros para maior controle do estacionamento.

### Create
   - Permite que um colaborador cadastre um novo veículo (carro ou moto).
   - Permite a adição de um novo colaborador.

### Read
   - Recupera informações sobre um veículo específico ou lista todos os veículos de um colaborador.
   - Lista todos os colaboradores cadastrados.

## Interface de Usuário

O sistema pode ser utilizado por meio de uma interface gráfica ou linha de comando, conforme necessário.

## Como Iniciar

1. Clone o repositório.
2. Faça os Ajustes no Json.
3. Execute a Classe InterfaceUsuario.java

## Dependências

- Java 8 ou superior
- Json

## Contribuições (A - Z)

- João Pedro Nery | RGM: 34628649
- Leandro Lima | RGM: 33500525
- Maciel Silva | RGM: 34628649
- Pablo França | RGM: 34614443
- Sergio Ricardo | RGM: 33454736

