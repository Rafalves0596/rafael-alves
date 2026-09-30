
    public class Carro {
        private double velocidade;
        public Carro(double velocidade) {
            setVelelocidade(velocidade);
        }
        public void acelerar(double aceleracao){
            if(aceleracao<0 || aceleracao>=20){
                throw new IllegalArgumentException("Aceleração inválida para o cálculo.");
            }
            setVelelocidade(velocidade+aceleracao);
        }
        public void freiar (double freio){
            if(freio<0 || freio>=30){
                throw new IllegalArgumentException("Redução inválida para o cálculo.");
            }
            setVelelocidade(velocidade-freio);
        }

        public double getVelelocidade() {
            return velocidade;
        }

        public void setVelelocidade(double velelocidade) {
            if(velocidade<0){
                throw new IllegalArgumentException("A velociade não pode ser negativa.");
            }
            this.velocidade = velelocidade;
        }
        @Override
        public String toString() {
            return "Carro{" +
                    "velocidade=" + velocidade +
                    '}';
        }
    }

