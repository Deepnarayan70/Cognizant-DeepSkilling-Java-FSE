import React from "react";
import LogoutButton from "./LogoutButton";

function UserPage(props) {
  return (
    <div>
      <h2>Welcome back</h2>

      <h3>Book Your Ticket</h3>

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
            <th>Action</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Delhi</td>
            <td>Mumbai</td>
            <td>
              <button>Book</button>
            </td>
          </tr>

          <tr>
            <td>AI202</td>
            <td>Delhi</td>
            <td>Bangalore</td>
            <td>
              <button>Book</button>
            </td>
          </tr>
        </tbody>
      </table>

      <LogoutButton onClick={props.onLogout} />
    </div>
  );
}

export default UserPage;