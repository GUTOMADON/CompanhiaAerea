class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(int id, String nome, String documento, String cargo) {
        super(id, nome, documento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Funcionário - ID: " + getId() + ", Nome: " + getNome() + ", Documento: " + getDocumento() + ", Cargo: " + cargo);
    }
}