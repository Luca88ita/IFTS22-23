let parolaArray = []
let parolaCambiata = []

function sposta () {
  parolaCambiata=[];
  let sez=document.getElementById("sec3");
  sez.appendChild(this);
  let figli = sez.childNodes;
  for (valori of figli){
    parolaCambiata.push(valori.textContent);
    let counter = 0;
    for (let i = 0; i < parolaCambiata.length; i++) {
      if (parolaArray[i] != parolaCambiata[i]) {
        counter++;
      }
    }
    if (counter != 0) {
      valori.style.backgroundColor = "blue";
    }else{
      valori.style.backgroundColor = "#ffa500";
    }
  }
}

function scrivi1 () {
  let toBeCleared = document.getElementById("sec3");
  parolaArray = [];
  toBeCleared.textContent = "";
  let parola=document.getElementById("inp1").value;
  
  let sez=document.getElementById("sec3");
  for(i=0; i<parola.length; i++) {
    parolaArray.push(parola.charAt(i));
    let elemento=document.createElement("button");
    elemento.setAttribute("id", "lettera" + i);
    elemento.textContent=parola.charAt(i);
    elemento.addEventListener("click", sposta);
    sez.appendChild(elemento);
  }

  //controlla(sez.childNodes);//carico in memoria tutti i figli della sezione.


  console.log(parolaCambiata);
  console.log(parolaArray);
}
document.getElementById("sendBut").addEventListener("click",scrivi1)
