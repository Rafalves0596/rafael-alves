import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate data_nascimento;

    public Pessoa(String nome, LocalDate data_nascimento) {
       setNome(nome);
       setData_nascimentos(data_nascimento);
    }

    public String getNome() {
        return nome;
    }
    public int obterIdade(){
        return Period.between(data_nascimento,LocalDate.now()).getYears();
    }

    public void setNome(String nome) {
        if(nome.isBlank()||nome == null)
        this.nome = nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimentos(LocalDate data_nascimento) {
        if(data_nascimento == null || data_nascimento.isAfter(LocalDate.now()))
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return "Familia{" +
                "nome='" + nome + '\'' +
                ", data_nascimentos=" + data_nascimento +
                '}';
    }
}
