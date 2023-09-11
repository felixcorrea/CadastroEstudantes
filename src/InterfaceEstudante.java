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
            System.out.println("Nome: " + EsseEstudante.obterNome() +
                    " Matrícula: " + EsseEstudante.obterMatricula() +
                    " Email: " + EsseEstudante.obterEmail() +
                    " Telefone: " + EsseEstudante.obterTelefone() +
                    " Endereco: " + EsseEstudante.obterEndereco() );
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
        System.out.println("3 -> Encontrar Estudante por Nome");
        System.out.println("4 -> Encontrar Estudante por Matrícula");
        System.out.println("5 -> Excluir Estudante pela matrícula");
        System.out.println("0 -> Sair do Programa");
        return scanner.nextInt();
    }
    public void excluirEstudantePorMatricula(){
        ArrayList<Estudante> estudantes = controlador.obterEstudantes();
        String matricula;
        System.out.println("Digite a matrícula que deseja excluir: ");
        matricula = scanner.next();
        for (int i = 0; i < estudantes.size(); i++){
            if (estudantes.get(i).obterMatricula().equals(matricula)) {
            controlador.removerEstudante(estudantes.get(i));
            System.out.println("Registro removido");
            break;
            }
        }
    }
    public void encontrarEstudantePorMatricula(){
        ArrayList<Estudante> estudantes = controlador.obterEstudantes();
        String matricula;
        System.out.println("Digite a matrícula que deseja encontrar: ");
        matricula = scanner.next();
        for (int i = 0; i < estudantes.size(); i++){
            if (estudantes.get(i).obterMatricula().equals(matricula)) {
                System.out.println("Nome: " + estudantes.get(i).obterNome() +
                        " Matrícula: " +estudantes.get(i).obterMatricula() +
                        " E-mail: " + estudantes.get(i).obterEmail()+
                        " Telefone: " + estudantes.get(i).obterTelefone()+
                        " Endereco: " + estudantes.get(i).obterEndereco());
                break;
            }
        }
    }
    public void encontrarEstudantePorNome(){
        ArrayList<Estudante> estudantes = controlador.obterEstudantes();
        String nome;
        System.out.println("Digite o Nome que deseja encontrar: ");
        nome = scanner.next();
        for (int i = 0; i < estudantes.size(); i++){
            if (estudantes.get(i).obterNome().equals(nome)) {
                System.out.println("Nome: " + estudantes.get(i).obterNome() +
                        " Matrícula: " +estudantes.get(i).obterMatricula() +
                        " E-mail: " + estudantes.get(i).obterEmail()+
                        " Telefone: " + estudantes.get(i).obterTelefone()+
                        " Endereco: " + estudantes.get(i).obterEndereco());
                break;
            }
        }
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
                    encontrarEstudantePorNome();
                    break;
                case 4:
                    encontrarEstudantePorMatricula();
                    break;
                case 5:
                    excluirEstudantePorMatricula();
                    break;
            }
        }while(escolha != 0);
    }
}
