import java.time.LocalDate;
import java.time.Period;

public class desafio {
    private LocalDate dataNascimento;
    public desafio(LocalDate dataNascimento){
        setDataNascimento(dataNascimento);
    }
    public boolean determinarMaiorIdade(){
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();

        if(idade>=18){
            return true;
        } else {
            return false;
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "desafio{" +
                "dataNascimento=" + dataNascimento +
                '}';
    }
}
