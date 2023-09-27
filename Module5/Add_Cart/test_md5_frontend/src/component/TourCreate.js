import React, {useState} from 'react';
import {Link, useNavigate } from "react-router-dom"

const TourCreate = () => {
    const [id, idchange] = useState("");
    const [title, titlechange] = useState("");
    const [price, pricechange] = useState("");
    const [description, descripchange] = useState("");
    const [validate, valchange] = useState("");

    const navigate = useNavigate();

    const handlesubmit = (e) => {
        e.preventDefault();
        const tourdata = {id, title, price, description};


        fetch("http://localhost:8080/tuors", {
            method:"POST",
            headers:{"content-type": "application/json"},
            body:JSON.stringify(tourdata)
        }).then((res) => {
            alert('Create Tour Ok')
            navigate('/');
        }).catch((err) => {
            console.log(err.message)
        })
    }
    return (
        <div>

            <div className="row">
                <div className="offset-lg-3 col-lg-6">
                    <form className="container" onSubmit={handlesubmit}>

                        <div className="card" style={{"textAlign":"left"}}>
                            <div className="card-title">
                                <h2>Create Tour</h2>
                            </div>
                            <div className="card-body">

                                <div className="row">

                                    <div className="col-lg-12">
                                        <div className="form-group">
                                            <label>ID</label>
                                            <input disabled={true} value={id} onMouseDown={e=>valchange(true)} onChange={e=>idchange(e.target.value)} className="form-control"></input>
                                        </div>
                                    </div>

                                    <div className="col-lg-12">
                                        <div className="form-group">
                                            <label>Title</label>
                                            <input required value={title} onMouseDown={e=>valchange(true)} onChange={e=>titlechange(e.target.value)} className="form-control"></input>
                                            {title.length==0 && validate && <span className="text-danger">Enter Title</span>}
                                        </div>
                                    </div>

                                    <div className="col-lg-12">
                                        <div className="form-group">
                                            <label>Price</label>
                                            <input required value={price} onMouseDown={e=>valchange(true)} onChange={e=>pricechange(e.target.value)} className="form-control"></input>
                                            {price.length==0 && validate && <span className="text-danger">Enter Price</span>}
                                        </div>
                                    </div>

                                    <div className="col-lg-12">
                                        <div className="form-group">
                                            <label>Description</label>
                                            <input value={description} onChange={e=>descripchange(e.target.value)} className="form-control"></input>
                                            {description.length==0 && validate && <span className="text-danger">Enter Description</span>}
                                        </div>
                                    </div>

                                    <div className="col-lg-12">
                                        <div className="form-group">
                                            <button className="btn btn-success" type="submit">Save</button>
                                            <Link to="/" className="btn btn-danger">Back</Link>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>

                </div>
            </div>
        </div>
    );
}

export default TourCreate;
