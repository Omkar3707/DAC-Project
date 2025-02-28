// src/components/Admin/AdminPanel.jsx
import React from 'react';

const AdminPanel = () => {
    return (
        <div class ="container">
            <h2>Admin Panel</h2>
            <div className="list-group">
                <a href="/admin/movies" className="list-group-item list-group-item-action">Manage Movies</a>
                <a href="/admin/showtimes" className="list-group-item list-group-item-action">Manage Showtimes</a>
                <a href="/admin/bookings" className="list-group-item list-group-item-action">View Bookings</a>
                <a href="/admin/analytics" className="list-group-item list-group-item-action">Analytics</a>
            </div>
        </div>
    );
};

export default AdminPanel;