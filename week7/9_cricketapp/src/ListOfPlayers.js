import React from 'react';

const players = [
  { name: 'Virat', score: 85 },
  { name: 'Rohit', score: 45 },
  { name: 'Rahul', score: 70 },
  { name: 'Dhoni', score: 65 },
  { name: 'Jadeja', score: 90 },
  { name: 'Ashwin', score: 60 },
  { name: 'Shami', score: 75 },
  { name: 'Bumrah', score: 95 },
  { name: 'Gill', score: 50 },
  { name: 'Surya', score: 88 },
  { name: 'Ishan', score: 30 }
];

const ListOfPlayers = () => {
  const filteredPlayers = players.filter(player => player.score >= 70);
  return (
    <div>
      <h2>Players with score >= 70</h2>
      {filteredPlayers.map((player, index) => (
        <div key={index}>
          <p>{player.name} - {player.score}</p>
        </div>
      ))}
    </div>
  );
};

export default ListOfPlayers;
