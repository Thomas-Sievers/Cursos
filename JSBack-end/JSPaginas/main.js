const listaTeclas = document.querySelectorAll('.tecla')

function tocaSom(idElementoAudio){
    const elemento = document.querySelector(idElementoAudio).play();

    if(elemento != null && elemento === 'audio'){
        elemento.play()
    }
    else{
        alert('Elemento nao encontrado')
    }
}

for(let contador = 0; contador < listaTeclas.length; contador++){

    const tecla = listaTeclas[contador];
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}` //template string

    tecla.onclick = function(){
        tocaSom(idAudio);
    }
    
    tecla.onkeydown = function(event){
        if(event.code === 'Space' || event.code === 'Enter'){
            tecla.classList.add('ativa')
        }
    }

    tecla.onkeyup = function(){
        tecla.classList.remove('ativa')
    }
}
