import { changePageIndex } from "../main2.js";

const doNothing = (itself) => {
  console.log(itself.id);
  changePageIndex(itself.id - 1);
};

const fulfillLi = (array) => {
  const fragment = document.createDocumentFragment();
  array.forEach((element) => {
    const li = document.createElement("li");
    fragment.appendChild(li);
    const button = document.createElement("button");
    button.textContent = element.name;
    button.id = element.id;
    li.appendChild(button);
    button.addEventListener("click", () => {
      doNothing(button);
    });
  });
  return fragment;
};

const Navbar = (contents) => {
  const aside = document.createElement("aside");
  const navbar = document.createElement("nav");
  aside.appendChild(navbar);
  const ul = document.createElement("ul");
  navbar.appendChild(ul);
  ul.appendChild(fulfillLi(contents));
  return aside;
};
export default Navbar;
