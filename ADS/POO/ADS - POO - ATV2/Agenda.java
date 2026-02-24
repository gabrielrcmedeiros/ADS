public class Agenda {
    public String data;
    public String hora;
    public Medico medico;
    public Paciente paciente;

    public void consultar() { System.out.println("Consultando agenda..."); }
    
    public void mostrar() {
        System.out.println("--- Dados da Agenda ---");
        System.out.println("Data: " + data + " às " + hora);
        System.out.println("Médico: " + (medico != null ? medico.nome : "Nenhum"));
        System.out.println("Paciente: " + (paciente != null ? paciente.nome : "Nenhum"));
    }
}