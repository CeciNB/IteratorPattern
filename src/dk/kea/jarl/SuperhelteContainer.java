package dk.kea.jarl;

import java.util.ArrayList;

public class SuperhelteContainer implements Container{

    private ArrayList<Superhelte> superhelte;

    public SuperhelteContainer(ArrayList<Superhelte> superhelte) {
        this.superhelte = superhelte;
    }

    public ArrayList<Superhelte> getSuperhelte() {
        return superhelte;
    }

    public void setSuperhelte(ArrayList<Superhelte> superhelte) {
        this.superhelte = superhelte;
    }

    @Override
    public Iterator getIterator() {
        return new SuperhelteIterator(this);
    }

}
