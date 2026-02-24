public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;

    public void cadastrar() { System.out.println("Cadastrando paciente..."); }
    public void consultar() { System.out.println("Consultando paciente..."); }
    
    public void mostrar() {
        System.out.println("--- Dados do Paciente ---");
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Idade: " + idade + " | Gênero: " + genero + " | Tel: " + telefone);
    }
}