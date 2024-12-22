 import java.util.ArrayList;
import java.util.List;

public class SupplyChain extends Chain {
    //private Chain chain;
    private List<String> prodotto;

    public SupplyChain(List<Block>chain, List<String> prodotto) {
        super ();
        prodotto = new ArrayList<>(prodotto);


    }
//aggiungi prodotto alla supplyChain
    public boolean addProdotto(String prodotto) {
        return this.prodotto.add(prodotto);
    }
    // aggiungi transazione nella catena
    public void addTransaction(String prodotto,String mittente,String destinatario,String descrizione) {
        Transaction newTransaction = new Transaction(mittente, destinatario, descrizione);

        //aggiungo nella lista delle transazioni
        List <Transaction> transactions= new ArrayList<>();
        transactions.add(newTransaction);
        //quando creo una nuova transazione aggiungo un blocco alla catena
        Block previousBlock =chain.get(chain.size()-1);
        Block newBlock= new Block(
                previousBlock.getId()+1, //incremento indice
                previousBlock.getHashCorrente(),//uso l'hash del blocco precedente
                transactions //Transazione del nuovo blocco
        );
        chain.add(newBlock);
    }
    //visualizzo la Blockchain
   public List visualizzoBlock() {
        return new ArrayList<>(chain); //restituisce la lista dei blocchi nella Blockchain
   }

}
