// vado ad importare le 2 funzioni con gli elementi del dom da visualizzare
import Footer from "./footer.js";
import Main from "./main.js";

const Content = (parentId) => {
  // creo un div con un id e lo appendo al genitore ricevuto come argomento dalla funzione "Content"
  const content = document.createElement("div");
  content.id = "content";
  parentId.appendChild(content);
  // richiamo le 2 funzioni "Main" e "Footer" per caricarli nel DOM
  Main(content);
  Footer(content);
};

// esporto il tutto
export default Content;
