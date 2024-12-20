import java.util.Objects;

public class Transaction {
    private int id;
    private static int idCounter=0;
    private String mittente;
    private String destinatario;
    private String descrizione;

    public Transaction(String mittente, String destinatario, String descrizione) {
        this.id = idCounter++;
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.descrizione = descrizione;



    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return id==that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", mittente='" + mittente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
