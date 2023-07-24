// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.
var line = gets().split(" ");
let X = parseFloat(line[0]);
let Y = parseFloat(line[1]);

if (X === 0 && Y === 0) {
  print("Origem");
} 
else if (X === 0 && Y !== 0) {
  print("Eixo Y");
} 
else if (X !== 0 && Y === 0) {
  print("Eixo X");
} 
else if (X > 0 && Y > 0) {
  print("Q1");
} 
else if (X < 0 && Y > 0) {
  print("Q2");
} 
else if (X < 0 && Y < 0) {
  print("Q3");
} 
else if (X > 0 && Y < 0) {
  print("Q4");
}