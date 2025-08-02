import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(0);

  const increase = () => {
    setCounter(counter + 1);
    alert('Hello! Static message.');
  };

  const decrease = () => {
    setCounter(counter - 1);
  };

  const sayWelcome = (msg) => {
    alert("Say " + msg);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  return (
    <div>
      <h1>Counter: {counter}</h1>
      <button onClick={increase}>Increment</button>
      <button onClick={decrease}>Decrement</button>
      <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>
      <button onClick={onPress}>Synthetic Event</button>
      <CurrencyConvertor />
    </div>
  );
}

export default App;
