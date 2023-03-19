var immagini = [
  "./images/im1.png",
  "./images/im2.png",
  "./images/im3.png",
  "./images/im4.png",
  "./images/im5.png",
  "./images/im6.png",
];
var facce = [
  "./images/uno.png",
  "./images/due.png",
  "./images/tre.png",
  "./images/quattro.png",
  "./images/cinque.png",
  "./images/sei.png",
];

function inizio() {
  let elemento = document.getElementById("im1");

  elemento.src = facce[0];
  s = document.getElementById("s1");
  for (let i = 0; i < 24; i++) {
    d = document.createElement("img");
    d.className = "clip";
    d.src = immagini[i % 6];
    s.appendChild(d);
  }
}

function lancio() {
  let elemento = document.getElementById("im1");
  let intervalID = setInterval(myCallback, 300);
  var faccia;
  function myCallback() {
    let stop = parseInt(Math.random() * 5);
    faccia = parseInt(Math.random() * 6);
    elemento.src = facce[faccia];
    if (stop == 3) {
      clearInterval(intervalID);
      movimento(faccia + 2);
    }
  }
}

var primo = true;
var pos;
function movimento(faccia) {
  console.log("faccia" + faccia);
  s = document.getElementById("s1");
  let d1;
  if (primo) {
    d1 = s.firstElementChild;
    primo = false;
  } else {
    d1 = pos;
  }
  var avanti = true;
  let passi = faccia;
  let x = 1;

  let intervalID = setInterval(myCallback, 600);
  function myCallback() {
    if (x < passi) {
      if (d1.nextElementSibling && avanti) {
        avanti = true;
        d1 = d1.nextElementSibling;
        d1.style.background = "blue";
        let d2 = d1.previousElementSibling;
        d2.style.background = "bisque";
      } else {
        if (d1.previousElementSibling) {
          avanti = false;
          d1 = d1.previousElementSibling;
          d1.style.background = "blue";
          let d2 = d1.nextElementSibling;
          d2.style.background = "bisque";
        } else {
          avanti = true;
          d1 = d1.nextElementSibling;
          d1.style.background = "blue";
          let d2 = d1.previousElementSibling;
          d2.style.background = "bisque";
        }
      }
      x++;
    } else {
      clearInterval(intervalID);
      pos = d1;
    }
  }
}

document.addEventListener("DOMContentLoaded", inizio);
document.getElementById("b1").addEventListener("click", lancio);
