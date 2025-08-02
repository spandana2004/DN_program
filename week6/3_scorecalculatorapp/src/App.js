import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore name="John Doe" school="BNMIT" total={450} goal="95%" />
    </div>
  );
}

export default App;
