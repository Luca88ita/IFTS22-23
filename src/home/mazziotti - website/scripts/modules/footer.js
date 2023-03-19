// setto come 2 costanti i contatti dell'associazione (in modo che siano facili da modificare in caso di necessità)
const phone = "0000000";
const email = "gatti@gatti.com";

const Footer = () => {
  // creo un elemento footer che appendo al genitore che ci viene passato dalla funzione
  const footer = document.createElement("footer");
  // creo un elemento paragrafo che vado ad appendere al nostro footer, ed al quale do un testo
  const paragraph1 = document.createElement("p");
  paragraph1.textContent = "I nostri contatti:";
  footer.appendChild(paragraph1);
  // creo un link email con tutte le sue proproetà e l'appendo al footer
  const alinkmail = document.createElement("a");
  alinkmail.href = "mailto:" + email;
  alinkmail.textContent = "Scrivici a " + email;
  footer.appendChild(alinkmail);
  // creo un link telefono con tutte le sue proproetà e l'appendo al footer
  const alinkphone = document.createElement("a");
  alinkphone.href = "tel:" + phone;
  alinkphone.textContent = "Chiamaci al " + phone;
  footer.appendChild(alinkphone);
  // creo un ultimo elemento paragrafo che vado ad appendere al nostro footer, ed al quale do un testo
  const paragraph2 = document.createElement("p");
  paragraph2.textContent = "Copyright \u00A9";
  footer.appendChild(paragraph2);
  return footer;
};

// esporto il tutto
export default Footer;
