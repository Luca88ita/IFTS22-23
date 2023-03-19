const fulfillSection1 = (array, index) => {
  const fragment = document.createDocumentFragment();
  const div = document.createElement("div");
  fragment.appendChild(div);
  const h3 = document.createElement("h3");
  h3.textContent = array[index].name;
  h3.id = "content" + array[index].id;
  div.appendChild(h3);
  return fragment;
};

const fulfillSection2 = (array, index) => {
  const fragment = document.createDocumentFragment();
  const div = document.createElement("div");
  fragment.appendChild(div);
  let i = 0;
  array.forEach((element) => {
    if (i != index) {
      const h3 = document.createElement("h3");
      h3.textContent = element.name;
      h3.id = "content" + element.id;
      div.appendChild(h3);
      h3.addEventListener("click", () => {
        const i2 = array.indexOf(element);
        changeElements(array, i2);
      });
    }
    i++;
  });
  return fragment;
};

const changeElements = (contents, index) => {
  document
    .getElementById("section1")
    .replaceChildren(fulfillSection1(contents, index));
  document
    .getElementById("section2")
    .replaceChildren(fulfillSection2(contents, index));
};

const Main = (contents, index) => {
  const main = document.createElement("main");
  main.id = "main";
  if (
    document.getElementById("section1") != null ||
    document.getElementById("section2") != null
  ) {
    changeElements(contents, index);
  } else {
    const section1 = document.createElement("section");
    section1.id = "section1";
    main.appendChild(section1);
    const section2 = document.createElement("section");
    section2.id = "section2";
    main.appendChild(section2);
    section1.appendChild(fulfillSection1(contents, index));
    section2.appendChild(fulfillSection2(contents, index));
  }

  return main;
};
export default Main;
