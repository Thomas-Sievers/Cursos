import { useState } from 'react'
import Header from './Componentes/Header'

// Componente = é uma estrutura do código que retorna um HTML, CSS ou JS
// Propriedades = São informações que um componente Pai, passa pra um componente filho
// Estado = função que manipula uma informaçõa e armazena a mesma

function App() {
  const [count, setCount] = useState(0);

  function handleSoma(){
    setCount(count + 1);
  }

  function handleMenos(){
    setCount(count - 1);
  }

  return (
    <>
      <h1>{count}</h1>
      <button onClick={handleSoma}>+</button>
      <button onClick={handleMenos}>-</button>
    </>
  )
}

export default App
