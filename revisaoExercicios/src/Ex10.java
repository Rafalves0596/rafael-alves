import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor máximo: ");
        int maximo = input.nextInt();
        System.out.println("Informe um valor mínimo: ");
        int minimo = input.nextInt();
        System.out.println("Infore um valor entre os limites: ");
        int valor = input.nextInt();
    }

    public static String analisaLimite(int max, int min,int valor){
        if(valor>=min && valor<=max){
            return valor + " está dentro dos limites";
        } else {
            return valor + " está fora dos limites.";
        }

    }
}
