document.getElementById("base1").addEventListener("change", cambioBase);
document.getElementById("base2").addEventListener("change", cambioBase);

document.getElementById("base3").addEventListener("change", cambioBase);
function cambioBase() {
  document.getElementById("hx").innerHTML =
    "Valore <span id = 'sp1' > " + this.value + "</span > ";
}

/****************************************/
nDivPics = 8;

var precedente = false;
prec = null;
succ = null;
var url;

function ready() {
  let sezione = document.getElementById("memory"); //  sezione dove vado a costruire il campo di gioco
  for (let i = 0; i < 8; i++) {
    let elemento = document.createElement("div");
    sezione.appendChild(elemento);
  }

  clip = [
    "../assets/cards/auto.png",
    "../assets/cards/aereo.png",
    "../assets/cards/camion.png",
    "../assets/cards/elicottero.png",
    "../assets/cards/auto.png",
    "../assets/cards/aereo.png",
    "../assets/cards/camion.png",
    "../assets/cards/elicottero.png",
  ];
  clip2 = [...clip]; // serve per duplicare il contenuto di clip all'interno i clip2
  clip2.sort(() => Math.random() - 0.5);

  let i = 0;

  cardsArray = sezione.getElementsByTagName("div"); // va a richiamare tutti i div che si trovano (o troveranno) all'interno della sezione "memory"

  for (elements of cardsArray) {
    // elements rappresenta tutti gli elementi che vado ad iterare all'interno dell'array // in questo caso tutte le carte all'interno del mazzo
    elements.id = "card" + i;
    elements.style.backgroundImage = "url('../assets/cards/cover.png')";
    elements.style.backgroundSize = "100%";
    elements.addEventListener("click", mostra);
    i++;
  }
}
let control = true;

function mostra() {
  if (control == true) {
    cardId = this.id;
    let punti = parseInt(document.getElementById("punteggio").textContent);

    let cardIndex = cardId.slice(4, cardId.length);
    this.style.backgroundImage = "url(" + clip2[cardIndex] + ")";
    this.style.backgroundSize = "100%";
    if (precedente == false) {
      precedente = true;
      url = "url(" + clip2[cardIndex] + ")";
      prec = this;
      punti++;
      document.getElementById("punteggio").textContent = punti;
    } else {
      if (prec != this) {
        punti++;
        document.getElementById("punteggio").textContent = punti;
        control = false;
        precedente = false;
        succ = this;
        if (url == "url(" + clip2[cardIndex] + ")" && prec.id != succ.id) {
          let intervalID = setTimeout(myCallback, 500);
          function myCallback() {
            succ.style.display = "none";
            prec.style.display = "none";
            prec = null;
            succ = null;
            control = true;
          }
        } else {
          let intervalID = setTimeout(myCallback, 500);
          function myCallback() {
            succ.style.backgroundImage = "url('../assets/cards/cover.png')";
            succ.style.backgroundSize = "100%";
            prec.style.backgroundImage = "url('../assets/cards/cover.png')";
            prec.style.backgroundSize = "100%";
            prec = null;
            succ = null;
            control = true;
          }
        }
      }
    }
  }
}

document.addEventListener("DOMContentLoaded", ready);
