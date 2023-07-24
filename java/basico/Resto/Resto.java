import java.io.IOException;
import java.util.Scanner;

public class Resto {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (var numero = 0; numero < 10000; numero++) {
            if (numero % N == 2)
                System.out.println(numero);
        }
    }
}