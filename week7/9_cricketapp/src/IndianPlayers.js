import React from 'react';

const T20 = ['Virat', 'Rohit'];
const Ranji = ['Pujara', 'Rahane'];

const allPlayers = [...T20, ...Ranji];

const IndianPlayers = () => {
  const [odd, even] = [allPlayers.filter((_, i) => i % 2 !== 0), allPlayers.filter((_, i) => i % 2 === 0)];

  return (
    <div>
      <h2>Odd Team Players</h2>
      {odd.map((p, i) => <p key={i}>{p}</p>)}
      <h2>Even Team Players</h2>
      {even.map((p, i) => <p key={i}>{p}</p>)}
    </div>
  );
};

export default IndianPlayers;
