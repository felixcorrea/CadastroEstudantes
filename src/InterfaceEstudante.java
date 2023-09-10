import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceEstudante {
    private Scanner scanner;
    private ControladorDeEstudantes controlador;

    public InterfaceEstudante(){
        controlador = new ControladorDeEstudantes();
        scanner = new Scanner(System.in);
    };

    public void listarEstudantes(){
        ArrayList<Estudante> listaDeEstudantes = controlador.obterEstudantes();
        Estudante EsseEstudante = null;
        for (int i = 0; i < listaDeEstudantes.size(); i++){
            EsseEstudante = listaDeEstudantes.get(i);
            System.out.println(EsseEstudante.obterNome());
            System.out.println(EsseEstudante.obterMatricula());
            System.out.println(EsseEstudante.obterEmail());
            System.out.println(EsseEstudante.obterTelefone());
            System.out.println(EsseEstudante.obterEndereco());
        }
    }
    public void incluirEstudante(){

        String nome;
        String matricula;
        String email;
        String telefone;
        String endereco;

        System.out.println("Nome: ");
        nome = scanner.next();
        System.out.println("Matricula: ");
        matricula = scanner.next();
        System.out.println("Email: ");
        email = scanner.next();
        System.out.println("Telefone: ");
        telefone = scanner.next();
        System.out.println("Endereco: ");
        endereco = scanner.next();

        Estudante estudante = new Estudante(matricula, nome, email, telefone, endereco);
        controlador.adicionarEstudante(estudante);
    }
    public int obterEscolha(){
            System.out.println("1 -> Listar Estudantes");
            System.out.println("2 -> Incluir Estudante");
            System.out.println("3 -> Excluir Estudante por Nome");
            System.out.println("4 -> Excluir Estudante por Matrícula");
            System.out.println("0 -> Sair do Programa");
            return scanner.nextInt();
    }
    public void executar(){

        controlador = new ControladorDeEstudantes();
        int escolha;
        do {
            System.out.println("Escolha um número para executar a opcção:");

            escolha = obterEscolha();
            switch (escolha) {
                case 1:
                    listarEstudantes();
                    break;
                case 2:
                    incluirEstudante();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(escolha != 0);
    }
}
