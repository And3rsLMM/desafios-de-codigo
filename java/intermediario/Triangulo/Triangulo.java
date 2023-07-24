import java.io.IOException;
import java.util.Scanner;

public class Triangulo {

public static void main(String[] args) throws IOException {

    Scanner leitor = new Scanner(System.in);    
    double A = leitor.nextDouble();    
    double B = leitor.nextDouble();    
    double C = leitor.nextDouble();    
    double maior;    
    double soma;    
    boolean triangulo;
    
    // Verifica se as medidas formam um triângulo    
    if ((A < B + C) && (B < A + C) && (C < A + B)) {
        triangulo = true;
        soma = A + B + C;
        System.out.printf("Perimetro = %.1f\n", soma);   
    } else {
        triangulo = false;
        maior = (A + B + Math.abs(A - B)) / 2.0;
        soma = maior + C;
        System.out.printf("Area = %.1f\n", ((A + B) * C) / 2.0);
    }
  }
}