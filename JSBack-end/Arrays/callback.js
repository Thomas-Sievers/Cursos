const nomes = ["Evaldo", "Mari", "Camis"];

nomes.forEach(function(nomes){
    console.log(nomes);
});

nomes.forEach((nome)=>{
    console.log(nome);
});

function imprimeNome(nome){
    console.log(nome);
}

nomes.forEach(imprimeNome)