// src/components/Seats/SeatSelection.jsx
import React, { useState } from 'react';

const SeatSelection = () => {
    const [selectedSeats, setSelectedSeats] = useState([]);

    const toggleSeat = (seat) => {
        setSelectedSeats(prev => 
            prev.includes(seat) ? prev.filter(s => s !== seat) : [...prev, seat]
        );
    };

    const seats = Array.from({ length: 20 }, (_, i) => `Seat ${i + 1}`);

    return (
        <div className="container">
            <h2>Select Seats</h2>
            <div className="row">
                {seats.map(seat => (
                    <div className="col-1" key={seat}>
                        <button 
                            className={`btn ${selectedSeats.includes(seat) ? 'btn-success' : 'btn-outline-primary'}`} 
                            onClick={() => toggleSeat(seat)}
                        >
                            {seat}
                        </button>
                    </div>
                ))}
            </div>
            <h4>Selected Seats: {selectedSeats.join(', ')}</h4>
            <a href="/payment" className="btn btn-primary">Proceed to Payment</a>
        </div>
    );
};

export default SeatSelection;