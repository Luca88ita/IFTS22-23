const SectionOne = (parentId, catDatas) => {
  const section = document.createElement("section");
  section.id = "section1";
  parentId.appendChild(section);

  const sectionDiv = document.createElement("div");
  section.appendChild(sectionDiv);

  const sectionDivDiv1 = document.createElement("div");
  sectionDivDiv1.id = "par1";
  sectionDiv.appendChild(sectionDivDiv1);

  const sectionDivDiv1Div = document.createElement("div");
  sectionDivDiv1.appendChild(sectionDivDiv1Div);

  const sectionDivDiv1DivH3 = document.createElement("h3");
  sectionDivDiv1DivH3.textContent = "Nome: " + catDatas.name;
  sectionDivDiv1Div.appendChild(sectionDivDiv1DivH3);

  const sectionDivDiv1DivP = document.createElement("p");
  sectionDivDiv1Div.appendChild(sectionDivDiv1DivP);

  const sectionDivDiv1DivPSpan1 = document.createElement("span");
  sectionDivDiv1DivPSpan1.textContent = catDatas.short;
  sectionDivDiv1DivP.appendChild(sectionDivDiv1DivPSpan1);

  const sectionDivDiv1DivPSpan2 = document.createElement("span");
  sectionDivDiv1DivPSpan2.textContent = " " + catDatas.fixed;
  sectionDivDiv1DivP.appendChild(sectionDivDiv1DivPSpan2);

  const sectionDivDiv1DivPSpan3 = document.createElement("span");
  sectionDivDiv1DivPSpan3.textContent = " " + catDatas.long;
  sectionDivDiv1DivP.appendChild(sectionDivDiv1DivPSpan3);

  const sectionDivDiv1Img = document.createElement("img");
  sectionDivDiv1Img.className = "cardPic";
  sectionDivDiv1Img.src = catDatas.pic;
  sectionDivDiv1Img.alt = catDatas.short;
  sectionDivDiv1.appendChild(sectionDivDiv1Img);

  const sectionDivDiv2 = document.createElement("div");
  sectionDivDiv2.id = "par2";
  sectionDiv.appendChild(sectionDivDiv2);

  const sectionDivDiv2H3 = document.createElement("h3");
  sectionDivDiv2H3.textContent = "Contatti per l'adozione";
  sectionDivDiv2.appendChild(sectionDivDiv2H3);

  const sectionDivDiv2P = document.createElement("p");
  sectionDivDiv2.appendChild(sectionDivDiv2P);

  const sectionDivDiv2PSpan1 = document.createElement("span");
  sectionDivDiv2PSpan1.textContent = catDatas.contactName;
  sectionDivDiv2P.appendChild(sectionDivDiv2PSpan1);

  const sectionDivDiv2PSpan2 = document.createElement("span");
  sectionDivDiv2PSpan2.textContent = " " + catDatas.contactDetails;
  sectionDivDiv2P.appendChild(sectionDivDiv2PSpan2);
};

export default SectionOne;
