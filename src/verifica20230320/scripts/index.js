const words = [
  "crema",
  "fatto",
  "gatto",
  "matto",
  "ratto",
  "petto",
  "salve",
  "carlo",
];
const wordsLength = 5;
const attempts = 5;
let attemptsCount = 0;
let selectedword;
let splitWord = [];

const main = document.getElementById("main");
const bgUrl1 =
  "https://static.vecteezy.com/system/resources/previews/007/423/325/non_2x/white-gradient-stripes-wallpaper-white-and-grey-line-diagonal-background-empty-dynamic-minimal-line-pattern-blank-light-gray-futuristic-linear-banner-illustration-vector.jpg";
const wordHavePowerImg =
  "https://t4.ftcdn.net/jpg/03/77/06/95/360_F_377069576_FU7vZG7Fv1XLXf4wyibN3Kn8WwirX0Kc.jpg";
const twoHandsJustMeImg =
  "https://images.pexels.com/photos/52986/hands-words-meaning-fingers-52986.jpeg";

const homepage = () => {
  const homepage = document.createDocumentFragment();
  homepage.id = "homepage";
  main.appendChild(homepage);

  const section1 = document.createElement("section");
  section1.style.backgroundImage = "url(" + bgUrl1 + ")";
  section1.id = "homepageSection1";
  homepage.appendChild(section1);

  const section1Div1 = document.createElement("div");
  section1.appendChild(section1Div1);

  const section1Div1Img = document.createElement("img");

  section1Div1Img.src = wordHavePowerImg;
  section1Div1.appendChild(section1Div1Img);

  const section1Div2 = document.createElement("div");
  section1Div2.textContent = "qui c'è l'homepage";
  section1.appendChild(section1Div2);

  const section2 = document.createElement("section");
  section2.style.backgroundImage = "url(" + twoHandsJustMeImg + ")";
  section2.style.imageRendering;
  homepage.appendChild(section2);

  return homepage;
};

const infopage = () => {
  const infopage = document.createElement("section");
  infopage.id = "infopage";
  main.appendChild(infopage);

  const section1 = document.createElement("section");
  section1.style.backgroundImage = "url(" + bgUrl1 + ")";
  section1.id = "infopageSection1";
  section1.style.backgroundImage = "url(" + bgUrl1 + ")";
  infopage.appendChild(section1);

  const section1Div1 = document.createElement("div");
  section1Div1.textContent = "qui ci sono le istruzioni del gioco";
  section1.appendChild(section1Div1);

  const section1Div2 = document.createElement("div");
  section1.appendChild(section1Div2);

  return infopage;
};

const changeWord = () => {
  for (let i = 0; i < wordsLength * attempts; i++) {
    document.getElementById("box" + i).textContent = null;
    document.getElementById("box" + i).className = "boxes";
  }
  attemptsCount = 0;
  splitWord = [];
  let index = parseInt(Math.random() * 8);
  selectedword = words[index];
  splitWord = selectedword.split("");
  document.getElementById("box0").textContent = splitWord[0];
  console.log(selectedword);
};

const checkWord = () => {
  let i = 0;
  let temp = attemptsCount * 5;
  for (let j = 0; j < wordsLength; j++) {
    document.getElementById("box" + (j + temp)).textContent =
      document.getElementById("answer" + j).value;
  }
  document.getElementById("box");
  splitWord.forEach((element) => {
    //parte non funzionante in maniera corretta
    /*if (splitWord.includes(element)){
      document.getElementById("box" + (i + temp)).className = "orange";
    }*/
    if (element == document.getElementById("answer" + i).value) {
      document.getElementById("box" + (i + temp)).className = "green";
    }
    i++;
  });
  attemptsCount++;
};

const gamepage = () => {
  const gamepage = document.createDocumentFragment();
  main.appendChild(gamepage);
  const section1 = document.createElement("section");
  section1.id = "gameSection1";
  gamepage.appendChild(section1);

  const section1LingoButton = document.createElement("button");
  section1LingoButton.textContent = "LINGO";
  section1LingoButton.id = "lingoButton";
  section1LingoButton.addEventListener("click", changeWord);
  section1.appendChild(section1LingoButton);

  const section1Div = document.createElement("div");
  section1Div.id = "lingoDiv";
  section1.appendChild(section1Div);

  for (let i = 0; i < attempts; i++) {
    const newLine = document.createElement("div");
    newLine.className = "lines";
    section1Div.appendChild(newLine);

    for (let j = 0; j < wordsLength; j++) {
      const newBox = document.createElement("div");
      newBox.id = "box" + (i * 5 + j);
      newBox.className = "boxes";
      newLine.appendChild(newBox);
    }
  }
  const answerLine = document.createElement("div");
  answerLine.id = "answerLine";
  section1Div.appendChild(answerLine);
  for (let i = 0; i < 5; i++) {
    const answerBox = document.createElement("input");
    answerBox.type = "text";
    answerBox.maxLength = 1;
    answerBox.id = "answer" + i;
    answerLine.appendChild(answerBox);
  }

  const submitButton = document.createElement("button");
  submitButton.textContent = "verifica";
  submitButton.addEventListener("click", checkWord);
  section1.appendChild(submitButton);

  return gamepage;
};

document.getElementById("infoLi").addEventListener("click", () => {
  main.replaceChildren(infopage());
});
document.getElementById("homeLi").addEventListener("click", () => {
  main.replaceChildren(homepage());
});
document.getElementById("gameLi").addEventListener("click", () => {
  main.replaceChildren(gamepage());
});

document.addEventListener("DOMContentLoaded", () => {
  main.replaceChildren(gamepage());
  changeWord();
});
