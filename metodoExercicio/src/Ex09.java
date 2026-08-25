import java.util.Scanner;

public class Ex09 {
    public static boolean analisaImparPar(int numero){
        if(numero % 2 == 0){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = input.nextInt();
        System.out.println(analisaImparPar(numero));
    }
}
