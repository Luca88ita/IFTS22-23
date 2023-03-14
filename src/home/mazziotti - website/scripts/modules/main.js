import SectionOne from "./sectionOne.js";
import SectionTwo from "./sectionTwo.js";

const main = document.createElement("main");
let currentShown;
let lastShown;
export const defaultPage = (defaultPage) => {
  if (currentShown == null) {
    currentShown = defaultPage;
    const title1 = document.createElement("h2");
    title1.textContent = "In evidenza:";
    main.appendChild(title1);
    SectionOne(main, currentShown);
    const title2 = document.createElement("h2");
    title2.textContent = "Altri aMici che ti attendono!!!";
    main.appendChild(title2);
    SectionTwo(main);
  }
};
export const showPage = (pageToShow) => {
  lastShown = currentShown;
  currentShown = pageToShow;
  while (main.firstChild) {
    main.removeChild(main.firstChild);
  }
  const title1 = document.createElement("h2");
  title1.textContent = "In evidenza:";
  main.appendChild(title1);
  SectionOne(main, currentShown);
  const title2 = document.createElement("h2");
  title2.textContent = "Altri aMici che ti attendono!!!";
  main.appendChild(title2);
  SectionTwo(main);
};

const Main = (parentId) => {
  parentId.appendChild(main);
};

export default Main;
