
function tinhToan() {
let chieucao = document.getElementById("cm").value;
let cannang = document.getElementById("kg").value;
let bmi = cannang / (chieucao * chieucao);
let ketqua="";
    if (bmi < 0.00185) {
        ketqua ="Underweight";
    } else if (0.00185 <= bmi && bmi < 0.0025) {
        ketqua ="Normal";
    } else if (0.0025 <= bmi && bmi < 0.003) {
        ketqua ="Overweight";
    } else ketqua ="Obese";

    // document.writeln(bmi);
    document.getElementById("kq").innerHTML = ketqua;
}