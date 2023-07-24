// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.


let valores1 = gets().split(" ");
let valores2 = gets().split(" ");

let codigo1 = parseInt(valores1[0]);
let numero1 = parseInt(valores1[1]);
let valorUnitario1 = parseFloat(valores1[2]);

let codigo2 = parseInt(valores2[0]);
let numero2 = parseInt(valores2[1]);
let valorUnitario2 = parseFloat(valores2[2]);

let total1 = numero1 * valorUnitario1;
let total2 = numero2 * valorUnitario2;

let soma = total1 + total2;

print('VALOR A PAGAR: R$ ' + soma.toFixed(2));