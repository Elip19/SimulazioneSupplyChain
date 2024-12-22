import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creo la Blockchain");

        Chain blockchain1= new Chain();
        Chain blockchain2= new Chain();
        //creo la lista di transazioni
        List<Transaction> transactions1 = new ArrayList<>();
        transactions1.add(new Transaction("produttore Cuneo ","magazzino Cuneo","Uova fresche allevate a terra: 10kg"));
        transactions1.add(new Transaction("magazzino Cuneo ","produttore Cuneo","Uova fresche allevate a terra: 10kg"));
        //aggiungo il blocco alla blockchain
        blockchain1.addBlock(transactions1);
        //2
        List<Transaction> transactions2 = new ArrayList<>();
        transactions2.add(new Transaction("magazzino Nichelino","Carrefour Nichelino","Uova fresche allevate a terra: 10kg"));
        transactions2.add(new Transaction("Carrefour Nichelino","magazzino Nichelino","fattura 236-CR-T6"));
        blockchain2.addBlock(transactions2);
        //vedo la Blockchain
        System.out.println(blockchain1.toString());






    }
}