import React, {useEffect, useState} from 'react';
import {Link, useParams} from "react-router-dom";

const TourDetail = () => {
        const {tourid} = useParams();

        const [tourdata, tourdatachange] = useState({});

        useEffect(() => {
            fetch("http://localhost:8080/tuors/" + tourid).then((res) => {
                return res.json();
            }).then((resp) => {
                tourdatachange(resp);
            }).catch((err) => {
                console.log(err.message);
            })
        }, []);

    return (
        <div>
            <div className="container">

                <div className="card row" style={{ "textAlign": "left" }}>
                    <div className="card-title">
                        <h2>Tour Detail</h2>
                    </div>
                    <div className="card-body"></div>

                    {tourdata &&
                    <div>
                        <h2>Tour name: <b>{tourdata.name}</b>  {tourdata.id}</h2><br/>
                        <h5>Price: {tourdata.price}</h5><br/>
                        <h5>Description: {tourdata.description}</h5><br/>
                        <Link className="btn btn-danger" to="/">Back to Listing</Link>
                    </div>
                    }
                </div>
            </div>
        </div>
    );
};

export default TourDetail;
