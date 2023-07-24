import java.util.*;

public class QuitandaDoSeuZe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double morangos = input.nextDouble();
        double macas = input.nextDouble();
        double precoMorango = 0, precoMaca = 0;

        // Verificando o preço do morango
        if (morangos <= 5) {
            precoMorango = 2.5;
        } else {
            precoMorango = 2.2;
        }

        // Verificando o preço da maçã
        if (macas <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalCompra = (morangos * precoMorango) + (macas * precoMaca);

        // Verificando se o cliente tem direito ao desconto
        if ((morangos + macas) > 8 || totalCompra > 25) {
            totalCompra *= 0.9;
        }

        System.out.println(totalCompra);

    }
}