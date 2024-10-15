import { useState, useEffect } from 'react';
import Header from './Componentes/Header';
import Notes from './Componentes/Notes';
import api from './services/api';

import './styles/global.css';
import './styles/sidebar.css';
import './styles/app.css';
import './styles/main.css';

function App(){

  const [ title, setTitle ] = useState('');
  const [ notes, setNotes ] = useState('');
  const [ allNotes, setAllNotes] = useState([]);

  useEffect(() => {

    async function getAllNotes(){
      const res = await api.get('/annotations',);

      setAllNotes(res.data);
    }

    getAllNotes();
    
  }, []);

  async function handleSubmit(event){

    event.preventDefault();

    const res = await api.post('/annotations', {
      title,
      notes,
      priority: false
    })

    setTitle('');
    setNotes('');

    setAllNotes([ ...allNotes, res.data]);

  }

  useEffect(() => {
    function enableSubmitButton(){
      let btn = document.getElementById('btn_submit')
      btn.style.background = '#FFD3CA';
      if(title && notes){
        btn.style.background = '#EB8f7A';
      }
    }
    enableSubmitButton();
  }, [title, notes])

  return (
    <div id='app'>
      <aside>
        <strong>Caderno de notas</strong>
        <form onSubmit={handleSubmit}>
          <div className='input-block'>
            <label htmlFor="title">Títula da anotação</label>
            <input 
              required 
              value={title} 
              onChange={ event => setTitle(event.target.value)}
            />
          </div>
        

          <div className="input-block">
            <label htmlFor="nota">Anotações</label>
            <textarea 
              required 
              value={notes}
              onChange={ event => setNotes(event.target.value)} 
            />
          </div>

          <button id='btn_submit' type="submit">Salvar</button>

        </form>

      </aside>
      <main>
        <ul>
          {allNotes.map(data => (
            <Notes data={data} />
          ))}
        </ul>
      </main>
    </div>
  )
}

export default App
