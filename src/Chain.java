import java.util.ArrayList;
import java.util.List;
public class Chain {
    protected List <Block> chain;


    public Chain() {
        this.chain = new ArrayList<>();
       addGenesisBlock();

    }
    private void addGenesisBlock() { //metodo privato per creare il primo blocco della catena che ha valori 0
        Block genesisBlock= new Block(0, "0",new ArrayList<>());
        chain.add(genesisBlock);
    }
    //metodo per aggiungere un blocco alla catena
    public void addBlock(List<Transaction>transactions){
        Block previousBlock = chain.get(chain.size()-1);//creo una variabile dove inserisco l'ultimo blocco della catena
        Block newBlock= new Block(
                previousBlock.getId()+1, //incremento indice
                previousBlock.getHashCorrente(),//uso l'hash del blocco precedente
                transactions //Transazione del nuovo blocco
        );
        chain.add(newBlock);//aggiungo il blocco alla blockchain
    }

    public List<Block> getChain() {
        return chain;
    }

    @Override
    public String toString() {
        return "Chain{" +
                "chain=" + chain +
                '}';
    }
}
