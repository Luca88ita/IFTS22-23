
function lancio() {
  dado = ["../assets/dado/uno.png", "../assets/dado/due.png", "../assets/dado/tre.png", "../assets/dado/quattro.png", "../assets/dado/cinque.png", "../assets/dado/sei.png"];

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