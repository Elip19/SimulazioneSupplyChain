import java.security.MessageDigest; //è una classe che fornisce funzione di hashing
import java.util.Date;
import java.util.List;
public class Block {
    private int id;
    private static int idCounter=1;
    private String hashCorrente;
    private String hashPrecedente;
   // private String nonce; lo usiamo se vogliamo anche simulare il meccanismo di mining che pero richiede un certo carico computazionale
    private Long timestamp;
    private List <Transaction> transactions;

    public Block(String hashPrecedente,String nonce, Long timestamp, List <Transaction> transactions) {
        this.id = idCounter++;
        this.hashCorrente = calculateHash();//calcolo hash del blocco
      //  this.nonce = nonce;
        this.timestamp = new Date().getTime();
        this.transactions = transactions;

    }

    public String getHashCorrente() {
        return hashCorrente;
    }

    public String getHashPrecedente() {
        return hashPrecedente;
    }
    public String calculateHash (){
        try{
            //concateno il contenuto del blocco
            String dataToHash= hashPrecedente+id+Long.toString(timestamp)+transactions.toString();
            //creo l'istanza di MessageDigest per SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Genero i byte hash a partire dai dati
            byte[] hash = digest.digest(dataToHash.getBytes("UTF-8"));//la stringa viene convertita in un array di byte
            //Converto i byte hash in stringa esadecimale
            StringBuilder hashString = new StringBuilder();
            for (byte b : hash) {//itero su ogni byte dell'array
            hashString.append(String.format("%02x", b));}//formattazione in esadecimale
            //il valore esadecimale viene aggiunto al StringBuilder

            return hashString.toString();} //restituisco l'hash come stringa
        catch (Exception e){// l'errore prodotto durante la conversione viene catturato e rilanciata
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "Block{" +
                "id=" + id +
                ", hashCorrente='" + hashCorrente + '\'' +
                ", hashPrecedente='" + hashPrecedente + '\'' +
                //", nonce='" + nonce + '\'' +
                ", timestamp=" + timestamp +
                ", transactions=" + transactions +
                '}';
    }
}

