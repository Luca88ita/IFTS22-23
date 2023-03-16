// vado ad inizializzare le immagini del dado
const dado = [
  "../assets/dado/uno.png",
  "../assets/dado/due.png",
  "../assets/dado/tre.png",
  "../assets/dado/quattro.png",
  "../assets/dado/cinque.png",
  "../assets/dado/sei.png",
];

// inizializzo il numero di caselle orizzontali (e anche verticali) del mio tabellone di gioco
const boardDimension = 11;
// il valore dell'ultimo id possibile è pari al quadrato della dimensione del tabellone,
// meno il quadrato della (dimensione del tabellone-2) sottratto di uno (per il fatto che i miei id partono da 0)
// P.S. questo se non capite perché, provate a disegnarlo, che è più comprensibile
// altrimenti lo spiego quando venerdì facciamo la diretta su discord ;)
const lastPossibleId =
  Math.pow(boardDimension, 2) - Math.pow(boardDimension - 2, 2) - 1;
// inizializzo la variabile che mi va a segnare la posizione del mio giocatore 1
// ... Ricordo che equivale all'id per come ho impostato il programma
let playerOnePosition;
// inizializzo il controllo del click del lancio del dado per prevenire click successivi finchè non ha smesso di rotolare
let clickControl = true;
// qui creo la variabile chemi conterà il numero di tiri
let diceRolls;
// qui creo la variabile chemi conterà il numero di giri
let lapsMade;
// qui creo il moltiplicatore di penalità per i numeri fortunati/sfortunati
let penalties;
//qui dichiaro quali sono i numeri fortunati e sfortunati
const unluckyNumber = 5;
const luckyNumber = 7;

// questa funzione mi va ad inizializzare tutte le variabili ed a creare/pulire il tabellone di gioco
const resetBoard = () => {
  diceRolls = 0;
  lapsMade = 0;
  playerOnePosition = 0;
  penalties = 0;
  const board = document.getElementById("board");
  // pulisco il tabellone da tutti i suoi figli in caso non fosse la prima giocata
  while (board.firstChild) {
    board.removeChild(board.firstChild);
  }
  // qui ri-assegno il valore dell'ultimo id possibile al contatore inverso che mi servirà dopo come modificabile
  idReverseCounter = lastPossibleId;
  // richiamo la funzione per creare il tabellone di gioco
  createBoard();
  // e qui inizializzo il testo di alcuni elementi del DOM ed il colore della prima casella
  document.getElementById("unluckyNr").textContent = unluckyNumber;
  document.getElementById("luckyNr1").textContent = luckyNumber;
  document.getElementById("luckyNr2").textContent = luckyNumber;
  document.getElementById(playerOnePosition).style.backgroundColor = "blue";
  document.getElementById("rolls").textContent = diceRolls;
  document.getElementById("laps").textContent = lapsMade;
};

// questa è una funzione che mi serve a muovere il mio giocatore 1 sul tabellone
const player1Position = (diceResult) => {
  // imposto una variabile per contare quanto tempo è passato nel mio intervallo
  let control = 0;
  // questo intervallo serve solo a farmi vavere l'illusione di un movimento fluido della pedina
  // sul tabellone casella per casella
  let intervalID = setInterval(moveThePlayer, 200);
  function moveThePlayer() {
    if (control != diceResult) {
      // queste prime 2 righe mi servono per ricolorare di bianco la casella dove il giocarore giaceva prima del lancio del dado
      const previousPlayerPosition = document.getElementById(playerOnePosition);
      previousPlayerPosition.style.backgroundColor = "white";
      // qui verifico se il risultato del dado è negativo o meno, e in caso sposto di una posizione avanti o indietro il player
      diceResult >= 0 ? playerOnePosition++ : playerOnePosition--;
      // con questi 2 if qui, evito che andando avanti o indietro dal 40 all'1 si impalli il programma
      if (playerOnePosition > lastPossibleId) {
        playerOnePosition -= lastPossibleId + 1;
        lapsMade++;
        document.getElementById("laps").textContent = lapsMade;
      }
      if (playerOnePosition < 0) {
        playerOnePosition += lastPossibleId + 1;
        lapsMade--;
        document.getElementById("laps").textContent = lapsMade;
      }
      // ... in queste 2 righe vado a colorare di blu la posizione attuale del giocatore 1
      const playerPosition = document.getElementById(playerOnePosition);
      playerPosition.style.backgroundColor = "blue";
    } else {
      // qui chiamo la funzione per controllare la posizione del mio player se non ricade in un numero fortunato/sfortunato
      checkposition();
      // e qui azzero l'intervallo di tempo (che ho settato sui 200 ms)
      clearInterval(intervalID);
    }
    // qui aumento la variabile controllo in positivo o negativo in base al valore del dado tirato moltiplicata per la penalità
    diceResult >= 0 ? control++ : control--;
  }
};

