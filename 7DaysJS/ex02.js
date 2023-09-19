//Primeiro desafio
let nome = prompt("Qual é seu nome?")
let idade = prompt("Quantos anos você tem?")
let linguagem = prompt("Qual linguagem de programação você usa?")

alert("Olá " + nome +  ", você tem" +  idade + " anos e já está aprendendo " + linguagem + "!")

//Desafio opcional

let escolha = prompt("Você gosta de estudar " + linguagem + "? Responde com o número 1 para SIM e 2 para NÃO")

if(escolha == 1){
    alert("Muito bom! Continue estudando e você terá muito sucesso.")
}
else{
    alert("Ahh que pena... Já tentou aprender outras linguagens?")
}