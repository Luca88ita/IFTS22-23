const phone = "0000000";
const email = "gatti@gatti.com";

const Footer = (parentId) => {
  const footer = document.createElement("footer");
  parentId.appendChild(footer);
  const paragraph1 = document.createElement("p");
  paragraph1.textContent = "I nostri contatti:";
  footer.appendChild(paragraph1);
  const alinkmail = document.createElement("a");
  alinkmail.href = "mailto:" + email;
  alinkmail.textContent = "Scrivici a " + email;
  footer.appendChild(alinkmail);
  const alinkphone = document.createElement("a");
  alinkphone.href = "tel:" + phone;
  alinkphone.textContent = "Chiamaci al " + phone;
  footer.appendChild(alinkphone);
  const paragraph2 = document.createElement("p");
  paragraph2.textContent = "Copyright \u00A9";
  footer.appendChild(paragraph2);
};

export default Footer;