// funzione per assegnare le penalità in base alla posizione e verificare la condizione di vittoria
const checkposition = () => {
  if ((playerOnePosition + 1) % unluckyNumber == 0) {
    penalties = -2;
  }
  if ((playerOnePosition + 1) % luckyNumber == 0) {
    penalties = 2;
  }
  if (lapsMade == 3) {
    document.getElementById("win").textContent = "Hai vinto!!!";
    resetBoard();
  }
};

// questa funzione serve per creare il campo di gioco
// facendola breve, questa funzione renderizza n caselle (definite nella costante boardDimension)
// da sinistra verso destra. Per la prima la renderizza in maniera normale,
// dalla seconda alla penultima renderizza solo le 2 caselle che tramite il css
// vado a mettere alle estremità del tabellone di gioco, e l'ultima la renderizza
// come la prima. In più vado ad assegnare degli id univoci e del testo ad ogni casella
const createBoard = () => {
  const boardDiv = document.getElementById("board");
  let idCounter = 0;
  // queste 2 righe adattano la dimensione del tabellone di gioco al numero di caselle
  document.getElementById("section1").style.width = 58 * boardDimension + "px";
  document.getElementById("section1").style.height = 58 * boardDimension + "px";

  for (let i = 0; i < boardDimension; i++) {
    const riga = document.createElement("div");
    riga.className = "riga";
    boardDiv.appendChild(riga);
    if (i == 0) {
      for (let j = 0; j < boardDimension; j++) {
        const casella = document.createElement("div");
        // qui utilizzo un normalissimo contatore per andare da 0 a boardDimension-1
        casella.id = idCounter;
        casella.textContent = idCounter + 1;
        casella.className = "caselle";
        // coloro col bordo rosso le caselle sfortunate, gialle quelle fortunate
        if (parseInt(casella.textContent) % unluckyNumber == 0) {
          casella.style.borderColor = "red";
        }
        if (parseInt(casella.textContent) % luckyNumber == 0) {
          casella.style.borderColor = "yellow";
        }
        riga.appendChild(casella);
        idCounter++;
      }
    } else {
      if (i == boardDimension - 1) {
        for (let j = 0; j < boardDimension; j++) {
          const casella = document.createElement("div");
          // qui anzichè il contatore normale vado a prendere il contatore inverso per contare da 31 in giù
          casella.id = idReverseCounter;
          casella.textContent = idReverseCounter + 1;
          casella.className = "caselle";
          if (parseInt(casella.textContent) % unluckyNumber == 0) {
            casella.style.borderColor = "red";
          }
          if (parseInt(casella.textContent) % luckyNumber == 0) {
            casella.style.borderColor = "yellow";
          }
          riga.appendChild(casella);
          idReverseCounter--;
        }
      } else {
        for (let j = 0; j < 2; j++) {
          const casella = document.createElement("div");
          casella.className = "caselle";
          // qui devo fare così in modo da poter mettere 40...12, 39...13, 38...14, ecc...
          if (j == 0) {
            casella.id = idReverseCounter;
            casella.textContent = idReverseCounter + 1;
            idReverseCounter--;
          } else {
            casella.id = idCounter;
            casella.textContent = idCounter + 1;
            idCounter++;
          }
          if (parseInt(casella.textContent) % unluckyNumber == 0) {
            casella.style.borderColor = "red";
          }
          if (parseInt(casella.textContent) % luckyNumber == 0) {
            casella.style.borderColor = "yellow";
          }
          riga.appendChild(casella);
        }
      }
    }
  }
};

// questa è la stessa funzione che ci ha dato Mazziotti, con in più il controllo
// se ho già ricevuto o meno il risultato del lancio del dado, per poterlo ripetere.
// in più adesso ho anche aggiunto il controllo delle penalità
function lancio() {
  if (clickControl == true) {
    document.getElementById("win").textContent = "";
    diceRolls++;
    document.getElementById("rolls").textContent = diceRolls;
    clickControl = false;
    let ctrl = 0;
    let faccia = 0;
    let intervalID = setInterval(myCallback, 10);
    function myCallback() {
      if (ctrl <= 20) {
        faccia = parseInt(Math.random() * 6);
        document.getElementById("diceButton").style.backgroundImage =
          "url(" + dado[faccia] + ")";
      } else {
        clearInterval(intervalID);
        if (penalties != 0) {
          console.log(
            "è uscito " +
              (faccia + 1) +
              ", quindi in base al premio o alla penalità ti sposti di " +
              penalties * (faccia + 1)
          );
          player1Position(penalties * (faccia + 1));
          console.log(penalties * (faccia + 1));
          penalties = 0;
        } else {
          console.log("è uscito il " + (faccia + 1));
          player1Position(faccia + 1);
        }
        clickControl = true;
      }
      ctrl++;
    }
  }
}

// qui inizializzo le funzioni e gli elementi che devono partire quando apro la pagina
const diceButton = document.getElementById("diceButton");
diceButton.style.backgroundImage = "url(" + dado[0] + ")";
diceButton.addEventListener("click", lancio);
resetBoard();
