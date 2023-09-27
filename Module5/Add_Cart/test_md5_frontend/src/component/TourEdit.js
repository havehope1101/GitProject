import React, {useEffect, useState} from 'react';
import {Link, useNavigate, useParams} from "react-router-dom";

const TourEdit = () => {
    const { tourid } = useParams();

    //const [empdata, empdatachange] = useState({});

    useEffect(() => {
        fetch("http://localhost:8080/tuors/" + tourid).then((res) => {
            return res.json();
        }).then((resp) => {
            idchange(resp.id);
            titlechange(resp.title);
            pricechange(resp.price);
            descripchange(resp.description);
        }).catch((err) => {
            console.log(err.message);
        })
    }, []);

    const [id, idchange] = useState("");
    const [title, titlechange] = useState("");
    const [price, pricechange] = useState("");
    const [description, descripchange] = useState("");
    const [validate, valchange] = useState(false);

    const navigate = useNavigate();

    const handlesubmit=(e)=>{
        e.preventDefault();
        const tourdata={id,title,price,description};

        fetch("http://localhost:8080/tuors/"+ tourid, {
            method:"PUT",
            headers:{"content-type": "application/json"},
            body:JSON.stringify(tourdata)
        }).then((res) => {
            alert('Update Tour Ok')
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
                                <h2>Tour Edit</h2>
                            </div>
                            <div className="card-body">

                                <div className="row">

                                    <div className="col-lg-12">
                                        <div className="form-group">
                                            <label>ID</label>
                                            <input value={id} disabled="disabled" className="form-control"></input>
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
                                        </div>
                                    </div>

                                    <div className="col-lg-12">
                                        <div className="form-group">
                                            <label>Description</label>
                                            <input value={description} onChange={e=>descripchange(e.target.value)} className="form-control"></input>
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
};

export default TourEdit;
