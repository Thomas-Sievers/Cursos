const listaTeclas = document.querySelectorAll('.tecla')

function tocaSom(idElementoAudio){
    document.querySelector(idElementoAudio).play();
}

for(let contador = 0; contador < listaTeclas.length; contador++){

    const tecla = listaTeclas[contador];
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}` //template string

    tecla.onclick = function(){
        tocaSom(idAudio);
    }
}
