const aluno = ["João", "Juliana", "Ana", "Caio"];
const medias = [10, 8, 7.5, 9];

const listaDeAlunosEMedias = [aluno, medias];

function exibeNomeENota(aluno){
    if(listaDeAlunosEMedias[0].includes(aluno)){
        //const alunos = listaDeAlunosEMedias[0];
        //const medias = listaDeAlunosEMedias[1];

        const [alunos, medias] = listaDeAlunosEMedias; //Mesma coisa dos dois comandos de cima

        const i = alunos.indexOf(aluno);
        const mediaDoAluno = medias[i];

        console.log(`${aluno} tem a média ${mediaDoAluno}`);
    }
    else{
        console.log("Aluno não encontrado!");
    }
}

exibeNomeENota("Ana")