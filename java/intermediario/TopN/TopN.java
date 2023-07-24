package java.intermediario.TopN;

import java.util.Scanner;

public class TopN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        int N = scan.nextInt();
        int anterior = 0;
        
        for (var indice = 0; indice < TOPS.length; indice++) {
            if (N > anterior && N <= TOPS[indice])
                System.out.println("Top " + TOPS[indice]);

            anterior = TOPS[indice];
        }
    }
}
