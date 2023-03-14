import AList from "./aList.js";
import ButtonList from "./buttonList.js";

const Aside = (parentId, sideImg) => {
  const aside = document.createElement("aside");
  aside.id = "aside";
  parentId.appendChild(aside);

  const sidebar = document.createElement("img");
  sidebar.className = "sidebar";
  sidebar.alt = "sidebar";
  sidebar.src = sideImg;
  aside.appendChild(sidebar);

  const nav = document.createElement("nav");
  aside.appendChild(nav);
  const ul = document.createElement("ul");
  ul.id = "navUl";
  nav.appendChild(ul);
  ButtonList(ul);
  AList(ul);
};

export default Aside;
