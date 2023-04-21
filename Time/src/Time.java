public class Time {
    //ERRORE: NON FA CREARE LA DOCUMENTAZIONE - COMANDO USATO javadoc -d cartellanuova ./src/Time.java
    /**
     * Variabile intera per i secondi
     */
    protected int secondi;

    /**
     * Variabile intera per i minuti
     */
    protected int minuti;

    /**
     * Variabile intera per le ore
     */
    protected int ore;

    /**
     * Costruttore con parametri classe Time
     * Se si passano come parametri numeri superiori alla norma, creerà un oggetto 0:0:0
     * @param ore 
     * @param minuti
     * @param secondi
     */
    public Time(int ore, int minuti, int secondi){
        if(minuti >= 60 || secondi >= 60){
            this.secondi = 0;
            this.minuti = 0;
            this.ore = 0;
        }
        else{
            this.secondi = secondi;
            this.minuti = minuti;
            this.ore = ore;
        }  
    }

    /**
     * Costruttore con parametro "secondi"
     * Il costruttore, tramite i secondi passati come parametro, è capace di convertire automaticamente ore e minuti
     * @param secondi
     */
    public Time(int secondi){
        this.secondi += secondi;
        this.distribuisciOrario();
    }

    /**
     * Metodo che ritorna un intero che è il numero di ore
     * @return ore
     */
    public int getOre(){
        return ore;
    }

    /**
     * Metodo che ritorna un intero che è il numero di minuti
     * @return minuti
     */
    public int getMinuti(){
        return minuti;
    }

    /**
     * Metodo che ritorna un intero che è il numero di secondi 
     * @return secondi
     */
    public int getSecondi(){
        return secondi;
    }

    /**
     * Metodo che permette di settare il numero di ore
     * @param ore
     */
    public void setOre(int ore){
        this.ore = ore;
    }

    /**
     * Metodo che permette di settare il numero di minuti
     * @param minuti
     */
    public void setMinuti(int minuti){
        this.minuti = minuti;
    }

    /**
     * Metodo che permette di settare il numerp di secondi
     * @param secondi
     */
    public void setSecondi(int secondi){
        this.secondi = secondi;
    }

    /**
     * Metodo che ritorna una stringa formato ore:minuti:secondi
     */
    public String toString(){
        return ore + ":" + minuti + ":" + secondi;
    }

    /**
     * Metodo che permette di aggiungere un numero di secondi preso come parametro
     * Il metodo è in grado di sistemare l'orario automaticamente
     * @param numSecondi
     */
    public void addSecondi(int numSecondi){
        secondi = secondi + numSecondi; 
        distribuisciOrario();
    }

    /**
     * Metodo che permette di convertire l'oggetto in soli secondi 
     * @return
     */
    public int convertiSecondi(){
        return secondi + (minuti * 60) + (ore * 3600);
    }

    private void distribuisciOrario(){
        int contMinuti = secondi / 60;
        this.secondi -= contMinuti * 60;
        this.minuti += contMinuti;
        int contOre = minuti / 60;
        this.minuti -= contOre * 60;
        this.ore += contOre;
    }
}
