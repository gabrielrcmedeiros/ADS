public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public void acessar() { System.out.println("Médico acessando o sistema..."); }
    
    public void mostrar() {
        System.out.println("--- Dados do Médico ---");
        System.out.println("Nome: " + nome + " | CRM: " + crm + " | Especialidade: " + especialidade + " | Tel: " + telefone);
    }
}