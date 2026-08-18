//4)
//Faça um programa que descubra:
//a) O maior elemento de um vetor
//b) O menor elemento de um vetor
//c) A média dos valores
//(Criar um método para cada questão)
public class Ex04 {
    public static void main(String[] args) {
        int[] vetor = {3,5,-4,7,-8,1};
        System.out.println("O maior elemento é: ");
        maiorElemento(vetor);
        System.out.println("O menor elemento é: ");
        System.out.println("A média dos elementos é: ");

    }
    public static void maiorElemento(int[] vetor){
        int maior=vetor[0];
        for(int i=0; i<6; i++){
            if(vetor[i]>maior){
                maior=vetor[i];

            }
        }
    }
    public static void menorElemento(int[] vetor){
        int menor=vetor[0];
        for (int j=0; j<6; j++){
            if(vetor[j]<menor){
                menor=vetor[j];
            }
        }

    }
    public static void mediaElemento(int[] vetor){
        int soma=0;
        for(int k=0; k<6; k++){
            soma = vetor[k]+soma;
        }
        int media = soma/6;
    }
}
