import SectionOne from "./sectionOne.js";
import SectionTwo from "./sectionTwo.js";

const Main = (parentId) => {
  const main = document.createElement("main");
  parentId.appendChild(main);
  const title1 = document.createElement("h2");
  title1.textContent = "In evidenza:";
  main.appendChild(title1);
  SectionOne(main);
  const title2 = document.createElement("h2");
  title2.textContent = "Altri aMici che ti attendono!!!";
  main.appendChild(title2);
  SectionTwo(main);
};

export default Main;
