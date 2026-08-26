import java.util.Scanner;

public class variacaoEx09 {
    public static boolean analisaImparPar(int numero){
      return numero %2 == 0;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = input.nextInt();
        System.out.println(analisaImparPar(numero));
    }
}
