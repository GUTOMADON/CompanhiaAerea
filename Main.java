import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CompanhiaAerea companhiaAerea = new CompanhiaAerea();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    visualizarPessoa();
                    break;
                case 4:
                    imprimirPassagem();
                    break;
                case 5:
                    excluirPessoa();
                    break;
                case 6:
                    editarPessoa();
                    break;
                case 0:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("====== Menu Principal ======");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("3 - Visualizar (objeto específico)");
        System.out.println("4 - Imprimir Passagem");
        System.out.println("5 - Excluir");
        System.out.println("6 - Editar");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        int opcao = -1;
        try {
            opcao = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, insira um número inteiro de 0 a 6, igual está no menu.");
        } finally {
            scanner.nextLine();
        }
        return opcao;
    }

    private static void cadastrarPessoa() {
        System.out.println("Escolha o tipo de pessoa a cadastrar:");
        System.out.println("1 - Funcionário");
        System.out.println("2 - Passageiro");
        int tipo = lerOpcao();

        if (tipo == 1) {
            cadastrarFuncionario();
        } else if (tipo == 2) {
            cadastrarPassageiro();
        } else {
            System.out.println("Opção inválida, tente novamente.");
        }
    }

    private static void cadastrarFuncionario() {
        System.out.print("Digite o ID do funcionário: ");
        int id = lerOpcao();
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o documento do funcionário: ");
        String documento = scanner.nextLine();
        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();
        Funcionario funcionario = new Funcionario(id, nome, documento, cargo);
        companhiaAerea.adicionarPessoa(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!!!");
    }

    private static void cadastrarPassageiro() {
        System.out.print("Digite o ID do passageiro: ");
        int id = lerOpcao();
        System.out.print("Digite o nome do passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o documento do passageiro: ");
        String documento = scanner.nextLine();
        System.out.print("Digite o destino final da passagem: ");
        String destinoFinal = scanner.nextLine();
        System.out.print("Digite o horário do voo, exemplo (19:45): ");
        String horarioVoo = scanner.nextLine();
        System.out.print("Digite o portão de embarque: ");
        String portao = scanner.nextLine();

        Passageiro passageiro = new Passageiro(id, nome, documento, destinoFinal, horarioVoo, portao);
        companhiaAerea.adicionarPessoa(passageiro);
        System.out.println("Passageiro cadastrado com sucesso!!!");
    }

    private static void listarPessoas() {
        companhiaAerea.listarPessoas();
    }

    private static void visualizarPessoa() {
        System.out.print("Digite o ID da pessoa: ");
        int id = lerOpcao();
        Pessoa pessoa = companhiaAerea.buscarPessoa(id);
        if (pessoa != null) {
            pessoa.exibirDetalhes();
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada, tente novamente.");
        }
    }

    private static void editarPessoa() {
        System.out.print("Digite o ID da pessoa: ");
        int idEditar = lerOpcao();
        System.out.print("Digite o novo nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o novo documento: ");
        String documento = scanner.nextLine();
        companhiaAerea.editarPessoa(idEditar, nome, documento);
    }

    private static void excluirPessoa() {
        System.out.print("Digite o ID da pessoa: ");
        int idRemover = lerOpcao();
        companhiaAerea.removerPessoa(idRemover);
    }

    private static void imprimirPassagem() {
        System.out.print("Digite o ID do passageiro para imprimir a passagem: ");
        int id = lerOpcao();
        Passageiro passageiro = (Passageiro) companhiaAerea.buscarPessoa(id);
        if (passageiro != null) {
            passageiro.imprimirPassagem();
        } else {
            System.out.println("Passageiro com ID " + id + " não encontrado, impossível imprimir a passagem.");
        }
    }
}


