package java.intermediario.MonitoramentoLogsAWS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEventos = 0;
        Map<String, Integer> eventosPorServico = new HashMap<>();
        String maiorServico = "";
        String menorServico = "";

        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        for (int i = 0; i < quantidadeLogs; i++) {
            String linhaLog = scanner.nextLine();
            String[] partesLog = linhaLog.split(",");

            if (partesLog.length >= 3) {
                String servico = partesLog[1].trim();

                // Atualizar contagem de eventos por serviço
                eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0) + 1);

                // Atualizar maior e menor serviço
                if (maiorServico.equals("") || eventosPorServico.get(servico) > eventosPorServico.get(maiorServico)) {
                    maiorServico = servico;
                }
                if (menorServico.equals("") || eventosPorServico.get(servico) < eventosPorServico.get(menorServico)) {
                    menorServico = servico;
                }

                totalEventos++;
            }
        }

        // Exibir resultados da análise
        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Integer> entry : eventosPorServico.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Maior:" + maiorServico);
        System.out.println("Menor:" + menorServico);

        scanner.close();
    }
}

