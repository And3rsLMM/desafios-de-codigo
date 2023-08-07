package java.intermediario.VelocidadeDownloadAWS;

import java.util.Scanner;

public class VelocidadeDownloadAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
        double distanciaServidores = scanner.nextDouble();
        double velocidadePlano = scanner.nextDouble();

        // Calcula a velocidade de download estimada
        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        // Apresenta o resultado
        System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

        scanner.close();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        // Calcula a velocidade de download estimada usando a fórmula fornecida
        double velocidadeDownloadEstimada = velocidadePlano / (1 + (distanciaServidores / 100));

        // Verifica se a velocidade estimada é maior do que a velocidade do plano e ajusta, se necessário
        if (velocidadeDownloadEstimada > velocidadePlano) {
            velocidadeDownloadEstimada = velocidadePlano;
        }

        return velocidadeDownloadEstimada;
    }
}
