package dk.kea.jarl;

import java.util.ArrayList;

public class SuperhelteContainer implements Container{

    private ArrayList<Superhelte> superhelte;

    public SuperhelteContainer(ArrayList<Superhelte> superhelte) {
        this.superhelte = new ArrayList();
    }

    @Override
    public Iterator getIterator() {
        return null;
    }

}
