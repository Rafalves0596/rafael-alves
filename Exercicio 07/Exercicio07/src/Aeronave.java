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
      this.modelo = modelo;
   }

   public int getPassageiros() {
      return passageiros;
   }

   public void setPassageiros(int passageiros) {
      this.passageiros = passageiros;
   }

   public double getVel_Max() {
      return vel_Max;
   }

   public void setVel_Max(double vel_Max) {
      this.vel_Max = vel_Max;
   }

   public double getCapDoTanque() {
      return capDoTanque;
   }

   public void setCapDoTanque(double capDoTanque) {
      this.capDoTanque = capDoTanque;
   }

   public double getQueimaPorMinuto() {
      return queimaPorMinuto;
   }

   public void setQueimaPorMinuto(double queimaPorMinuto) {
      this.queimaPorMinuto = queimaPorMinuto;
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

   public Aeronave(String modelo, int passageiros, double velocidade_Max, double capacidadeDoTanque, double queimaCombustivel) {
      this.modelo = modelo;
      this.passageiros = passageiros;
      this.vel_Max = velocidade_Max;
      capDoTanque = capacidadeDoTanque;
      this.queimaPorMinuto = queimaCombustivel;
   }
   public double calculaTempoNoAr(){
      return capDoTanque/queimaPorMinuto;
   }
   public double calculaMaiorDistancia(){
      return calculaTempoNoAr()*vel_Max;
   }


}


