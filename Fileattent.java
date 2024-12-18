import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Fileattent <T>{
    private List<T> queue;
    Fileattent(){
        queue = new LinkedList<T>();
    }
    public boolean ajouter(T element){
        if (queue.contains(element)) {
            return false;
        }
        queue.add(element);
        return true;
    } 

    public boolean enlever(){
        if (queue.size() == 0) {
            return false;
        }
        queue.removeFirst();
        return true;
    }
    public final T tete(){
        if(queue.size() == 0) return null;
        return queue.get(0);
    }
    Iterator <T> iterator(){
        return this.queue.iterator();
    }
    public List<T> getQueue(){
        return this.queue;
    }
}