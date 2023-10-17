public class CadastroService {
    // A instância única do Singleton
    private static CadastroService instance;

    // Campos para armazenar informações do cliente
    private String nome;
    private String telefone;
    private String endereco;
    private String dataNascimento;

    // Construtor privado para impedir a criação direta de instâncias
    private CadastroService() {
        // Inicialização de campos
        nome = "";
        telefone = "";
        endereco = "";
        dataNascimento = "";
    }

    // Método estático para obter a instância única
    public static CadastroService getInstance() {
        if (instance == null) {
            instance = new CadastroService();
        }
        return instance;
    }

    // Métodos para definir e obter informações do cliente
    public void setCliente(String nome, String telefone, String endereco, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getClienteInfo() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEndereço: " + endereco + "\nData de Nascimento: " + dataNascimento;
    }

    public static void main(String[] args) {
        // Obtém a instância única do CadastroService
        CadastroService cadastro = CadastroService.getInstance();

        // Define informações do cliente
        cadastro.setCliente("João", "123-456-7890", "Rua da Pizza, 123", "01/01/1990");

        // Obtém e imprime informações do cliente
        String clienteInfo = cadastro.getClienteInfo();
        System.out.println("Informações do Cliente:\n" + clienteInfo);
    }
}
