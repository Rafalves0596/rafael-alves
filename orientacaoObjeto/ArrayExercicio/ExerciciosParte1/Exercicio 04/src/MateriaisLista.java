import java.util.ArrayList;
import java.util.List;

public class MateriaisLista {
    private List <Materiais> materiais;
     public MateriaisLista(){
         materiais = new ArrayList<>();
     }
     public void adicionarMateriais (Materiais m){
         materiais.add(m);
     }
     public Materiais produtoMaisCaro(String marca){
         Materiais produtoMaisCaro = null;
         double precoMaior = Double.MIN_VALUE;

         for(Materiais m: materiais){
             if(marca.equals(m.getMarca()) && m.getPreco()>precoMaior){
                 produtoMaisCaro = m;
                 precoMaior = m.getPreco();
             }
         }
         return produtoMaisCaro;
     }
     public List <Materiais> buscarNoEstoque(double precoInicial, double precoFinal, String marca){
         List<Materiais> buscarNoEstoque = new ArrayList<>();

         for(Materiais m: materiais){
             if(marca.equals(m.getMarca()) && m.getPreco() >= precoInicial && m.getPreco() <= precoFinal){
                 buscarNoEstoque.add(m);
             }
         }
         return buscarNoEstoque;
     }


}
