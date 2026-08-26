import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma palavra: ");
        String palavra = input.next();
    }

    public static char obterLetras(String palavra){
        if(palavra.length()%2==0){
            return palavra.charAt(0);
        }
        return palavra.charAt(1);
    }


}
