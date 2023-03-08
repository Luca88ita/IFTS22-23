function ready() {
  let sezione = document.getElementById("s1");
  let figlio = sezione.firstElementChild;
  console.log(figlio.textContent)
  figlio = figlio.nextElementSibling;
  console.log(figlio.textContent)
  figlio = figlio.nextElementSibling;
  console.log(figlio.textContent)
  figlio = figlio.previousElementSibling;
  console.log(figlio.textContent)
}

ready();