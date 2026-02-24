public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public void acessar() { System.out.println("Recepcionista acessando o sistema..."); }
    
    public void mostrar() {
        System.out.println("--- Dados da Recepcionista ---");
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Tel: " + telefone);
    }
}