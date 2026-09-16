/*
7)
 Faça uma classe chamada Aeronave.
 Com os atributos:
• Modelo
• Passageiros
• Velocidade máxima
• Capacidade de combustível
• Queima de combustível por minuto
  Crie 4 objetos de sua preferência.
  Calcule:
  a) Qual aeronave leva o maior número de passageiros?
  b) Qual das aeronaves pode ficar mais tempo no ar?
  c) Considerando que os aviões estão em velocidade máxima, qual deles consegue voar mais
    longe?
 */

public class Aeronave {
   private String modelo;
   private int passageiros;
   private double vel_Max;
   private double capDoTanque;
   private double queimaPorMinuto;

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      if(modelo == null ||modelo.isBlank()){
         System.out.println("Erro, modelo de aeronave inválida.");
      } else {
         this.modelo = modelo;
      }
   }

   public int getPassageiros() {
      return passageiros;
   }

   public void setPassageiros(int passageiros) {
      if(passageiros<0){
         System.out.println("Erro qauntidade de passageiros é inválida.");
      } else {
         this.passageiros = passageiros;
      }
   }

   public double getVel_Max() {
      return vel_Max;
   }

   public void setVel_Max(double vel_Max) {
      if(vel_Max<=0){
         System.out.println("Erro, velocidade inválida.");
      } else {
         this.vel_Max = vel_Max;
      }
   }

   public double getCapDoTanque() {
      return capDoTanque;
   }

   public void setCapDoTanque(double capDoTanque) {
      if(capDoTanque<=0){
         System.out.println("Erro, capacidade de combustível inválida.");
      } else {
         this.capDoTanque = capDoTanque;
      }
   }

   public double getQueimaPorMinuto() {
      return queimaPorMinuto;
   }

   public void setQueimaPorMinuto(double queimaPorMinuto) {
      if(queimaPorMinuto<=0){
         System.out.println("Erro, queima de combustível inválida.");
      } else {
         this.queimaPorMinuto = queimaPorMinuto;
      }
   }

   @Override
   public String toString() {
      return "Aeronave{" +
              "modelo='" + modelo + '\'' +
              ", passageiros=" + passageiros +
              ", velocidade_Max=" + vel_Max +
              ", CapacidadeDoTanque=" + capDoTanque +
              ", queimaCombustivel=" + queimaPorMinuto +
              '}';
   }

   public Aeronave(String modelo, int passageiros, double vel_Max, double capDoTanque, double queimaPorMinuto) {
      /*this.modelo = modelo;
      this.passageiros = passageiros;
      this.vel_Max = velocidade_Max;
      capDoTanque = capacidadeDoTanque;
      this.queimaPorMinuto = queimaCombustivel;
       */
      setModelo(modelo);
      setPassageiros(passageiros);
      setVel_Max( vel_Max);
      setCapDoTanque(capDoTanque);
      setQueimaPorMinuto(queimaPorMinuto);
   }
   public double calculaTempoNoAr(){
      return capDoTanque/queimaPorMinuto;
   }
   public double calculaMaiorDistancia(){
      return calculaTempoNoAr()*vel_Max;
   }


}


