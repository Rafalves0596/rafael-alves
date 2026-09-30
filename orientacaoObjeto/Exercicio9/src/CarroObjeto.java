import java.sql.SQLOutput;

public class CarroObjeto {
    public static void main(String[] args) {
        Carro c1 = new Carro(50);
        System.out.println("Velocidade normal: "+c1.getVelelocidade());

        c1.acelerar(10.0);
        System.out.println("Com Aceleração: "+c1.getVelelocidade());


        c1.freiar(20.0);
        System.out.println("Com redução "+c1.getVelelocidade());

    }
}
