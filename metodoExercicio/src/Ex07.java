import java.util.Scanner;

public class Ex07 {
    public static int estacoesDoAno(int verao, int outono, int primavera, int inverno){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 4: ");
        int numero = input.nextInt();

        if(numero == 1){
            System.out.println("É verão, o tempo está quente.");

        } else if(numero == 2){
            System.out.println("É Outono, as folhas caem.");

        } else if(numero == 3){
            System.out.println("É primavera, as flores estão florescendo.");

        } else if(numero == 4){
            System.out.println("É inverno, o tempo esta frio.");
        }

        return numero;
    }

    public static void main(String[] args) {
        System.out.println(estacoesDoAno(1,2,3,4));
    }
}
