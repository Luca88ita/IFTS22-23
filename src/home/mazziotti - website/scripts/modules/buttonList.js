// importo due funzioni che sono all'interno di "main.js" che mi servirà utilizzare dopo
import { defaultPage, showPage } from "./main.js";

// creo un array di oggetti che conterrà i dati che dovranno essere visualizzati nel "Main"
const catsDetails = [
  {
    id: 1,
    pic: "../mazziotti - website/assets/gatto1.jpeg",
    name: "Aperol",
    short: "Gatto maschio di 2 anni - colore rosso tigrato",
    fixed: "sterilizzato!",
    long: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea quia, expedita aliquid nihil nam tenetur dolorum sed? Corporis, nesciunt sint. Sequi aperiam nesciunt quod labore, deleniti dolorum modi deserunt ratione?",
    contactName: "Mr. Pinco Pallino",
    contactDetails:
      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Et, quae minus numquam odio rerum quasi aliquam nulla velit reprehenderit repellat delectus iusto veniam consequuntur facilis vitae mollitia inventore dicta est.",
  },
  {
    id: 2,
    pic: "../mazziotti - website/assets/gatto2.jpeg",
    name: "Tigra",
    short: "Gatto femmina di 18 mesi - colore grigio tigrato",
    fixed: "sterilizzata!",
    long: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea quia, expedita aliquid nihil nam tenetur dolorum sed? Corporis, nesciunt sint. Sequi aperiam nesciunt quod labore, deleniti dolorum modi deserunt ratione?",
    contactName: "Mr. Pinco Panco",
    contactDetails:
      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Et, quae minus numquam odio rerum quasi aliquam nulla velit reprehenderit repellat delectus iusto veniam consequuntur facilis vitae mollitia inventore dicta est.",
  },
  {
    id: 3,
    pic: "../mazziotti - website/assets/gatto3.jpeg",
    name: "Miagolino",
    short: "Gatto maschio di 5 mesi - colore grigio tigrato",
    fixed: "non sterilizzato!",
    long: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea quia, expedita aliquid nihil nam tenetur dolorum sed? Corporis, nesciunt sint. Sequi aperiam nesciunt quod labore, deleniti dolorum modi deserunt ratione?",
    contactName: "Mrs. Pinca Panca",
    contactDetails:
      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Et, quae minus numquam odio rerum quasi aliquam nulla velit reprehenderit repellat delectus iusto veniam consequuntur facilis vitae mollitia inventore dicta est.",
  },
  {
    id: 4,
    pic: "../mazziotti - website/assets/gatto4.jpeg",
    name: "Silver",
    short: "Gatto maschio di 11 mesi - colore grigio",
    fixed: "sterilizzato!",
    long: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea quia, expedita aliquid nihil nam tenetur dolorum sed? Corporis, nesciunt sint. Sequi aperiam nesciunt quod labore, deleniti dolorum modi deserunt ratione?",
    contactName: "Mr. Tizio Caio",
    contactDetails:
      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Et, quae minus numquam odio rerum quasi aliquam nulla velit reprehenderit repellat delectus iusto veniam consequuntur facilis vitae mollitia inventore dicta est.",
  },
  {
    id: 5,
    pic: "../mazziotti - website/assets/gatto5.jpeg",
    name: "Barilotto",
    short: "Gatto maschio di 3 anni - colore rosso e bianco",
    fixed: "sterilizzato!",
    long: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea quia, expedita aliquid nihil nam tenetur dolorum sed? Corporis, nesciunt sint. Sequi aperiam nesciunt quod labore, deleniti dolorum modi deserunt ratione?",
    contactName: "Mr. Sempronio Esculapio",
    contactDetails:
      "Lorem ipsum dolor sit amet consectetur adipisicing elit. Et, quae minus numquam odio rerum quasi aliquam nulla velit reprehenderit repellat delectus iusto veniam consequuntur facilis vitae mollitia inventore dicta est.",
  },
];

const ButtonList = (parentId) => {
  // con questo ciclo for...each vado a scorrere l'array di oggetti "catsDetails" e metto uno per uno gli oggetti ivi contenuti dentro la variabile temporanea "element"
  catsDetails.forEach((element) => {
    // vado a richiamare la funzione "defaultPage" (contenuta in "main.js" ed importata qui), al quale passo come argomento il primo oggetto dell'array "catsDetails". Questo serve per caricare i dati di default nel mio "Main"
    defaultPage(catsDetails[0]);
    // creo l'elemento "li", gli do un id univoco e lo appendo al genitore definito nellargomento parentId
    const li = document.createElement("li");
    li.id = "buttonList__li" + element.id;
    parentId.appendChild(li);
    // creo un elemento "button" al quale do un testo preso dal titolo dell'elemento che sto scorrendo, e che appendo all'elemento "li"
    const button = document.createElement("button");
    button.textContent = element.name;
    li.appendChild(button);
    // creo un "EventListener" collegato al click del bottone appena creato. Essendo creato all'interno di un ciclo for, questo creerà tanti event listeners diversi quanti bottoni vado a creare
    button.addEventListener("click", () => {
      // tramite una funzione freccia anonima vado a dire che cliccando il bottone, deve richiamarmi la funzione "showPage" (contenuta in "main.js" ed importata qui) alla quale passo come argomento l'elemento scorso nell'array
      showPage(element);
    });
  });
};

// esporto il tutto
export default ButtonList;
