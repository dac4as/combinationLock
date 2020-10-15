package it.unicam.cs.asdl2021.combinationlock;

/**
 * Uno scassinatore è un oggetto che prende una certa cassaforte e trova la
 * combinazione utilizzando la "forza bruta".
 * 
 * @author Luca Tesei
 *
 */
public class Burglar {

    CombinationLock aCombinationLock;
    long att;
    String combinazioneForzata;

    /**
     * Costruisce uno scassinatore per una certa cassaforte.
     *
     * @param aCombinationLock
     * @throw NullPointerException se la cassaforte passata è nulla
     */
    public Burglar(CombinationLock aCombinationLock) {
        if (aCombinationLock == null)
            throw new NullPointerException();
        this.aCombinationLock = aCombinationLock;
        att = -1;
        combinazioneForzata = "";

    }

    /**
     * Forza la cassaforte e restituisce la combinazione.
     *
     * @return la combinazione della cassaforte forzata.
     */
    public String findCombination() {
        if (aCombinationLock.isOpen)
            System.out.println("Cassaforte già aperta");
        else{
                for (char i='A';i<='Z';i++)
                {
                    for(char k='A';k<='Z';k++)
                    {
                        for(char z='A';z<='Z';z++)
                        {
                            aCombinationLock.setPosition(i);
                            aCombinationLock.setPosition(k);
                            aCombinationLock.setPosition(z);
                            att++;
                            aCombinationLock.open();

                            if(aCombinationLock.isOpen())
                            {
                                combinazioneForzata+=i;
                                combinazioneForzata+=k;
                                combinazioneForzata+=z;
                                return combinazioneForzata;
                            }
                        }
                    }
                }
            }
        return null;
    }


    /**
     * Restituisce il numero di tentativi che ci sono voluti per trovare la
     * combinazione. Se la cassaforte non è stata ancora forzata restituisce -1.
     * 
     * @return il numero di tentativi che ci sono voluti per trovare la
     *         combinazione, oppure -1 se la cassaforte non è stata ancora
     *         forzata.
     */
    public long getAttempts() {
        return att;
    }
}
