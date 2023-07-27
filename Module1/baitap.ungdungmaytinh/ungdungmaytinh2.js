
function tinhtoan(x) {
    let a = document.getElementById("box1").value;
    let b = document.getElementById("box2").value;
    let c;
    switch (x) {
        case x = '+'  :
            c = Number(a) + Number(b);
            document.getElementById("ketqua").innerHTML = c;
            break;

        case x = '-'  :
            c = Number(a) - Number(b);
            document.getElementById("ketqua").innerHTML = c;
            break;

        case x =  '*' :
            c = Number(a) * Number(b);
            document.getElementById("ketqua").innerHTML = c;
            break;

        case x = '/'  :
            c = Number(a) / Number(b);
            document.getElementById("ketqua").innerHTML = c;
            break;
    }

}