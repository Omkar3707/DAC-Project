// src/components/Movies/MovieDetail.jsx
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';

const MovieDetail = () => {
    const { id } = useParams(); // Get the movie ID from the URL
    const [movie, setMovie] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchMovieDetails = async () => {
            try {
                const response = await axios.get(`http://localhost:8080/api/grf/movies/${id}`);
                setMovie(response.data);
            } catch (err) {
                setError('Failed to fetch movie details.');
                console.error(err);
            } finally {
                setLoading(false);
            }
        };

        fetchMovieDetails();
    }, [id]);

    if (loading) {
        return <div className="container">Loading...</div>;
    }

    if (error) {
        return <div className="container text-danger">{error}</div>;
    }

    return (
        <div className="container">
            <h2>{movie.title}</h2>
            <img src={movie.poster} alt={movie.title} className="img-fluid mb-3" />
            <p><strong>Genre:</strong> {movie.genre}</p>
            <p><strong>Duration:</strong> {movie.duration} minutes</p>
            <p><strong>Synopsis:</strong> {movie.synopsis}</p>
            <p><strong>Cast:</strong> {movie.cast ? movie.cast.split(',').join(', ') : 'N/A'}</p>

            <p><strong>Rating:</strong> {movie.rating} / 10</p>
            <a href={`/showtimes/${id}`} className="btn btn-primary">View Showtimes</a>
        </div>
    );
};

export default MovieDetail;