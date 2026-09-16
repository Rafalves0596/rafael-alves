public class AeronaveClasse {
    public static void main(String[] args) {
        Aeronave aviao1 = new Aeronave("boeing_737",230,870,27000,60);
        Aeronave aviao2 = new Aeronave( "airbus_A350",180,832,23000,40);
        Aeronave aviao3 = new Aeronave("embraer_E195",132,870,13000,22);
        Aeronave aviao4 = new Aeronave("boeing_777",345,950,120000,160);

        Aeronave[] aeronaves = {aviao1,aviao2,aviao3,aviao4};
        double maiorNumPass = 0;
        Aeronave aviaoMaiorPass = null;
        for(int i=0; i< aeronaves.length; i++){
            if(aeronaves[i].getPassageiros()>maiorNumPass){
                maiorNumPass = aeronaves[i].getPassageiros();
                aviaoMaiorPass = aeronaves[i];
            }
        }
        System.out.println("O avião com maior número de Passageiros é: "+ aviaoMaiorPass);

        double maiorTempoAr = 0;
        Aeronave aviaoMaiorTempAr = null;
        for(int i=0; i< aeronaves.length; i++){
            if(aeronaves[i].calculaTempoNoAr()>maiorTempoAr){
                maiorTempoAr = aeronaves[i].calculaTempoNoAr();
                aviaoMaiorTempAr = aeronaves[i];
            }
        }
        System.out.println("O avião que fica mais tempo no ar: "+aviaoMaiorTempAr);

        double maiorDistancia = 0;
        Aeronave aviaoMaiorDistancia = null;
        for(int i=0; i< aeronaves.length; i++){
            if(aeronaves[i].calculaMaiorDistancia()>maiorDistancia){
                maiorDistancia = aeronaves[i].calculaMaiorDistancia();
                aviaoMaiorDistancia = aeronaves[i];
            }
        }
        System.out.println("O avião que fica maior tempo no ar é: "+aviaoMaiorDistancia);
    }
}
