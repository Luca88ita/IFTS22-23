// importo 2 funzioni che mi serviranno per creare gli elementi del DOM
import AList from "./aList.js";
import ButtonList from "./buttonList.js";

// creo una funzione "Aside" che prende come parametro l'url dell'immagine di background
const Aside = (sideImg) => {
  // creo un elemento aside al quale do un id e che appendo al genitore fornitotramite la funzione
  const aside = document.createElement("aside");
  aside.id = "aside";

  // creo una immagine che andrò a mettere come sfondo alla barra laterale e le do tutte le proprietà (in realtà si poteva fare anche senza creazione dell'immagine, ma semplicemente mettendo in aside.style.backgroundImage l'url dell'immagine di sfondo)
  const sidebar = document.createElement("img");
  sidebar.className = "sidebar";
  sidebar.alt = "sidebar";
  sidebar.src = sideImg;
  aside.appendChild(sidebar);

  // creo una barra di navigazion e la appendo all'aside
  const nav = document.createElement("nav");
  aside.appendChild(nav);
  //creo una lista non ordinata alla quale do un id e la appendo al nav
  const ul = document.createElement("ul");
  ul.id = "navUl";
  nav.appendChild(ul);
  // richiamo le 2 funzioni e le appendo alla lista non ordinata
  ul.appendChild(ButtonList());
  ul.appendChild(AList());
  return aside;
};

// esporto il tutto
export default Aside;
