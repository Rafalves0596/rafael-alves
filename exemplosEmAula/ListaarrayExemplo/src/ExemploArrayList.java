import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List <Integer> idades = new ArrayList<>();
        // para adicionar itens a lista.
        idades.add(21);
        idades.add(22);
        idades.add(13);
        idades.add(14);
        idades.add(69);
        idades.add(37);

        System.out.println(idades); // mostra os elementos dentro da lista
        System.out.println(idades.contains(22)); // cata algum item específico
        System.out.println(idades.indexOf(69)); // cata qual a posição do item da lista
        System.out.println(idades.size()); // mostra o tamanho a lista
        System.out.println(idades.getLast()); // mostra o último elemento da lista
        System.out.println(idades.getFirst()); // mostra o incio da lista
        Collections.sort(idades);
    }
}
