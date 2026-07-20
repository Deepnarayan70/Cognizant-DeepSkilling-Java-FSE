import React from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function Greeting(props) {
  if (props.isLoggedIn) {
    return <UserPage onLogout={props.onLogout} />;
  }

  return <GuestPage onLogin={props.onLogin} />;
}

export default Greeting;