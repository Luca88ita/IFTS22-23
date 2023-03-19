// vado a creare una funzione che ho deciso di chiamare Header (perché la utilizzerò per creare l'header e gli elementi al suo interno)
// Per poter riutilizzare questa funzione, vado a dargli degli attributi, che sono:
//
// bannerUrl che è l'indirizzo dell'immagine del banner
// logoUrl che è l'indirizzo dell'immagine del logo
// title che è il titolo che voglio dare al mio header
//
// quando si andrà a richiamare questa funzione, per farla lavorare correttamente, bisognerà fornirle tutti e 3 questi parametri

const Header = (bannerUrl, logoUrl, title) => {
  // vado a creare l'elemento header...
  let header = document.createElement("header");
  header.id = "header";

  // qui vado invece a creare l'immagine del banner, con tutte le sue proprietà
  let banner = document.createElement("img");
  banner.className = "banner";
  banner.src = bannerUrl;
  banner.alt = "banner";
  // ed infine lo appendo all'elemento header
  header.appendChild(banner);

  // qui vado a creare in maniera simile l'immagine del logo, con tutte le sue proprietà
  let logo = document.createElement("img");
  logo.className = "logo";
  logo.src = logoUrl;
  logo.alt = "logo";
  // e lo appendo all'elemento header
  header.appendChild(logo);

  // e come ultima cosa, vado a creare l'elemento h1 dove avrò il titolo
  let h1 = document.createElement("h1");
  // gli vado a dare un testo...
  h1.textContent = title;
  // e per completare l'opera, lo appendo all'elemento header
  header.appendChild(h1);
  return header;
};

// come ultima cosa devo andare ad esportare la classe Header, in modo che possa essere richiamata
export default Header;
