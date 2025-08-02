import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = props.total / 5;
  return (
    <div className="scoreBox">
      <h2>Student Name: {props.name}</h2>
      <p>School: {props.school}</p>
      <p>Total Marks: {props.total}</p>
      <p>Goal: {props.goal}</p>
      <p>Average Score: {average}</p>
    </div>
  );
}

export default CalculateScore;
