function writeDiv() {
    let testo = document.getElementById("i1").value;
    //document.getElementById("d2").textContent = testo;
    document.getElementById("d2").innerHTML = "<b>" + testo + "</b>";
}

function sumNumbers() {
    let n1 = parseFloat(document.getElementById("i1").value);
    let n2 = parseFloat(document.getElementById("i2").value);
    document.getElementById("d2").textContent = (n1 + n2).toFixed(2);
    //document.getElementById("d2").innerHTML = "<b>" + (n1 + n2) + "</b>";
}
function controlFruit() {
    let fruit = document.getElementById("i3").value;
    console.log(fruit)
    let result;
    fruits.includes(fruit) ? result = " è presente" : result = " non è presente";
    document.getElementById("d2").textContent = (fruit + result)
}

let fruits = ["apple", "mango", "orange", "banana"]

document.getElementById("b1").addEventListener("click", sumNumbers)
document.getElementById("b2").addEventListener("click", controlFruit)

