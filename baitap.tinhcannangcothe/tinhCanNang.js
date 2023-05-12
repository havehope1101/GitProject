let chieucao = document.getElementById("cm").value;
let cannang = document.getElementById("kg").value;
let bmi = cannang / (chieucao * chieucao);
if(bmi < 0.185) {
    document.writeln("Underweight");
} else if(0.185 <= bmi && bmi < 0.25) {
    document.writeln("Normal");
} else if(0.25 <= bmi && bmi < 0.3) {
    document.writeln("Overweight");
} else document.writeln("Obese");