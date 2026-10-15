import java.util.ArrayList;
import java.util.List;

public class FlorLista {
    private List <Flor> flores;

    public FlorLista(){
        flores = new ArrayList<>();
    }
    public void adicionarFlores(Flor f){
        flores.add(f);
    }
    public List<Flor> pesquisarFlores(String nomeCliente){
        List <Flor> floresPesquisa = new ArrayList<Flor>();
        for(Flor f : flores){
            if(f.getNomeCliente().equals(nomeCliente)){
                floresPesquisa.add(f);
            }
        }

        return floresPesquisa;
    }

}
