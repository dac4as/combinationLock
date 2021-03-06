package it.unicam.cs.asdl2021.combinationlock;

/**
 * Un oggetto cassaforte con combinazione ha una manopola che può essere
 * impostata su certe posizioni contrassegnate da lettere maiuscole. La
 * serratura si apre solo se le ultime tre lettere impostate sono uguali alla
 * combinazione segreta.
 * 
 * @author Luca Tesei
 */
public class CombinationLock {

    char[] lastIns; //variabile per inserire le varie combinazioni
    private String combinazioneSegreta; //variabile dove viene salvata la combinazione per sbloccare la cassaforte, ANDREBBE PRIVATA
    boolean isOpen;//flag per segnalare apertura o meno della cassa
    /**
     * Costruisce una cassaforte <b>aperta</b> con una data combinazione
     * 
     * @param aCombination
     *                         la combinazione che deve essere una stringa di 3
     *                         lettere maiuscole dell'alfabeto inglese
     * @throw IllegalArgumentException se la combinazione fornita non è una
     *        stringa di 3 lettere maiuscole dell'alfabeto inglese
     * @throw NullPointerException se la combinazione fornita è nulla
     */
    public CombinationLock(String aCombination) {
        if(aCombination==null)//così si confronta se la stringa sia vuota o meno, .equals(null) è un riferimento alla memoria (darebbe sicuramente nullpointerexc), equals serve per confrontare le stringhe, non il null
            throw new NullPointerException();//OPPURE andava bene aCombination.equals("")
        if(aCombination.length()!=3 || !aCombination.equals(aCombination.toUpperCase()))//non viene fatto un controllo preciso, ma su setPosition sì (manca quella condizione a riga 48, ma non si può fare su string) vedi riga 106
        throw new IllegalArgumentException();
        lastIns= new char[3];//le variabili (anche vettori) vanno inizializzate nel costruttore
        combinazioneSegreta=aCombination;
        isOpen=false; //io la istanzio chiusa la cassa, ma se i test me la aprono poco posso farci (inoltre è buona cosa aggiungere this. alle variabili istanza)
    }

    /**
     * Imposta la manopola su una certaposizione.
     * 
     * @param aPosition
     *                      un carattere lettera maiuscola su cui viene
     *                      impostata la manopola
     * @throws IllegalArgumentException
     *                                      se il carattere fornito non è una
     *                                      lettera maiuscola dell'alfabeto
     *                                      inglese
     */
    public void setPosition(char aPosition) {//metodo che fa scorrere di 1 i caratteri del vettore, scarta quello di indice 0 e ne mette uno nuovo (aPosition) alla fine
        if  (aPosition<'A' || aPosition>'Z')
            throw new IllegalArgumentException();
        //scorro la combinazione di 1, inserisco il "nuovo" (aPosition) carattere sull'indice finale del vettore
        lastIns[0]=lastIns[1];
        lastIns[1]=lastIns[2];
        lastIns[2]=aPosition;
    }

    /**
     * Tenta di aprire la serratura considerando come combinazione fornita le
     * ultime tre posizioni impostate.
     */
    public void open() {

        if(combinazioneSegreta.equals(new String(lastIns)))
            isOpen=true;
        else
            isOpen=false;

    }

    /**
     * Determina se la cassaforte è aperta.
     * 
     * @return true se la cassaforte è attualmente aperta, false altrimenti
     */
    public boolean isOpen() {
            return isOpen;
    }

    /**
     * Chiude la cassaforte senza modificare la combinazione attuale. Fa in modo
     * che se si prova a riaprire subito senza impostare nessuna nuova posizione
     * della manopola la cassaforte non si apre. Si noti che se la cassaforte
     * era stata aperta con la combinazione giusta le ultime posizioni impostate
     * sono proprio la combinazione attuale.
     */
    public void lock() {
        if(isOpen())
            isOpen=false;

    }

    /**
     * Chiude la cassaforte e modifica la combinazione. Funziona solo se la
     * cassaforte è attualmente aperta. Se la cassaforte è attualmente chiusa
     * rimane chiusa e la combinazione non viene cambiata.
     * 
     * @param aCombination
     *                         la nuova combinazione che deve essere una stringa
     *                         di 3 lettere maiuscole dell'alfabeto inglese
     * @throw IllegalArgumentException se la combinazione fornita non è una
     *        stringa di 3 lettere maiuscole dell'alfabeto inglese
     * @throw NullPointerException se la combinazione fornita è nulla
     */
    public void lockAndChangeCombination(String aCombination) {
        if(aCombination==null)
            throw new NullPointerException();
        for(char c: aCombination.toCharArray()) { //per ogni lettera della stringa aCombination convertita in char
            if (!Character.isLetter(aCombination.charAt(c)))//se il carattere char c nella posizione corrente di c non risulta essere una lettera dell'alfabeto...
                throw new IllegalArgumentException();
        }
        if(isOpen())
            {
                lock();
                combinazioneSegreta=aCombination;
            }
        }

    }
