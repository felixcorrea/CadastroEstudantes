import java.util.ArrayList;

public class ControladorDeEstudantes {
    //iniciando um ArrayList para aguardar os objetos criados com a classe Estudante
    private ArrayList<Estudante> estudantes;


    //Contrutor vazio que já instância um ArrayList para guardar os estudantes
    public ControladorDeEstudantes(){
        estudantes = new ArrayList<Estudante>();
    }


    public ArrayList<Estudante> obterEstudantes(){
        return estudantes;
    }
    public void adicionarEstudante(Estudante estudante){
        estudantes.add(estudante);
        System.out.println("estudante adicionado");
    }

    public void removerEstudante(Estudante estudante){
        estudantes.remove(estudante);
    }
    public Estudante retornarEstudantePorNome(String nome){
        Estudante estudante = null;
        for (int i = 0; i < estudantes.size(); i++){
            if (estudantes.get(i).obterNome().equals(nome)){
                estudante = estudantes.get(i);
                break;
            }
        }
        return estudante;
    }

    public Estudante retornarEstudantePorMatricula(String matricula){
        Estudante estudante = null;
        for(int i = 0; i < estudantes.size(); i++){
            if (estudantes.get(i).obterMatricula().equals(matricula)){
                estudante = estudantes.get(i);
                break;
            }
        }
        return estudante;
    }
}
