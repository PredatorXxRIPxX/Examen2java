public class Client implements Comparable<Client> {
    private String nom;
    private String prenom;
    private boolean estPrioritere;
    Client(String nom,String prenom,boolean estPrioritere){
        this.nom = nom;
        this.prenom = prenom;
        this.estPrioritere = estPrioritere;
    }
    @Override
    public int compareTo(Client c1){
        if(this.nom == c1.nom && this.prenom == c1.prenom){
            return 1;
        }
        return 0;
    }
    public boolean estPrioritere(){
        return this.estPrioritere;
    }
}
