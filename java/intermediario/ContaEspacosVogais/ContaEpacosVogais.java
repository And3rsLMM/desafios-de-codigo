import java.util.Scanner;

public class ContaEspacoseVogais {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String frase = sc.nextLine();
    char[] letras = frase.toCharArray();
    String[] fraseSplit = frase.split(" ");
    char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
    int espacosEmBranco = fraseSplit.length - 1, quantVogais = 0;

    for (int i = 0; i < letras.length; i++) {

      for (int v = 0; v < vogais.length; v++) {

        if (vogais[v] == Character.toLowerCase(letras[i])) {
          quantVogais++;
        }

      }

    }

    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

  }
}