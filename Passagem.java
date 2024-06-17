public class Passagem {
    private String destino;
    private String horario;
    private String portao;

    public Passagem(String destino, String horario, String portao) {
        this.destino = destino;
        this.horario = horario;
        this.portao = portao;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPortao() {
        return portao;
    }

    public void setPortao(String portao) {
        this.portao = portao;
    }

    public void exibirDetalhes() {
        System.out.println("Passagem - Destino: " + destino + ", Horário: " + horario + ", Portão: " + portao);
    }
}
