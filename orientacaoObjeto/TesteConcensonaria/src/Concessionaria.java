import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Veiculo> veiculos;

    public Concessionaria(){
        veiculos = new ArrayList<Veiculo>();
    }
    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }

    public Veiculo obterMenorPrecoVeiculo(){
        double menorPreco = Double.MAX_VALUE;
        Veiculo veiculoMenorPreco = null;

        for(Veiculo v: veiculos){
            if(v.getPreco() < menorPreco){
                menorPreco = v.getPreco();

            }
        }
        return veiculoMenorPreco;
    }
}
