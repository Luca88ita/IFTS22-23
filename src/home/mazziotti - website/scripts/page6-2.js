let arrWord = [];
let chgdWord = [];

/**
 * In this first version of the moveToTheEnd function we are checking sequentially
 * if the buttons are in the right order. Only the ones which are in the correct
 * order Will become orange, and only if all the previous ones are in order as well
 * Other features:
 * - empties the array chgdWord to delete any previous data
 */
function moveToTheEnd1() {
  chgdWord = [];
  let sect = document.getElementById("sec3");
  sect.appendChild(this);
  let chlds = sect.childNodes;
  let counter = 0;
  for (values of chlds) {
    chgdWord.push(values.textContent);
    for (let i = 0; i < chgdWord.length; i++) {
      if (arrWord[i] != chgdWord[i]) {
        counter++;
      }
    }
    counter != 0
      ? (values.style.backgroundColor = "blue")
      : (values.style.backgroundColor = "#ffa500");
  }
}

/**
 * In this second version of the moveToTheEnd function, all the button will stay
 * blue, until they are going to be all in the right order.
 * Other features:
 * - empties the array chgdWord to delete any previous data
 */
function moveToTheEnd2() {
  chgdWord = [];
  let sect = document.getElementById("sec3");
  sect.appendChild(this);
  let chlds = sect.childNodes;
  let counter = 0;
  for (values of chlds) {
    chgdWord.push(values.textContent);
    for (let i = 0; i < chgdWord.length; i++) {
      if (arrWord[i] != chgdWord[i]) {
        counter++;
      }
    }
  }
  for (values of chlds) {
    counter != 0
      ? (values.style.backgroundColor = "blue")
      : (values.style.backgroundColor = "#ffa500");
  }
}

/**
 * This function creates all the buttons with the letters componing the word
 * written in the input text field.
 * Other features:
 * - empties the array arrWord to delete any previous data
 * - clears the section from any previous button
 */
function createLetterButtons() {
  let toBeCleared = document.getElementById("sec3");
  arrWord = [];
  toBeCleared.textContent = "";
  let fullWord = document.getElementById("inp1").value;

  let sect = document.getElementById("sec3");
  for (i = 0; i < fullWord.length; i++) {
    arrWord.push(fullWord.charAt(i));
    let element = document.createElement("button");
    element.setAttribute("id", "lettera" + i);
    element.textContent = fullWord.charAt(i);
    // change the event listener below for different effects
    //element.addEventListener("click", moveToTheEnd1);
    element.addEventListener("click", moveToTheEnd2);
    sect.appendChild(element);
  }
}

document
  .getElementById("sendBut")
  .addEventListener("click", createLetterButtons);
