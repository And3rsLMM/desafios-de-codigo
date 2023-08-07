# Descrição
Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise simples desses logs.

## Entrada
O programa solicitará ao usuário que insira a quantidade de logs a serem analisados.
Em seguida, para cada log, o usuário deve fornecer as informações no seguinte formato: "data, hora, serviço AWS e descrição do evento".
Obs: Utilize a função Scanner para receber as entradas.

## Saída
O programa exibirá os resultados da análise, apresentando:

A quantidade de eventos específicos para cada serviço AWS.
O serviço AWS que teve a maior quantidade de eventos registrados
O serviço AWS que teve a menor quantidade de eventos registrados
Veja exemplos abaixo.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

    Entrada	                                                        
    4                                                               
    2023-07-24 10:15:32,S3,Bucket example-bucket created
    2023-07-24 10:17:45,EC2,Instance i-12345 started
    2023-07-24 10:20:11,EC2,Instance i-67890 stopped
    2023-07-24 10:23:05,S3,Object example.txt deleted from bucket example-bucket

    Saída
    Eventos por servico:
    S3:2
    EC2:2
    Maior:EC2
    Menor:S3

    Entrada
    3	
    2023-07-24 10:15:32,EC2,Instance i-12345 started
    2023-07-24 10:17:45,EC2,Instance i-67890 stopped
    2023-07-24 10:20:11,S3,Bucket example-bucket created

    Saida                                                                 
    Eventos por servico:
    S3:1
    EC2:2
    Maior:EC2
    Menor:S3

    Entrada
    6
    2023-07-24 10:15:32,EC2,Instance i-12345 started
    2023-07-24 10:17:45,S3,Bucket example-bucket created
    2023-07-24 10:20:11,EC2,Instance i-67890 stopped
    2023-07-24 10:23:05,Lambda,Function example-function executed successfully
    2023-07-24 10:25:39,S3,Object example.txt deleted from bucket example-bucket
    2023-07-24 10:28:02,EC2,Instance i-98765 started

    Saída
    Eventos por servico:
    S3:2
    EC2:3
    Lambda:1
    Maior:EC2
    Menor:Lambda