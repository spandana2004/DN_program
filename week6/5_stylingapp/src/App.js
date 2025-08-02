import React from 'react';
import CohortDetails from './components/CohortDetails';

function App() {
  return (
    <div>
      <CohortDetails title="React Basics" description="Intro to React" status="ongoing" />
      <CohortDetails title="Advanced JS" description="Deep Dive into JS" status="completed" />
    </div>
  );
}

export default App;
