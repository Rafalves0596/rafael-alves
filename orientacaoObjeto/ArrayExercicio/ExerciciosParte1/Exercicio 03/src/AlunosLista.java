import java.util.ArrayList;
import java.util.List;

public class AlunosLista {
    private List <Aluno> alunos;

   public AlunosLista(){
       alunos = new ArrayList<>();
   }
   public void adicionarAluno(Aluno a){
       alunos.add(a);
    }
    public List <Aluno> BuscarAlunoporCursoIdadeMedia(String curso,int idade,double media){
       List <Aluno> alunoPesquisa = new ArrayList<Aluno>();
       for(Aluno a : alunos){
           if(a.getCurso().equals(curso)&& a.getIdade()>=idade && a.getMedia()> media){
               alunoPesquisa.add(a);
           }
       }
       return  alunos;
    }
    public Aluno buscarAlunoporMatricula(String matricula){
       for(Aluno a : alunos){
           if(a.getMatricula().equals(matricula)){
               return a;
           }
       }
       throw new IllegalArgumentException("Matricula não encontrada.");
    }

}
