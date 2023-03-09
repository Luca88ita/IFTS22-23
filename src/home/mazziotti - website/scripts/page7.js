document.getElementById("base1").addEventListener("change", cambioBase);
document.getElementById("base2").addEventListener("change", cambioBase);

document.getElementById("base3").addEventListener("change", cambioBase);
function cambioBase() {
  document.getElementById("hx").innerHTML =
    "Valore <span id = 'sp1' > " + this.value + "</span > ";
}

/****************************************/
nDivPics = 8;

/*const createImageDivs = (sectionid, n, divid, eLNeed) => {
  for (let i = 0; i < n; i++) {

    const divs = document.createElement("div");
    divs.setAttribute("id", divid + i);
    const textButton = document.createTextNode("div" + i);
    divs.appendChild(textButton);
    document.getElementById(sectionid).appendChild(divs);
    eLNeed === true
      ? document.getElementById(divid + i).addEventListener("click", () => {
        zeroToOne(divid, i);
      })console.log("Ciao")
      : (button.style.cursor = "default");
  }
};

createImageDivs("memory", nDivPics, "pic", true);*/

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
    "./cards/auto.png",
    "./cards/aereo.png",
    "./cards/camion.png",
    "./cards/elicottero.png",
    "./cards/auto.png",
    "./cards/aereo.png",
    "./cards/camion.png",
    "./cards/elicottero.png",
  ];
  clip2 = [...clip]; // serve per duplicare il contenuto di clip all'interno i clip2
  clip2.sort(() => Math.random() -0.5); 

  let i = 0;

  cardsArray = sezione.getElementsByTagName("div");  // va a richiamare tutti i div che si trovano (o troveranno) all'interno della sezione "memory"

  for (elements of cardsArray) {  // elements rappresenta tutti gli elementi che vado ad iterare all'interno dell'array // in questo caso tutte le carte all'interno del mazzo
    elements.id = "card" + i;
    elements.style.backgroundImage = "url('./cards/cover.png')";
    elements.addEventListener("click", mostra);
    i++;
  }
}

function mostra() {
  cardId = this.id;
  let punti = parseInt(document.getElementById("punteggio").textContent);
  punti++;
  document.getElementById("punteggio").textContent = punti;

  let cardIndex = cardId.slice(4, cardId.length);
  this.style.backgroundImage = "url(" + clip2[cardIndex] + ")";

  if (precedente == false) {
    precedente = true;
    console.log("dop" + precedente);
    url = "url(" + clip2[cardIndex] + ")";
    prec = this;
  } else {
    precedente = false;
    succ = this;
    console.log(url + "--" + "url(" + clip2[cardIndex] + ")" + precedente);
    if (url == "url(" + clip2[cardIndex] + ")") {
      let intervalID = setTimeout(myCallback, 1000);
      function myCallback() {
        succ.style.display = "none";
        prec.style.display = "none";
      }
    } else {
      let intervalID = setTimeout(myCallback, 1000);
      function myCallback() {
        succ.style.backgroundImage = "url('./cards/cover.png')";
        prec.style.backgroundImage = "url('./cards/cover.png')";
      }
    }
  }
}

document.addEventListener("DOMContentLoaded", ready);
