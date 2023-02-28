let wordArray = [];
let word;

/**
 * creates n buttons inside the given section selected by id with a given id root.
 * The param eLNeed is used to choose if adding or not the addEventListener to the
 * buttons
 * @param {String} sectionid
 * @param {int} n
 * @param {String} buttonid
 * @param {boolean} eLNeed
 */
const createLetterButtons = (sectionid, n, buttonid, eLNeed) => {
  let toBeCleared = document.getElementById(sectionid);
  toBeCleared.textContent = "";
  for (let i = 0; i < n; i++) {
    const button = document.createElement("button");
    button.setAttribute("id", buttonid + i);
    const textButton = document.createTextNode(wordArray[i]);
    button.appendChild(textButton);
    document.getElementById(sectionid).appendChild(button);
    eLNeed === true
      ? document.getElementById(buttonid + i).addEventListener("click", () => {
          console.log("ciao bello");
        })
      : null;
  }
};

const splitWord = (word) => {
  wordArray = [];
  for (let i = 0; i < word.length; i++) {
    wordArray.push(word.charAt(i));
  }
  createLetterButtons("sec3", wordArray.length, "letter", true);
};

// at input change, it changes word value
document.getElementById("inp1").addEventListener("change", () => {
  word = document.getElementById("inp1").value;
});

// at button click splits the word into wordArray
document.getElementById("sendBut").addEventListener("click", () => {
  splitWord(word);
});
