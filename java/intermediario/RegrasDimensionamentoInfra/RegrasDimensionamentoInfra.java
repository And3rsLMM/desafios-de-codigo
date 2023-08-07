package java.intermediario.RegrasDimensionamentoInfra;

import java.util.Scanner;

public class RegrasDimensionamentoInfra {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        int numeroTotalPods = scanner.nextInt();

        // Calculando o número mínimo de nodes necessários
        int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods / podsPorNode);

        // Calculando o número mínimo de servidores necessários
        int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods / podsPorServidor);

        // Exibindo o resultado com as recomendações de quantidades de servidores e nodes.
        

        // Recomendações
        // Atenção aos acentos e espaços nas saidas!!!!
        //Caso contrario você ira ficar que nem eu procurando um espaço por meia hora entre o 1. e os resto da saida =)
        if (numeroMinimoNodes <= 1) {
            System.out.println("1.Recomendamos usar um unico node");
        } else {
            System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
        }
        if (numeroMinimoServidores <= 1) {
            System.out.println("1.Recomendamos usar um unico servidor");
        } else {
            System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);
        }

        // Fechando o Scanner
        scanner.close();
    }
}