// vado ad importare le 2 funzioni con gli elementi del dom da visualizzare
import Footer from "./footer.js";
import Main from "./main.js";

const Content = () => {
  // creo un div con un id e lo appendo al genitore ricevuto come argomento dalla funzione "Content"
  const content = document.createElement("div");
  content.id = "content";

  // richiamo le 2 funzioni "Main" e "Footer" per caricarli nel DOM
  content.appendChild(Main());
  content.appendChild(Footer());
  return content;
};

// esporto il tutto
export default Content;
