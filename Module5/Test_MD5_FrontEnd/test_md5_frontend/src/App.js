import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import React from "react";
import TourList from "./component/TourList";
import TourDetail from "./component/TourDetail";
import TourCreate from "./component/TourCreate";
import TourEdit from "./component/TourEdit";

function App() {
    return (
        <div className="App">
            <h1>Tour Management</h1>
            <BrowserRouter>
                <Routes>
                    <Route path='/' element={<TourList />}></Route>
                    <Route path='/tour/create' element={<TourCreate />}></Route>
                    <Route path='/tour/detail/:tourid' element={<TourDetail />}></Route>
                    <Route path='/tour/edit/:tourid' element={<TourEdit />}></Route>
                    <Route></Route>
                </Routes>
            </BrowserRouter>
        </div>
    )
}

export default App;
