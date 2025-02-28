import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';

import Register from './components/Auth/Register';
import Login from './components/Auth/Login';
import MovieList from './components/Movies/MovieList';
import AdminPanel from './components/Admin/AdminPanel';
import HomePage from './components/HomPage';
import MovieDetail from './components/Movies/MovieDetail';
import ShowtimeList from './components/Showtimes/ShowtimeList';
// other imports...

function App() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<HomePage />} />
                <Route path="/register" element={<Register />} />
                <Route path="/login" element={<Login />} />
                <Route path="/movies" element={<MovieList />} />
                <Route path="/admin" element={<AdminPanel />} />
                <Route path='/movies/:id' element={<MovieDetail/>}/>
                <Route path="/movies/:movieId/showtimes" element={<ShowtimeList />} />
                {/* Add other routes as needed */}
            </Routes>
        </Router>
    );
}

export default App;