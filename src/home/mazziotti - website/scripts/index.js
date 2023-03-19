// in questo script vado ad importare la classe Header per poterla utilizzare
import Aside from "./modules/aside.js";
import Content from "./modules/content.js";
import Header from "./modules/header.js";

// vado a definire l'elemento root dove andrò ad appendere gli elementi base del mio DOM
const root = document.getElementById("root");
// richiamo la funzione Header con i suoi parametri (dove appenderlo, l'immagine di sfondo, di logo ed il titolo)
root.appendChild(
  Header(
    "../mazziotti - website/assets/banner.jpeg",
    "../mazziotti - website/assets/logo.jpg",
    "Associazione ci piacciono i gatti"
  )
);
// appendo a root la funzione Aside con i suoi parametri (l'immagine di sfondo)
root.appendChild(Aside("../mazziotti - website/assets/banner.jpeg"));

// appendo a root la funzione Content
root.appendChild(Content());
