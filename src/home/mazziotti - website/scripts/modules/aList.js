// creo un array di oggetti dove vado a scrivere le proprietà che mi serviranno per gli elementi li
const links = [
  {
    href: "../mazziotti - website/index2.html",
    target: "_self",
    title: "Aperol",
    key: 0,
  },
  {
    href: "../mazziotti - website/pages/page2.html",
    target: "_self",
    title: "Tigra",
    key: 1,
  },
  {
    href: "../mazziotti - website/pages/page3.html",
    target: "_self",
    title: "Miagolino",
    key: 2,
  },
  {
    href: "../mazziotti - website/pages/page4.html",
    target: "_self",
    title: "Silver",
    key: 3,
  },
  {
    href: "../mazziotti - website/pages/page5.html",
    target: "_self",
    title: "Barilotto",
    key: 4,
  },
  {
    href: "../mazziotti - website/pages/page6.html",
    target: "_self",
    title: "Esercizio 20 Febbraio 2023",
    key: 5,
  },
  {
    href: "../mazziotti - website/pages/page7.html",
    target: "_self",
    title: "Esercizio 27 Febbraio 2023",
    key: 6,
  },
  {
    href: "../mazziotti - website/pages/page8.html",
    target: "_self",
    title: "Esercizio 06 Marzo 2023",
    key: 7,
  },
  {
    href: "../mazziotti - website/pages/page9.html",
    target: "_self",
    title: "Esercizio per casa - gioco dell'oca",
    key: 8,
  },

  {
    href: "https:www.google.com/it",
    target: "_blank",
    title: "Ricerca Google",
    key: 9,
  },
];

// creo la funzione "AList", con il suo parametro "parentId" che mi va a definire dove verrà appeso
const AList = (parentId) => {
  // con questo ciclo for...each vado a scorrere l'array di oggetti "links" e metto uno per uno gli oggetti ivi contenuti dentro la variabile temporanea "element"
  links.forEach((element) => {
    // creo l'elemento "li", gli do un id univoco e lo appendo al genitore definito nellargomento parentId
    const li = document.createElement("li");
    li.id = "li" + element.key;
    parentId.appendChild(li);
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
};

// infine esporto la funzione AList
export default AList;
