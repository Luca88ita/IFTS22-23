import { changePageIndex } from "../main2.js";

const fulfillLi = (array, index) => {
  const fragment = document.createDocumentFragment();
  let i = 0;
  array.forEach((element) => {
    if (i != index) {
      const li = document.createElement("li");
      fragment.appendChild(li);
      const button = document.createElement("button");
      button.textContent = element.name;
      button.id = element.id;
      li.appendChild(button);
      button.addEventListener("click", () => {
        const i2 = array.indexOf(element);
        changePageIndex(i2);
      });
    }
    i++;
  });
  return fragment;
};

const changeElements = (contents, index) => {
  document.getElementById("ulList").replaceChildren(fulfillLi(contents, index));
};

const Navbar = (contents, index) => {
  const aside = document.createElement("aside");
  const navbar = document.createElement("nav");
  aside.appendChild(navbar);
  if (document.getElementById("ulList") != null) {
    changeElements(contents, index);
  } else {
    const ul = document.createElement("ul");
    ul.id = "ulList";
    navbar.appendChild(ul);
    ul.appendChild(fulfillLi(contents, 0));
  }
  return aside;
};
export default Navbar;
