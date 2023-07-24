import java.io.IOException;
import java.util.Scanner;

public class TaxaImpostoRenda {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0;

        if (renda > 4500) {
            imposto = (renda - 4500) * 0.28 + 350;
        } else if (renda > 3000) {
            imposto = (renda - 3000) * 0.18 + 80;
        } else if (renda > 2000) {
            imposto = (renda - 2000) * 0.08;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", imposto);
        }
    }
}