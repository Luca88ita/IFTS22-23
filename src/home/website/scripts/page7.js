document.getElementById("base1").addEventListener('change', cambioBase);
document.getElementById("base2").addEventListener('change', cambioBase);

document.getElementById("base3").addEventListener('change', cambioBase);
function cambioBase() {
  document.getElementById("hx").innerHTML = "Valore <span id = 'sp1' > " + this.value + "</span > ";
}

/****************************************/
nDivPics = 8


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

  let sezione = document.getElementById("memory");
  for (let i = 0; i < 8; i++) {
    let elemento = document.createElement("div");
    sezione.appendChild(elemento);
  }


  clip = ["../assets/immagini/auto.png", "../assets/immagini/aereo.png",
    "../assets/immagini/camion.png", ".../assets/immagini/elicottero.png",
    "../assets/immagini/auto.png", "../assets/immagini/aereo.png",
    "../assets/immagini/camion.png", "../assets/immagini/elicottero.png"];
  clip2 = [...clip];
  clip2.sort(() => Math.random() - 0.5);

  var i = 0;



  let elementi = document.getElementById("memory");
  ele = elementi.getElementsByTagName("div");

  for (elementi of ele) {
    elementi.id = 'd' + i;
    elementi.style.backgroundImage = "url('../assets/immagini/cover.png')";
    elementi.addEventListener("click", mostra);
    i++;
  }
}

function mostra(d) {
  pos = this.id;
  let punti = parseInt(document.getElementById("pun").textContent);
  punti++;
  document.getElementById("pun").textContent = punti;
  console.log(pos.length);
  let ind = pos.slice(1, pos.length)
  this.style.backgroundImage = "url(" + clip2[ind] + ")";

  console.log(precedente)
  if (precedente == false) {
    precedente = true;
    console.log("dop" + precedente)
    url = "url(" + clip2[ind] + ")";
    prec = this;

  }
  else {
    precedente = false;
    succ = this;
    console.log(url + "--" + "url(" + clip2[ind] + ")" + precedente);
    if (url == "url(" + clip2[ind] + ")") {

      let intervalID = setTimeout(myCallback, 1000);
      function myCallback() {
        succ.style.display = "none";
        prec.style.display = "none";
      }

    }
    else {
      let intervalID = setTimeout(myCallback, 1000);
      function myCallback() {
        succ.style.backgroundImage = "url('../assets/immagini/cover.png')";
        prec.style.backgroundImage = "url('../assets/immagini/cover.png')";
      }
    }
  }
}


document.addEventListener("DOMContentLoaded", ready);