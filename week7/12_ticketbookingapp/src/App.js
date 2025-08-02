import React, { useState } from 'react';

function GuestPage() {
  return <h2>Welcome Guest. Browse Flights Only.</h2>;
}

function UserPage() {
  return <h2>Welcome User. You can Book Flights.</h2>;
}

function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  return (
    <div>
      <h1>Ticket Booking App</h1>
      {loggedIn ? <UserPage /> : <GuestPage />}
      <button onClick={() => setLoggedIn(!loggedIn)}>
        {loggedIn ? 'Logout' : 'Login'}
      </button>
    </div>
  );
}

export default App;
