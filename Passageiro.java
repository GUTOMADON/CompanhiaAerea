class Passageiro extends Pessoa {
    private String destinoFinal;
    private String horarioVoo;
    private String portao;

    public Passageiro(int id, String nome, String documento, String destinoFinal, String horarioVoo, String portao) {
        super(id, nome, documento);
        this.destinoFinal = destinoFinal;
        this.horarioVoo = horarioVoo;
        this.portao = portao;
    }

    public String getDestinoFinal() {
        return destinoFinal;
    }

    public void setDestinoFinal(String destinoFinal) {
        this.destinoFinal = destinoFinal;
    }

    public String getHorarioVoo() {
        return horarioVoo;
    }

    public void setHorarioVoo(String horarioVoo) {
        this.horarioVoo = horarioVoo;
    }
    public String getPortao() {
        return portao;
    }

    public void setPortao(String portao) {
        this.portao = portao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Passageiro - ID: " + getId() + ", Nome: " + getNome() + ", Documento: " + getDocumento() +
                ", Destino: " + destinoFinal + ", Horário do Voo: " + horarioVoo + ", Portão: " + portao);
    }

    public void imprimirPassagem() {
        System.out.println("\n==== Passagem de " + getNome()+"====");
        System.out.println("ID do Passageiro: " + getId());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Destino: " + destinoFinal);
        System.out.println("Horário do Voo: " + horarioVoo);
        System.out.println("Portão de Embarque: " + portao);
    }
}
