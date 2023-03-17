const insertButton = document.getElementById("insertButton");
let idCounter = 0;
let elementsSelectedFromToBeDone = [];
let elementsSelectedFromAlreadyDone = [];
const toBeDone = document.getElementById("toBeDone");
const alreadyDone = document.getElementById("alreadyDone");

function moveRight() {
  // prendere gli id salvati nell'array elementsSelectedFromToBeDone
  // richiamarli
  // cambiare il padre ai vari li che hanno l'id incluso nell'array elementsSelectedFromToBeDone
  elementsSelectedFromToBeDone.forEach((element) => {
    const li = document.getElementById(element);
    li.className = "";
    alreadyDone.appendChild(li);
  });
  elementsSelectedFromToBeDone = [];
}

const moveLeft = () => {
  elementsSelectedFromAlreadyDone.forEach((element) => {
    const li = document.getElementById(element);
    li.className = "";
    toBeDone.appendChild(li);
  });
  elementsSelectedFromAlreadyDone = [];
};

const deleteLi = () => {
  elementsSelectedFromAlreadyDone.forEach((element) => {
    alreadyDone.removeChild(document.getElementById(element));
  });
  elementsSelectedFromAlreadyDone = [];
};

insertButton.addEventListener("click", () => {
  const inputText = document.getElementById("inputNewTask").value;
  const newLi = document.createElement("li");
  newLi.textContent = inputText;
  newLi.id = "newLiId" + idCounter;
  toBeDone.appendChild(newLi); // muro.chiodo(quadro)
  newLi.addEventListener("click", () => {
    if (newLi.className == "checked") {
      newLi.className = "";
      if (newLi.parentElement.id == "toBeDone") {
        let index = elementsSelectedFromToBeDone.indexOf(newLi.id); // questa è la posizione all'interno dell'array di un elemento che ha come valore la variabile indicata
        elementsSelectedFromToBeDone.splice(index, 1); // lo splice restituisce la lista senza gli elementi indicati (richiede da che elemento partire ad eliminare e quanti elementi eliminare)
      } else {
        let index = elementsSelectedFromAlreadyDone.indexOf(newLi.id); // questa è la posizione all'interno dell'array di un elemento che ha come valore la variabile indicata
        elementsSelectedFromAlreadyDone.splice(index, 1); // lo splice restituisce la lista senza gli elementi indicati (richiede da che elemento partire ad eliminare e quanti elementi eliminare)
      }
    } else {
      newLi.className = "checked";
      if (newLi.parentElement.id == "toBeDone") {
        elementsSelectedFromToBeDone.push(newLi.id);
      } else {
        elementsSelectedFromAlreadyDone.push(newLi.id);
      }
    }
    console.log(elementsSelectedFromToBeDone);
    console.log(elementsSelectedFromAlreadyDone);
    //newLi.className=="checked" ? newLi.className="" : newLi.className="checked";
  });
  document.getElementById("inputNewTask").value = null;
  idCounter++;
});

document.getElementById("moveRight").addEventListener("click", moveRight);
document.getElementById("moveLeft").addEventListener("click", moveLeft);
document.getElementById("deleteLi").addEventListener("click", deleteLi);

// eventlistener ("click", fammiunasomma(n1, n2))

// eventlistener ("click", ()=>{ fammiunasomma(n1, n2) })
