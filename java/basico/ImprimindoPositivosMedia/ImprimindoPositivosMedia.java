import java.util.Scanner;

public class ImprimindoPositivosMedia {
	
  public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double x;

     for (int i = 0; i < 6; i++) {
         x = leitor.nextDouble();
         if (x > 0) {
             cont++;
             media += x;
         }
     }
        
     media /= cont;
     System.out.println(cont + " valores positivos");
     System.out.println(String.format("%.1f", media));
  }
	
}