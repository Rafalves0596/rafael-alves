import java.time.LocalDate;

public class Ex09 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vicente", LocalDate.of(1986,7,29));
        Pessoa p2 = new Pessoa("Valeria",LocalDate.of(1985,3,6));

        Familia f1 = new Familia();

        f1.adicionarPessoa(p1);
        f1.adicionarPessoa(p2);

        System.out.println(f1.pessoaMaisVelha());
    }
}
