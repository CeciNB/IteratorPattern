package dk.kea.jarl;

import java.util.ArrayList;

public class SuperhelteContainer implements Container{

    private ArrayList<Superhelt> superhelte;

    public SuperhelteContainer(ArrayList<Superhelt> superhelte) {
        this.superhelte = superhelte;
    }

    public ArrayList<Superhelt> getSuperhelte() {
        return superhelte;
    }

    public void setSuperhelte(ArrayList<Superhelt> superhelte) {
        this.superhelte = superhelte;
    }

    @Override
    public Iterator getIterator() {
        return new SuperhelteIterator(this);
    }

}
