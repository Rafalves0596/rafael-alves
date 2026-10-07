import java.util.Scanner;

public class Ex08 {
    public static double calcularMedia(double notaUm,double notaDois, double notaTres){
        double media = (notaUm+notaDois+notaTres)/3;

        return media;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua primeira nota: ");
        double notaUm = input.nextDouble();
        System.out.println("Informe sua segunda nota: ");
        double notaDois = input.nextDouble();
        System.out.println("Informe sua terceira nota: ");
        double notaTres = input.nextDouble();

        double media = calcularMedia (notaUm,notaDois,notaTres);
        System.out.println(media);
    }
}
