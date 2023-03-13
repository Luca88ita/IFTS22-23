const root = document.getElementById("root");

const header = document.createElement("header");
header.style.backgroundImage = "url(./assets/rainbow.jpg)";
header.style.backgroundSize= "fill";
header.style.backgroundPosition= "left";
header.style.backgroundRepeat="no-repeat";
root.appendChild(header);

const title = document.createElement("h1");
title.textContent = "Esercizi di JS";
header.appendChild(title);

const navBar = document.createElement("nav");
header.appendChild(navBar);

/*
const linkArray = [];
const buttonArray = [];

for (let index = 0; index < 4; index++) {
  linkArray[index] = document.createElement("a");
  linkArray[index].id = "links"+(index);
  linkArray[index].href="https://www.google.com/it"
  linkArray[index].target="_blank";
  //link1.target="_self";
  navBar.appendChild(linkArray[index]);

  buttonArray[index] = document.createElement("button");
  buttonArray[index].textContent = "Link "+(index+1);
  linkArray[index].appendChild(buttonArray[index]);
}*/


for (let index = 0; index < 4; index++) {
  let aLink = document.createElement("a");
  aLink.id = "links"+(index);
  aLink.className = "links";
  aLink.href="https://www.google.com/it"
  aLink.target="_blank";
  //link1.target="_self";
  navBar.appendChild(aLink);

  let linkedButton = document.createElement("button");
  linkedButton.textContent = "Link "+(index+1);
  linkedButton.style.cssText = "transition: 1000ms"
  linkedButton.addEventListener("mouseover",() =>{
    linkedButton.style.backgroundColor="yellow";
  })
  linkedButton.addEventListener("mouseout",() =>{
    linkedButton.style.backgroundColor="white";
  })
  aLink.appendChild(linkedButton);

}

