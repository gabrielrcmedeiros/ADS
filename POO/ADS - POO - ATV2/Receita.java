public class Receita {
    public Consulta consulta;
    public String data;
    public String descritivo;

    public void preescrever() { System.out.println("Prescrevendo receita..."); }
    public void consultar() { System.out.println("Consultando receita..."); }
    
    public void mostrar() {
        System.out.println("--- Dados da Receita ---");
        System.out.println("Data: " + data + " | Descritivo: " + descritivo);
    }
}