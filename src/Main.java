import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creo la Blockchain");

        Chain blockchain1= new Chain();

        //creo la lista di transazioni
        List<Transaction> transactions1 = new ArrayList<>();
        transactions1.add(new Transaction("produttore Cuneo ","magazzino Cuneo","Uova fresche allevate a terra: 10kg"));
        transactions1.add(new Transaction("magazzino Cuneo ","produttore Cuneo","Uova fresche allevate a terra: 10kg"));
        //aggiungo il blocco alla blockchain

        //2
        List<Transaction> transactions2 = new ArrayList<>();
        transactions2.add(new Transaction("magazzino Nichelino","Carrefour Nichelino","Uova fresche allevate a terra: 10kg"));
        transactions2.add(new Transaction("Carrefour Nichelino","magazzino Nichelino","fattura 236-CR-T6"));
        //aggiungo il blocco alla blockchain con le sua transazioni
        blockchain1.addBlock(transactions1);
        blockchain1.addBlock(transactions2);
        //vedo la Blockchain con i dettagli
        System.out.println(blockchain1.getChain());


        //inizializzo la supplychain
        SupplyChain supplyChain1 = new SupplyChain();
        //aggiungo prodotti al sistema
        supplyChain1.addProdotto("uova fresche allevate a terra: 10kg");
        supplyChain1.addProdotto("Marmellate Artigianali del Po");
        supplyChain1.addProdotto("Farina di Semola");



        //visualizzo i prodotti presenti nella supplychain
        System.out.println("Elenco dei prodotti:");
        for(String prodotti: supplyChain1.getProdotto()) {
            System.out.println("-" + prodotti);

        }
        //aggiungo alla supplychain la blockchain
        supplyChain1.addBlockchain(blockchain1);

        //visualizzo la blockchain della supplychain con i dettagli
        System.out.println("Visulizzazione della blockchain:");
        System.out.println(supplyChain1.getChain().toString());












    }
}