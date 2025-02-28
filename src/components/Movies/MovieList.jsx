// src/components/Movies/MovieList.jsx
import React, { useEffect, useState } from 'react';
import axios from 'axios';

const MovieList = () => {
    const [movies, setMovies] = useState([]);

    useEffect(() => {
        const fetchMovies = async () => {
            try {
                const response = await axios.get('http://localhost:8080/api/grf/movies');
                setMovies(response.data);
            } catch (error) {
                console.error(error);
            }
        };
        fetchMovies();
    }, []);

    return (
        <div className="container">
            <h2>Now Showing</h2>
            <div className="row">
                {movies.map(movie => (
                    <div className="col-md-4" key={movie.id}>
                        <div className="card mb-4">
                            <img src={movie.poster} className="card-img-top" alt={movie.title} />
                            <div className="card-body">
                                <h5 className="card-title">{movie.title}</h5>
                                <p className="card-text">{movie.synopsis}</p>
 <a href={`/movies/${movie.id}`} className="btn btn-primary">View Details</a>
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default MovieList;