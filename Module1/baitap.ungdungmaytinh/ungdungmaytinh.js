
function plus() {
    let a = document.getElementById("box1").value;
    let b = document.getElementById("box2").value;
    let c = Number(a) + Number(b);
    document.getElementById("ketqua").innerHTML = c;
}

function minus() {
    let a = document.getElementById("box1").value;
    let b = document.getElementById("box2").value;
    let c = Number(a) - Number(b);
    document.getElementById("ketqua").innerHTML = c;
}

function multi() {
    let a = document.getElementById("box1").value;
    let b = document.getElementById("box2").value;
    let c = Number(a) * Number(b);
    document.getElementById("ketqua").innerHTML = c;
}

function divide() {
    let a = document.getElementById("box1").value;
    let b = document.getElementById("box2").value;
    let c = Number(a) / Number(b);
    document.getElementById("ketqua").innerHTML = c;
}



