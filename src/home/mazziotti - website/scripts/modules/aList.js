// creo un array di oggetti dove vado a scrivere le proprietà che mi serviranno per gli elementi li
const links = [
  {
    href: "../mazziotti - website/pages/page6.html",
    target: "_self",
    title: "Esercizio 20 Febbraio 2023",
    key: 1,
  },
  {
    href: "../mazziotti - website/pages/page7.html",
    target: "_self",
    title: "Esercizio 27 Febbraio 2023",
    key: 2,
  },
  {
    href: "../mazziotti - website/pages/page8.html",
    target: "_self",
    title: "Esercizio 06 Marzo 2023",
    key: 3,
  },
  {
    href: "../mazziotti - website/pages/goosegame.html",
    target: "_self",
    title: "Esercizio per casa - gioco dell'oca",
    key: 4,
  },
  {
    href: "../mazziotti - website/pages/goosegame2.html",
    target: "_self",
    title: "Esercizio per casa - gioco dell'oca - 2 giocatori",
    key: 5,
  },
  {
    href: "../mazziotti - website/pages/todolist.html",
    target: "_self",
    title: "Esercizio per casa - to do list",
    key: 6,
  },
  {
    href: "https:www.google.com/it",
    target: "_blank",
    title: "Ricerca Google",
    key: 7,
  },
];

// creo la funzione "AList", con il suo parametro "parentId" che mi va a definire dove verrà appeso
const AList = () => {
  // creo un fragment che mi servirà per esportarne i figli
  const fragment = document.createDocumentFragment();
  // con questo ciclo for...each vado a scorrere l'array di oggetti "links" e metto uno per uno gli oggetti ivi contenuti dentro la variabile temporanea "element"
  links.forEach((element) => {
    // creo l'elemento "li", gli do un id univoco e lo appendo al genitore fragment
    const li = document.createElement("li");
    li.id = "li" + element.key;
    fragment.appendChild(li);
    // creo un elemento "a" al quale do tutti gli attributi di cui ha bisogno ripresi dall'elemento (che ricordiamo, è un oggetto incluso nell'array di oggetti "links") ed infine lo appendo a "li"
    const a = document.createElement("a");
    a.href = element.href;
    a.target = element.target;
    li.appendChild(a);
    // creo un elemento "button" al quale do un testo e che appendo all'elemento "a"
    const button = document.createElement("button");
    button.textContent = element.title;
    a.appendChild(button);
  });
  // esporto il fragment
  return fragment;
};

// infine esporto la funzione AList
export default AList;
