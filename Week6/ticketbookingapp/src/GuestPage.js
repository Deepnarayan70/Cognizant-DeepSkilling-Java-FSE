import React from "react";
import LoginButton from "./LoginButton";

function GuestPage(props) {
  return (
    <div>
      <h2>Please sign up.</h2>

      <h3>Flight Details</h3>

      <table
        border="1"
        cellPadding="10"
        style={{ margin: "20px auto", borderCollapse: "collapse" }}
      >
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Time</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Delhi</td>
            <td>Mumbai</td>
            <td>10:00 AM</td>
          </tr>

          <tr>
            <td>AI202</td>
            <td>Delhi</td>
            <td>Bangalore</td>
            <td>2:30 PM</td>
          </tr>
        </tbody>
      </table>

      <LoginButton onClick={props.onLogin} />
    </div>
  );
}

export default GuestPage;