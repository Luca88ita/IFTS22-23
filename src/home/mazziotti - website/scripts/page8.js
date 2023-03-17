const dado = [
  "../assets/dado/uno.png",
  "../assets/dado/due.png",
  "../assets/dado/tre.png",
  "../assets/dado/quattro.png",
  "../assets/dado/cinque.png",
  "../assets/dado/sei.png",
];
let clickControl = true;

function lancio() {
  if (clickControl == true) {
    clickControl = false;
    let counter = 0;
    let face = 0;
    let intervalID = setInterval(myCallback, 100);
    function myCallback() {
      if (counter <= 20) {
        face = parseInt(Math.random() * 6);
        document.getElementById("d1").style.backgroundImage =
          "url(" + dado[face] + ")";
      } else {
        clearInterval(intervalID);
        console.log("è uscito il " + (face + 1));
        clickControl = true;
      }
      counter++;
    }
  }
}

document.getElementById("b1").addEventListener("click", lancio);
