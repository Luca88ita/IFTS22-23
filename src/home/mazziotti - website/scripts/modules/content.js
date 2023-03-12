import Footer from "./footer.js";
import Main from "./main.js";

const Content = (parentId) => {
  const content = document.createElement("div");
  content.id = "content";
  parentId.appendChild(content);
  Main(content);
  Footer(content);
};

export default Content;
