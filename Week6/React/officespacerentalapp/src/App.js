import office from "./openoffice.jpg";
import "./App.css";

function App() {

    const offices = [

        {
            Name: "DBS",
            Rent: 50000,
            Address: "Chennai",
            Image: office
        },

        {
            Name: "Regus",
            Rent: 75000,
            Address: "Bangalore",
            Image: office
        },

        {
            Name: "WeWork",
            Rent: 55000,
            Address: "Hyderabad",
            Image: office
        }

    ];

    return (

        <div>

            <h1>Office Space , at Affordable Range</h1>

            {

                offices.map((item, index) => (

                    <div key={index}>

                        <img
                            src={item.Image}
                            alt="Office"
                            width="25%"
                            height="25%"
                        />

                        <h2>Name: {item.Name}</h2>

                        <h3
                            style={{
                                color: item.Rent <= 60000 ? "red" : "green"
                            }}
                        >
                            Rent: Rs. {item.Rent}
                        </h3>

                        <h3>Address: {item.Address}</h3>

                        <br />

                    </div>

                ))

            }

        </div>

    );

}

export default App;