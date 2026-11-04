import java.util.ArrayList;
import java.util.List;

public class ContaLista {
    private List <Conta> contas;
    public ContaLista(){
        contas = new ArrayList<>();
    }
    public void adicionarConta (Conta c){
        contas.add(c);

    }
}
