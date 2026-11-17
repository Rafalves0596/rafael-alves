import java.time.LocalDate;

public class DesafioUsuario {

    public static void main(String[] args) {
        desafio u = new desafio(LocalDate.of(1989,11,16));

        System.out.println("Nascido em "+ u);

        if(u.determinarMaiorIdade()){
            System.out.println("Usuário maior de idade.");
        } else {
            System.out.println("Usuário menor de idade.");
        }
    }
}
