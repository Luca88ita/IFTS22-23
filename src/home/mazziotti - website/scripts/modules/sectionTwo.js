import { showPage } from "./main.js";

const SectionTwo = (parentId, cardsArray) => {
  const section = document.createElement("section");
  section.id = "section2";
  parentId.appendChild(section);

  cardsArray.forEach((element) => {
    const sectionDiv = document.createElement("div");
    sectionDiv.id = "CardSectionTwo" + element.id;
    sectionDiv.className = "card";
    section.appendChild(sectionDiv);

    const sectionDivH3 = document.createElement("h3");
    sectionDivH3.textContent = element.name;
    sectionDiv.appendChild(sectionDivH3);

    const sectionDivP = document.createElement("p");
    sectionDiv.appendChild(sectionDivP);

    const sectionDivPImg = document.createElement("img");
    sectionDivPImg.src = element.pic;
    sectionDivPImg.alt = element.short;
    sectionDivPImg.className = "cardPic";
    sectionDivP.appendChild(sectionDivPImg);

    sectionDivPImg.addEventListener("click", () => {
      console.log(element.id - 1);
    });

    const sectionDivPSpan1 = document.createElement("span");
    sectionDivPSpan1.textContent = element.short + ": ";
    sectionDivP.appendChild(sectionDivPSpan1);

    const sectionDivPSpan2 = document.createElement("span");
    sectionDivPSpan2.textContent = element.long;
    sectionDivP.appendChild(sectionDivPSpan2);
  });
};

export default SectionTwo;
