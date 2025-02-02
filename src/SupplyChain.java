 import java.util.ArrayList;
import java.util.List;

public class SupplyChain {
    private Chain chain;
    private List<String> prodotto;

    public SupplyChain() {
        this.chain = new Chain();
        this.prodotto = new ArrayList<>();


    }



    //aggiungi prodotto alla supplyChain
    public boolean addProdotto(String prodotto) {
        return this.prodotto.add(prodotto);
    }

    public List<String> getProdotto() {
        return this.prodotto;
    }
   //aggiungo la blockchain nella supplychain
    public void addBlockchain (Chain chain) {
        this.chain = chain;
    }
    //restituisce la rappresentazione della blockchain
    public String getChain() {
        return chain.toString();
    }

}
