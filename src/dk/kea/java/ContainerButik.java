package dk.kea.java;

import java.util.HashMap;
import java.util.Iterator;

public class ContainerButik implements Container<Superhelt> {

    private HashMap<Superhelt,Integer> superhelte;

    public ContainerButik(){
        superhelte = new HashMap<>();
        Superhelt superman = new Superhelt("Clark Kent", "Superman", 15);
        Superhelt spiderman = new Superhelt("Peter Parker", "Spiderman", 15);
        Superhelt batman = new Superhelt("Bruce Wayne", "Batman", 11);
        Superhelt deadpool = new Superhelt("Wade Wilson", "Deadpool", 0);
        superhelte.put(superman, superman.getDeathCount());
        superhelte.put(spiderman, spiderman.getDeathCount());
        superhelte.put(batman, batman.getDeathCount());
        superhelte.put(deadpool, deadpool.getDeathCount());
    }

    public HashMap<Superhelt,Integer> getSuperhelte() {
        return superhelte;
    }

    public void setSuperhelte(HashMap<Superhelt,Integer> superhelte) {
        this.superhelte = superhelte;
    }

    @Override
    public Iterator<Superhelt> getIterator() {
        return superhelte.keySet().iterator();
    }
}
