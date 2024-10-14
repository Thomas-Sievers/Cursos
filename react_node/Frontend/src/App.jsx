import { useState } from 'react'
import Header from './Componentes/Header'
import Notes from './Componentes/Notes'

import './styles/global.css'
import './styles/sidebar.css'
import './styles/app.css'
import './styles/main.css'

function App(){
  return (
    <div id='app'>
      <aside>
        <strong>Caderno de notas</strong>

        <form>
          <div className='input-block'>
            <label htmlFor="title">Títula da anotação</label>
            <input/>
          </div>
        </form>

        <div className="input-block">
          <label htmlFor="nota">Anotações</label>
          <textarea></textarea>
        </div>

        <button type="submit">Salvar</button>
      </aside>
      <main>
        <ul>
          <Notes />
        </ul>
      </main>
    </div>
  )
}

export default App
