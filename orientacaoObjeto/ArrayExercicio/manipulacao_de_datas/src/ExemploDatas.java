import java.time.LocalDate;
import java.time.Period;

public class ExemploDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate dataNascimentoRafael = LocalDate.of(2005,7,29);
        LocalDate dataNascimentoIsabelli = LocalDate.of(2007,9,15);

        System.out.println("Rafael é:" + dataNascimentoRafael);
        System.out.println("Isabelli é de "+dataNascimentoIsabelli);

       if(dataNascimentoRafael.isAfter(dataNascimentoIsabelli)){
           System.out.println("Rafael é mais velho.");
       } else {
           System.out.println("Isabaelli é mais velha.");
       }
       int idadeRafael = Period.between(dataNascimentoRafael, hoje).getYears();
    }
}
