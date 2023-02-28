let binArray = [];
let nButtSec0 = 8;
let nButtSec1 = nButtSec0 / 4;

/**
 * Conversion table receiving in input a decimal number and returning it exadecimal
 * @param {int} n input decimal number
 * @returns output result exadecimal number
 */
const esaTable = (n) => {
  let result;
  switch (n) {
    case 15:
      result = "F";
      break;
    case 14:
      result = "E";
      break;
    case 13:
      result = "D";
      break;
    case 12:
      result = "C";
      break;
    case 11:
      result = "B";
      break;
    case 10:
      result = "A";
      break;
    default:
      result = n;
      break;
  }
  return result;
};

/**
 * Converts the array value into exadecimal numbers
 */
const esaConversion = () => {
  let n = 0;
  for (let i = 0; i < nButtSec1; i++) {
    let esaValue =
      binArray[0 + n] * Math.pow(2, 3) +
      binArray[1 + n] * Math.pow(2, 2) +
      binArray[2 + n] * Math.pow(2, 1) +
      binArray[3 + n] * Math.pow(2, 0);
    document.getElementById("esa" + i).textContent = esaTable(esaValue);
    n += 4;
  }
};

/**
 * Changes textContent of the element selected by id from "0" to "1" and viceversa.
 * It also changes the value of the indexed element in binArray and calls the
 * function esaConversion()
 * @param {String} idRoot
 * @param {int} index
 */
const zeroToOne = (idRoot, index) => {
  fullId = idRoot + index;
  let value = document.getElementById(fullId).textContent;
  binArray[index] = value === "0" ? (value = 1) : (value = 0);
  document.getElementById(fullId).textContent = value;
  console.log(binArray);
  esaConversion();
};

/**
 * creates n buttons inside the given section selected by id with a given id root.
 * The param eLNeed is used to choose if adding or not the addEventListener to the
 * buttons
 * @param {String} sectionid
 * @param {int} n
 * @param {String} buttonid
 * @param {boolean} eLNeed
 */
const createButtons = (sectionid, n, buttonid, eLNeed) => {
  for (let i = 0; i < n; i++) {
    binArray.push(0);
    const button = document.createElement("button");
    button.setAttribute("id", buttonid + i);
    const textButton = document.createTextNode("0");
    button.appendChild(textButton);
    document.getElementById(sectionid).appendChild(button);
    eLNeed === true
      ? document.getElementById(buttonid + i).addEventListener("click", () => {
          zeroToOne(buttonid, i);
        })
      : (button.style.cursor = "default");
  }
};

createButtons("sec1", nButtSec0, "bin", true);
createButtons("sec2", nButtSec1, "esa", false);
