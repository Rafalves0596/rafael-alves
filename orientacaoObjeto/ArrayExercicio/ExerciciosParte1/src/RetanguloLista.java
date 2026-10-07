import java.util.ArrayList;
import java.util.List;

public class RetanguloLista {
    private List <Retangulo> retangulos;

    public RetanguloLista(){
            retangulos = new ArrayList<>();
    }
    public void AdicionarRetangulo(Retangulo r){
            retangulos.add(r);
    }
    public Retangulo obterMaiorAreaRetangulo(){
            double maiorArea = Double.MIN_VALUE;

            Retangulo obterMaiorAreaRetangulo = null;
            for(Retangulo r : retangulos){
                    if(r.cacularArea()>maiorArea){
                            maiorArea = r.cacularArea();
                            obterMaiorAreaRetangulo = r;
                    }
            }
            return obterMaiorAreaRetangulo;
    }
        public Retangulo obterMaiorPerimetroRetangulo(){
                double maiorPerimetro = Double.MIN_VALUE;

                Retangulo obterMaiorPerimetroRetangulo = null;
                for(Retangulo r : retangulos){
                        if(r.cacularArea()>maiorPerimetro){
                                maiorPerimetro = r.cacularArea();
                                obterMaiorPerimetroRetangulo = r;
                        }
                }
                return obterMaiorPerimetroRetangulo;
        }



}
