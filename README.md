Security Password- Desafio

Descrição do projeto:
Este projeto tem como objetivo criar um sistema capaz de validar uma senha seguindo diversos padrões de boas práticas.
A aplicação permite uma verificação do padrão de senhas e garantindo segurança.

Contém duas branchs:

- V1-Detail-Message-Generic: Utiliza anotações para validação de senha e um @ControllerAdvice para tratar as mensagens de erro de forma genérica.

- V2-Detail-Message-Erros: Emprega validações condicionais para cada critério da senha e retorna uma lista com todos os critérios não atendidos.


Técnologias:
- Spring Boot
- Spring MVC
- SpringDoc OpenAPI 3


Práticas adotadas:
- API REST
- Injeção de dependências
- Tratamentos de respostas de erro
- Geração automatica do swagger com a OpenAPI 3

Desenvolvimento:
Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência


mvn clean install:
O comando irá baixar todas as dependências do projeto e criar um diretório target com os artefatos construídos, que incluem o arquivo jar do projeto.
Além disso, serão executados os testes unitários, e se algum falhar, o Maven exibirá essa informação no console.


Configuração:
Para executar o projeto, é necessário utilizar o intellij, para que o mesmo identifique as dependências necessárias para a execução no repositório .m2 do Maven.
Uma vez importado o projeto, será criado um arquivo .classpath que irá informar qual a classe principal para a execução.

API Endpoints
Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Postman:

    * Criar senha
    - POST
    - http://localhost:8080/validate-password'

        {
        "password":"Abcdef1!"
        }

-------------------------------------------------------
