import Navbar from "./modules/aside.js";
import contents from "./modules/contents.js";
import Main from "./modules/main.js";

const c = contents();
let pageIndex = 0;
export const changePageIndex = (newIndex) => {
  pageIndex = newIndex;
  root.appendChild(Navbar(c, pageIndex));
  root.appendChild(Main(c, pageIndex));
};

const root = document.getElementById("root");
changePageIndex(pageIndex);
