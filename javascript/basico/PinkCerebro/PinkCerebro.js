// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde: 
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.

let N = parseInt(gets());
let numeros = gets().split(" ").map(numero => parseInt(numero));

let multiplos = 0;

for (let i = 2; i < 6; i++) {
numeros.forEach(numero => {
if(numero % i === 0) {
multiplos++;
}
});
print(multiplos + " Multiplo(s) de " + i);
multiplos = 0;
}