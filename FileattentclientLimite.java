public class FileattentclientLimite extends Fileattentclient {
    private int clientmax = 30;

    public synchronized void arriver(Client client) throws Exception {
        while (super.taille() >= clientmax) {
            wait();
        }
        super.ajouter(client);
        notify();
    }
    public synchronized void depart() throws Exception{
        while (super.tete() == null) {
            wait();
        }
        super.enlever();
        notify();
    }
}
