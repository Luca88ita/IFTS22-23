// qui vado ad importare le funzioni delle 2 sezioni che dovrò successivamente renderizzare
import SectionOne from "./sectionOne.js";
import SectionTwo from "./sectionTwo.js";

// questa volta devo creare la costante main all'esterno della funzione principale Main, perché altrimenti non mi sarebbe possibile richiamarla all'interno delle funzioni successive
const main = document.createElement("main");
// creo 2 variabili che andranno a memorizzare i dati degli oggetti che vado a caricare nel main
let currentShown;
let lastShown;

// creo una funzione con i dati che dovrò andare a visualizzare, alla quale andrò a dare come parametro l'oggetto con tutti i dati da visualizzare
const innerContent = (content) => {
  // creo un titolo h2 che vado ad appendere al main e gli do un testo
  const title1 = document.createElement("h2");
  title1.textContent = "In evidenza:";
  main.appendChild(title1);
  // richiamo la funzione "SectionOne" alla quale passo il genitore e l'oggetto con il contenuto da visualizzare
  main.appendChild(SectionOne(content[0]));
  // creo un secondo titolo h2 che vado ad appendere al main e gli do un testo
  const title2 = document.createElement("h2");
  title2.textContent = "Altri aMici che ti attendono!!!";
  main.appendChild(title2);
  // richiamo la funzione "SectionTwo" alla quale passo il genitore e l'oggetto con il contenuto da visualizzare
  main.appendChild(SectionTwo(content[1]));
};

// creo una funzione esportabile che riceve come argomento un oggetto con i dati per caricare successivamente una pagina di default. Questa deve essere caricata SOLO alla prima apertura della pagina, cosa che verifico tramite l'if
export function defaultPage(defaultSection1, defaultSection2) {
  if (currentShown == null) {
    currentShown = [defaultSection1, defaultSection2];
    //richiamo la funzione innerContent alla quale passo l'oggetto con i dati da visualizzare
    innerContent(currentShown);
  }
}

// creo una funzione esportabile che riceve come argomento un oggetto con i nuovi dati da caricare nel main
export const showPage = (section1ToShow, section2ToShow) => {
  // memorizzo l'ultima pagina visualizzata (per adesso inutle, ma se volessi implementare uno storico, tornerebbe utile)
  lastShown = currentShown;
  // inizializzo i dati da visualizzare
  currentShown = [section1ToShow, section2ToShow];
  // con questo ciclo elimino i dati precedenti presenti nel main, eliminando tutti i figli di main.
  while (main.firstChild) {
    main.removeChild(main.firstChild);
  }
  // ed infine richiamo la funzione innerContent alla quale passo l'oggetto con i dati da visualizzare
  innerContent(currentShown);
};

const Main = () => {
  // l'unica cosa che questa funzione dovrà fare è quella di appendere il main all'interno della variabile genitore
  return main;
};

export default Main;
