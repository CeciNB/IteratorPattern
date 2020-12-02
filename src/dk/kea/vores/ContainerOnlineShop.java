package dk.kea.vores;

import java.util.ArrayList;
import java.util.Iterator;

public class ContainerOnlineShop implements Container {

    private ArrayList<Superhelt> superhelte;

    public ContainerOnlineShop() {
        superhelte = new ArrayList<>();
        superhelte.add(new Superhelt("Clark Kent", "Superman", 15));
        superhelte.add(new Superhelt("Peter Parker", "Spiderman", 15));
        superhelte.add(new Superhelt("Bruce Wayne", "Batman", 11));
        superhelte.add(new Superhelt("Wade Wilson", "Deadpool", 0));
    }

    public ArrayList<Superhelt> getSuperhelte() {
        return superhelte;
    }

    public void setSuperhelte(ArrayList<Superhelt> superhelte) {
        this.superhelte = superhelte;
    }

    @Override
    public Iterator getIterator() {
        return superhelte.iterator();
    }

}
