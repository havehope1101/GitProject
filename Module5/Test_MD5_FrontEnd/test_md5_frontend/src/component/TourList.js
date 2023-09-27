import React, {useEffect, useState} from 'react';
import {Link, useNavigate} from "react-router-dom";

const TourList = () => {
    const [tourdata, tourdatachange] = useState(null);

    const navigate = useNavigate();

    const LoadDetail = (id) => {
        navigate("/tour/detail/" + id);
    }

    const LoadEdit = (id) => {
        navigate("/tour/edit/" +id);
    }

    const RemoveFunction = (id) => {
        if(window.confirm('R U sure u want to delete?')) {
            fetch("http://localhost:8080/tuors/" + id, {
                method: "DELETE"
            }).then((res) => {
                window.location.reload();
            }).catch((err) => {
                console.log(err.message)
            })
        }
    }

    React.useEffect(() => {
        fetch("http://localhost:8080/tuors").then((res) => {
            return res.json();
        }).then((resp)=>{
            tourdatachange(resp);
        }).catch((err) => {
            console.log(err.message);
        })
    },[])

    return (
        <div className="container">
            <div className="card">
                <div className="card-title">
                    <h2>Tour Listing</h2>
                </div>
                <div className="card-body">
                    <div className="divbtn">
                        <Link to="tour/create" className="btn btn-success">Add Tour</Link>
                    </div>
                    <table className="table table-bordered">
                        <thead className="bg-dark text-white">
                        <tr>
                            <td>ID</td>
                            <td>Name</td>
                            <td>Price</td>
                            <td>Action</td>
                        </tr>
                        </thead>
                        <tbody>

                        {   tourdata &&
                            tourdata.map(item=>(
                                <tr key={item.id}>
                                    <td>{item.id}</td>
                                    <td>{item.title}</td>
                                    <td>{item.price}</td>
                                    <td><a onClick={() => { LoadEdit(item.id) }} className="btn btn-success">Edit</a>
                                        <a onClick={() => { RemoveFunction(item.id) }} className="btn btn-danger">Remove</a>
                                        <a onClick={() => { LoadDetail(item.id) }} className="btn btn-primary">Details</a>
                                    </td>
                                </tr>
                            ))
                        }
                        </tbody>

                    </table>
                </div>
            </div>
        </div>
    );

};

export default TourList;
