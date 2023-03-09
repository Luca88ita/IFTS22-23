
function lancio() {
  dado = ["./dado/uno.png", "./dado/due.png", "./dado/tre.png", "./dado/quattro.png", "./dado/cinque.png", "./dado/sei.png"];

  let ctrl = 0;
  let faccia = 0;
  let intervalID = setInterval(myCallback, 200);
  function myCallback() {
    if (ctrl <= 20) {
      faccia = parseInt(Math.random() * 6);
      document.getElementById("d1").style.backgroundImage = "url(" + dado[faccia] + ")";
    } else {

      clearInterval(intervalID)
      console.log("è uscito il " + (faccia + 1))
    }
    ctrl++;
  }
}




document
  .getElementById("b1")
  .addEventListener("click", lancio);