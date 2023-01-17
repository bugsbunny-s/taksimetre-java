import java.util.Scanner;
public class taksi {
    public static void main(String[] args){
        double km = 2.20 ,tl=10, mesafe, min = 20;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidiceginiz mesafeyi km olarak yazınız : ");
        mesafe = inp.nextDouble();
        
        tl = mesafe * km;
        System.out.print(tl <= 20 ? "Ödemeniz gereken tutar : " + min : "Ödemeniz gereken tutar :" + tl);

       
         
    }
}
