//4)
//Faça um programa que descubra:
//a) O maior elemento de um vetor
//b) O menor elemento de um vetor
//c) A média dos valores
//(Criar um método para cada questão)
public class Ex04 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};
        maiorElemento(vetor);
        menorElemento(vetor);
        mediaElemento(vetor);


    }
    public static void maiorElemento(int[] vetor){
        int maior=vetor[0];
        for(int i=0; i<6; i++){
            if(vetor[i]>maior){
                maior=vetor[i];

            }
        }
        System.out.println("O maior valor é: "+maior);
    }
    public static void menorElemento(int[] vetor){
        int menor=vetor[0];
        for (int j=0; j<6; j++){
            if(vetor[j]<menor){
                menor=vetor[j];
            }
        }
        System.out.println("O menor valor é: "+menor);

    }
    public static void mediaElemento(int[] vetor){
        double soma=0;
        for(int k=0; k<6; k++){
            soma = vetor[k]+soma;
        }
        double media = soma/6;
        System.out.println("a média é: "+media);
    }
}
