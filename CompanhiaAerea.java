import java.util.ArrayList;
class CompanhiaAerea {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDetalhes();
        }
    }

    public Pessoa buscarPessoa(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    public void removerPessoa(int id) {
        Pessoa pessoa = buscarPessoa(id);
        if (pessoa != null) {
            pessoas.remove(pessoa);
            System.out.println("Pessoa removida com sucesso!!!");
        } else {
            System.out.println("Pessoa não encontrada, tente novamente!");
        }
    }

    public void editarPessoa(int id, String nome, String documento) {
        Pessoa pessoa = buscarPessoa(id);
        if (pessoa != null) {
            pessoa.setNome(nome);
            pessoa.setDocumento(documento);
            System.out.println("Pessoa editada com sucesso!!!");
        } else {
            System.out.println("Pessoa não encontrada, tente novamente!");
        }
    }
}

