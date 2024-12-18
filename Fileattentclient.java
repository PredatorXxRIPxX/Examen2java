import java.util.Iterator;

public class Fileattentclient extends Fileattent<Client> {
    public final boolean estVide(){
        if (super.tete()!=null) {
            return false;
        }
        return true;
    }
    public int taille(){
        if(estVide()){
            return 0;
        }
        Iterator<Client> it = super.iterator();
        int count = 0;
        while (it.hasNext()) {
            count++;
            it.next();
        }
        return count;
    }
    public final boolean contient(Client c){
        Iterator<Client> it = super.iterator();
        while (it.hasNext()) {
            Client client = it.next();
            if (client.compareTo(c) == 1) {
                return true;
            }
        }
        return false;
    }
}
