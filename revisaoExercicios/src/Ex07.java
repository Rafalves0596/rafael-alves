import java.util.Scanner;

public class Ex07 {
    public static String imprimirVerao(){


    return "E está calor.";
    }
    public static String imprimirOutono(){

    return "E as folhas caem.";
    }
    public static  String imprimirPrimavera(){

    return "E as flores florescem.";
    }
    public static String  imprimirInverno(){

    return "E esta frio.";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a estação do ano: ");
        int estacao = input.nextInt();

        if(estacao == 1 ){
            System.out.println("É verão, "+ imprimirVerao());
        } else if(estacao == 2){
            System.out.println("É Outono, "+imprimirOutono());
        } else if(estacao == 3){
            System.out.println("É Primavera, "+imprimirPrimavera());
        } else if(estacao == 4){
            System.out.println("É Inverno, "+imprimirInverno());
        }

    }
}
