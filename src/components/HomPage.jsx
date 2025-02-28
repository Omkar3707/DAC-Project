import React from 'react';
import { Link } from 'react-router-dom';

const HomePage = () => {
    return (
        <div className="container bg-light min-vh-100 min-vw-100 d-flex flex-column">

           {/* Navigation Bar */}
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">GRF</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        
       
      </ul>
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="/login">Login</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/Register">Signup</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

            {/* Hero Section */}
            <header className="text-center py-5">
                <h1 className="display-4">Welcome to Go Reel Flicks</h1>
                <p className="lead">Explore movies, book tickets, and enjoy your favorite films!</p>
            </header>

            <div className="container">
                <div className="row text-center mb-4">
                    <div className="col-md-4">
                        <Link to="/movies" className="btn btn-success btn-lg mb-3">View Movies</Link>
                    </div>
                    <div className="col-md-4">
                        <Link to="/admin" className="btn btn-warning btn-lg mb-3">Admin Panel</Link>
                    </div>
                    <div className="col-md-4">
                        <Link to="/showtimes" className="btn btn-info btn-lg mb-3">Showtimes</Link>
                    </div>
                </div>

                
            </div>

            <footer className="text-center py-4 bg-dark text-white">
                <p>&copy; {new Date().getFullYear()} Go Reel Flicks. All rights reserved.</p>
            </footer>
        </div>
    );
};

export default HomePage;