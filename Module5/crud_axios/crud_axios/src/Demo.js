import React, {useState} from 'react';

const Dmeo = () => {
    const [array, setArray] = useState(["1","3"])

    const changeCbx = (event) => {
        let cbx = event.target.value;
        if (array.includes(cbx)) {
            let arr = array.filter((a) => a !== cbx);
            setArray(arr);
        } else {
            setArray([...array, cbx]);
        }

    }

    return (
        <div>
            <h1>Sở thích</h1>
            <input type="checkbox" value="1" checked={array.includes("1")} onChange={changeCbx}/> Xem xiếc <br/>
            <input type="checkbox" value="2" checked={array.includes("2")} onChange={changeCbx}/> Xem thế giới động vật <br/>
            <input type="checkbox" value="3" checked={array.includes("3")} onChange={changeCbx}/> Xem siêu nhân <br/>
            <button onClick={() => alert(array)}>Submit</button>

        </div>
    );
};

export default Dmeo;
