import React from 'react';

const offices = [
  { name: "Space A", rent: 50000, address: "MG Road" },
  { name: "Space B", rent: 70000, address: "Whitefield" },
  { name: "Space C", rent: 45000, address: "Indiranagar" }
];

function App() {
  return (
    <div>
      <h1>Office Space Rental</h1>
      {offices.map((office, index) => (
        <div key={index}>
          <h2>{office.name}</h2>
          <img src="https://via.placeholder.com/150" alt={office.name} />
          <p style={{ color: office.rent > 60000 ? 'green' : 'red' }}>Rent: ₹{office.rent}</p>
          <p>Address: {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
