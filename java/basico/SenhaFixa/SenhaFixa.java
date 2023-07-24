package java.basico.SenhaFixa;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) throws IOException {
    		Locale.setDefault(Locale.US);
    		Scanner sc = new Scanner(System.in);
    		int passwd = sc.nextInt();
    		while (passwd != 2002) {
    			System.out.println("Senha Invalida");
    			passwd = sc.nextInt();
    		}
    		sc.close();
    		System.out.println("Acesso Permitido");
    }
}
