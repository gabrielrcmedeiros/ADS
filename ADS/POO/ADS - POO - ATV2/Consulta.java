public class Consulta {
    public String data;
    public String hora;
    public Medico medico;
    public Paciente paciente;
    public String motivo;
    public String historico;

    public void marcar() { System.out.println("Marcando consulta..."); }
    public void cancelar() { System.out.println("Cancelando consulta..."); }
    public void consultar() { System.out.println("Consultando dados da consulta..."); }
    public void realizar() { System.out.println("Realizando consulta..."); }
    public void atualizar() { System.out.println("Atualizando consulta..."); }
    
    public void mostrar() {
        System.out.println("--- Dados da Consulta ---");
        System.out.println("Data: " + data + " às " + hora + " | Motivo: " + motivo);
        System.out.println("Paciente: " + (paciente != null ? paciente.nome : "Nenhum") + " | Médico: " + (medico != null ? medico.nome : "Nenhum"));
    }
}