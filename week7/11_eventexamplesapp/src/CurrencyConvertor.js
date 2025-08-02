import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [converted, setConverted] = useState(null);

  const handleSubmit = () => {
    const euro = parseFloat(amount) / 88;
    setConverted(euro.toFixed(2));
  };

  return (
    <div>
      <h2>Currency Convertor</h2>
      <input type="text" value={amount} onChange={e => setAmount(e.target.value)} placeholder="Amount in INR" />
      <button onClick={handleSubmit}>Convert</button>
      {converted && <p>Equivalent in Euro: €{converted}</p>}
    </div>
  );
}

export default CurrencyConvertor;
