public class Exame {
    public Consulta consulta;
    public String data;
    public String descritivo;

    public void solicitar() { System.out.println("Solicitando exame..."); }
    public void consultar() { System.out.println("Consultando exame..."); }
    
    public void mostrar() {
        System.out.println("--- Dados do Exame ---");
        System.out.println("Data: " + data + " | Descritivo: " + descritivo);
    }
}