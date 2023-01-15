package lezione20230112.geometry;

public class Triangle {
  Point a;
  Point b;
  Point c;
}

/*
 * Triangolo con angoli ABC
 * dato il punto A [x=0,y=0] nel caso il punto B, Bx < Ax, allora bisogna calcolare un punto fittizio D[BxAy] dal quale far partire il triangolo rettangolo
 *  questo a patto che Cx > Ax....
 * 
 * Triangolo potrebbe essere un'istanza o una clase astratta, mentre Triangolo equilatero, scaleno, isoscele, rettangolo potrebbero essere le classi reali
 *  rettangolo se Ax = Bx e Ay = Cy;
 * 
 *  se volessi fare una formulazione standard per la ricerca del triangolo, dovrei trovare una formula per calcolare un'altezza standard;
 *  in questo caso dovrei trovare il lato più lungo e costruire l'altezza sempre su quello.
 *  il problema con questo approccio, è che non so dove mi finirà il punto H[x,y] dal quale fare partire la misura dell'altezza verso l'angolo opposto al lato maggiore.
 *  in questo caso si potrebbe utilizzare una funzione per trovare la sola retta perpendicolare al lato più lungo che si va ad incrociare con quell'angolo.
 *  una volta trovata quella retta, basta vedere in che punto si incrocia con la retta del lato più lungo, ed abbiamo così trovato il nostro punto H[x,y];
 *  la formula per disegnare una retta è y=ax+n (dove se n > 0, la retta si sposta indietro sull'asse x)
 *                                              (dove se a>0 la retta è crescente, se a=0 è parallela all'asse x, se a<0 la retta è decrescente)
 *  la retta perpendicolare deve conseguentemente avere come formula y=-1/ax+m;
 *                                              m prende al punto y=Py il valore di
 *                                              se m=Px e y = Py allora bisogna verificare il valore di m quando y=0;
 *  una volta trovato anche il valore di m, trovare l'intersezione tra le 2 rette in modo da trovare il punto H 
 * 
 *  
 */