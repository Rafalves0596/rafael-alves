public class AlunoClasse {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Rafael",21,"03743","Economia",9.2);
        Aluno a2 = new  Aluno("Rafalle",23,"21942","Marketing",9.5);
        Aluno a3 = new Aluno("Artyom", 34,"73410","Mecânica",6.7);
        Aluno a4 = new Aluno("Kalinka",42,"86721","Comunicação",7.4);
        Aluno a5 = new Aluno("Maria",19,"14398","Computação",6.4);

        AlunosLista escola = new AlunosLista();
        escola.adicionarAluno(a1);
        escola.adicionarAluno(a2);
        escola.adicionarAluno(a3);
        escola.adicionarAluno(a4);
        escola.adicionarAluno(a5);

        System.out.println(escola.BuscarAlunoporCursoIdadeMedia("Economia",21,9.2));
        System.out.println(escola.buscarAlunoporMatricula("21942"));
    }
}
