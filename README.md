# Parking Control

Este é um projeto de controle de vagas de estacionamento desenvolvido em Java utilizando o Spring Boot.

## Funcionalidades
- Cadastro de vagas de estacionamento
- Cadastro de veículos
- Controle de ocupação das vagas
- API REST para integração
- Documentação via Swagger

## Estrutura do Projeto
- `src/main/java/com/api/parking_control/` - Código fonte principal
- `src/main/resources/` - Arquivos de configuração
- `src/test/java/` - Testes automatizados

## Como executar
1. Certifique-se de ter o Java 11+ e o Maven instalados.
2. Clone o repositório:
   ```sh
   git clone <url-do-repositorio>
   ```
3. Execute o projeto:
   ```sh
   ./mvnw spring-boot:run
   ```
4. Acesse a API em `http://localhost:8080`.

## Documentação Swagger
Acesse a documentação interativa em: `http://localhost:8080/swagger-ui/`

## Configuração
As configurações podem ser ajustadas no arquivo `src/main/resources/application.properties`.

## Contribuição
Pull requests são bem-vindos. Para grandes mudanças, abra uma issue primeiro para discutir o que você gostaria de modificar.

## Licença
Este projeto está sob a licença MIT.