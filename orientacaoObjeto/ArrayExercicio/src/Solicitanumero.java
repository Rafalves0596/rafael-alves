import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solicitanumero {
    public static void main(String[] args) {
        List <Integer> numeros = new ArrayList<>();
        numeros.add(34);
        numeros.add(12);
        numeros.add(43);
        numeros.add(82);
        numeros.add(71);
        numeros.add(5);
        numeros.add(9);

        Scanner input = new Scanner(System.in);
        System.out.println("Pergunte um número que pode estar na lista: ");
        int num = input.nextInt();

        System.out.println(numeros.contains(num));
        System.out.println(numeros.indexOf(num));

    }
}
