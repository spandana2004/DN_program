import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ title, description, status }) {
  const headingStyle = {
    color: status === 'ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>{title}</h3>
      <dl>
        <dt>Status:</dt>
        <dd>{status}</dd>
        <dt>Description:</dt>
        <dd>{description}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
