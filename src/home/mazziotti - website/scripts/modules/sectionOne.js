// cre una funzione "SectionOne" che mi andrà a renderizzare alcuni elementi nel DOM. Riceve come parametri l'id del genitore tramite "parentId", e un oggetto "catDatas" contenente i dati da visualizzare
const SectionOne = (catDatas) => {
  // creo una sezione nel DOM, alla quale definisco un id, e che vado ad appendere al genitore che gli passo tramite la funzione
  const section = document.createElement("section");
  section.id = "section1";

  // creo un div che va ad appendersi al mio elemento sezione...
  const sectionDiv = document.createElement("div");
  section.appendChild(sectionDiv);

  // creo un secondo div che vado ad appendere al precedente...
  const sectionDivDiv1 = document.createElement("div");
  sectionDivDiv1.id = "par1";
  sectionDiv.appendChild(sectionDivDiv1);

  // creo un terzo div che vado ad appendere al precedente...
  const sectionDivDiv1Div = document.createElement("div");
  sectionDivDiv1.appendChild(sectionDivDiv1Div);

  // creo un titolo h3 che andrà dentro l'ultimo div creato...
  const sectionDivDiv1DivH3 = document.createElement("h3");
  sectionDivDiv1DivH3.textContent = "Nome: " + catDatas.name;
  sectionDivDiv1Div.appendChild(sectionDivDiv1DivH3);

  // ed un paragrafo p che sarà fratello dell'elemento h3 perchè anche lui andrà dentro l'ultimo div creato...
  const sectionDivDiv1DivP = document.createElement("p");
  sectionDivDiv1Div.appendChild(sectionDivDiv1DivP);

  // qui creo un elemento span all'interno del paragrafo appena creato per aiutarmi nella formattazione del testo tramite css...
  const sectionDivDiv1DivPSpan1 = document.createElement("span");
  sectionDivDiv1DivPSpan1.textContent = catDatas.short;
  sectionDivDiv1DivP.appendChild(sectionDivDiv1DivPSpan1);

  // qui ne creo un secondo allo stesso livello...
  const sectionDivDiv1DivPSpan2 = document.createElement("span");
  sectionDivDiv1DivPSpan2.textContent = " " + catDatas.fixed;
  sectionDivDiv1DivP.appendChild(sectionDivDiv1DivPSpan2);

  // ed alla fine un terzo allo stesso livello...
  const sectionDivDiv1DivPSpan3 = document.createElement("span");
  sectionDivDiv1DivPSpan3.textContent = " " + catDatas.long;
  sectionDivDiv1DivP.appendChild(sectionDivDiv1DivPSpan3);

  // qui salgo di qualche livello e vado a creare un'immagine dentro al secondo div aperto
  const sectionDivDiv1Img = document.createElement("img");
  sectionDivDiv1Img.className = "cardPic";
  sectionDivDiv1Img.src = catDatas.pic;
  sectionDivDiv1Img.alt = catDatas.short;
  sectionDivDiv1.appendChild(sectionDivDiv1Img);

  // qui vado a creare un ulteriore div figlio del primo div creato, e fratello del secondo
  const sectionDivDiv2 = document.createElement("div");
  sectionDivDiv2.id = "par2";
  sectionDiv.appendChild(sectionDivDiv2);

  // creo un titolo h3 che andrà dentro l'ultimo div creato...
  const sectionDivDiv2H3 = document.createElement("h3");
  sectionDivDiv2H3.textContent = "Contatti per l'adozione";
  sectionDivDiv2.appendChild(sectionDivDiv2H3);

  // ed un paragrafo p che sarà fratello dell'elemento h3 perchè anche lui andrà dentro l'ultimo div creato...
  const sectionDivDiv2P = document.createElement("p");
  sectionDivDiv2.appendChild(sectionDivDiv2P);

  // qui creo un elemento span all'interno del paragrafo appena creato per aiutarmi nella formattazione del testo tramite css...
  const sectionDivDiv2PSpan1 = document.createElement("span");
  sectionDivDiv2PSpan1.textContent = catDatas.contactName;
  sectionDivDiv2P.appendChild(sectionDivDiv2PSpan1);

  // ed alla fine un secondo span sempre allo stesso livello...
  const sectionDivDiv2PSpan2 = document.createElement("span");
  sectionDivDiv2PSpan2.textContent = " " + catDatas.contactDetails;
  sectionDivDiv2P.appendChild(sectionDivDiv2PSpan2);

  return section;
};

// per completare esporto la funzione che va a crearmi la prima sezione del Main
export default SectionOne;
