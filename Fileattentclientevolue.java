import java.util.Comparator;
import java.util.PriorityQueue;

public class Fileattentclientevolue extends Fileattent<Client>{
    PriorityQueue<Client> queue;
    public Fileattentclientevolue(){
        Comparator<Client> com = new Comparator<Client>() {
            @Override
            public int compare(Client c1,Client c2){
                if (c1.estPrioritere() && c2.estPrioritere()) {
                    return 0;
                }else {
                    if (c1.estPrioritere() && !c2.estPrioritere()) {
                        return -1;
                    }
                    if (!c1.estPrioritere() && c2.estPrioritere()) {
                        return 1;
                    }
                }
                return 0;
            }
        }; 

        queue = new PriorityQueue<>(com);
    }
    @Override
    public boolean ajouter(Client client) {
        return queue.offer(client); 
    }

    @Override
    public boolean enlever() {
        if (queue.isEmpty()) {
            return false; 
        }
        queue.poll(); 
        return true;
    }


    public final boolean estVide() {
        return queue.isEmpty();
    }

    public final int taille() {
        return queue.size();
    }

    public final boolean contient(Client client) {
        return queue.contains(client);
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
