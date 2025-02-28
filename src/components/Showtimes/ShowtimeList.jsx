import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';

const ShowtimeList = () => {
    const [showtimes, setShowtimes] = useState([]);
    const { movieId } = useParams();  // Only use this

    useEffect(() => {
        const fetchShowtimes = async () => {
            try {
                const response = await axios.get(`http://localhost:8080/api/showtimes/movie/${movieId}`);
                setShowtimes(response.data);
            } catch (error) {
                console.error(error);
            }
        };
        fetchShowtimes();
    }, [movieId]);

    return (
        <div className="container">
            <h2>Showtimes</h2>
            <ul className="list-group">
                {showtimes.map(showtime => (
                    <li className="list-group-item" key={showtime.id}>
                        {showtime.time} 
                        <a href={`/seats/${showtime.id}`} className="btn btn-secondary float-end">Select Seats</a>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ShowtimeList;
