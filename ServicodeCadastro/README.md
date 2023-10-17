## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

**Explicação das Tecnologias Usadas:**

- **Linguagem de Programação: Java**: O código é escrito em Java, uma linguagem de programação de alto nível amplamente utilizada para desenvolvimento de aplicativos.

- **Padrão de Projeto Singleton**: O padrão Singleton é usado para garantir que uma classe tenha apenas uma instância e forneça um ponto de acesso global a essa instância.

- **Métodos e Campos**: A classe `CadastroService` possui campos para armazenar informações do cliente (nome, telefone, endereço e data de nascimento), bem como métodos para definir e obter essas informações.

- **Construtor Privado**: O construtor da classe é privado para evitar a criação direta de instâncias da classe e garantir que a única instância seja acessada por meio do método estático `getInstance()`.

- **Método `getInstance()`**: Este método cria a instância única da classe e a retorna. Se a instância já existir, ele a retorna.

- **Métodos `setCliente` e `getClienteInfo`**: Esses métodos permitem definir informações do cliente e recuperar informações do cliente formatadas.

- **Método `main`**: O método `main` é usado para demonstrar o uso da classe `CadastroService`, criando uma instância única, definindo informações do cliente e exibindo informações do cliente na saída padrão.
