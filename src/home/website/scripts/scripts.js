
function ready() {
    for (let index = 0; index < 10; index++) {
        console.log(index)
    }
    let a=10;
    let b=20;
    [a,b]=[b,a]; //inverte senza l'esplicitazione di variabili tampone
    console.log(a,b)
    let parola = "ciao"
    let arr = [];
    for (let index = 0; index < parola.length; index++) {
        arr.push(parola.charAt(index));
        console.log(parola.charAt(index), index)
    }
    arr[2] = "b"
    console.log(arr)

    for (value of arr) {
        console.log("-- "+value)
    }
    arr.forEach((value, index) => {
        console.log(index +" "+value)
    });

    let fruits = ["apple", "mango","orange","banana"]
    const indexFound = fruits.indexOf("banana")
    console.log(indexFound);
    const indexNotFound = fruits.indexOf("pineapple")
    console.log(indexNotFound)
    const fruitsIncludes = fruits.includes("banana")
    console.log(fruitsIncludes);

    let lettere= []
    lettere = parola.split("a");
    console.log(lettere)
    let parola2 = lettere.join("b")
    console.log(parola2)
}

function saluto() {
    console.log("ciao bello, sono una funzione normale")
}

const saluto2 = () => {
    console.log("ciao bello, sono una funzione anonima")
}



document.addEventListener("DOMContentLoaded", ready);
saluto();
saluto2();

console.log("questo verrà stampato prima dell'event listener")
