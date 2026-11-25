import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Familia {
    private List <Pessoa> pessoas;
    public Familia(){
        this.pessoas = new ArrayList<>();

    }
    public void adicionarPessoa(Pessoa p){
        pessoas.add(p);
    }

    public Pessoa pessoaMaisVelha(){
        LocalDate dataMaisAntiga = LocalDate.now();
        Pessoa pessoaMaisVelha = null;

        for(Pessoa p : pessoas){
            if(p.getData_nascimento().isBefore(dataMaisAntiga)){
                dataMaisAntiga = p.getData_nascimento();
                pessoaMaisVelha = p;
            }
        }
        return pessoaMaisVelha;
    }
}
