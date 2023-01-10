import java.util.ArrayList;
import java.util.List;

public class SorteadorLista {

    public List<Aluno> alunos;

    public SorteadorLista() {
        alunos = new ArrayList<>();
    }

    public Aluno getSorteio(int id){

        Aluno alunoRemovido = alunos.get(id);
        alunos.remove(id);

        return alunoRemovido;

    }


    public int getListaSize(){
        return alunos.size();
    }
}
