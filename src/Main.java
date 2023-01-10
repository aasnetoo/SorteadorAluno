import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SorteadorLista sorteadorLista = new SorteadorLista();
        Random random = new Random();
        Aluno aluno = new Aluno();
        aluno.setId(0);
        aluno.setNome("Neto");
        sorteadorLista.alunos.add(aluno);
        int numeroSorteado = random.nextInt(sorteadorLista.getListaSize());
        Aluno alunoSorteado = sorteadorLista.getSorteio(numeroSorteado);
        System.out.println(alunoSorteado);
    }
}