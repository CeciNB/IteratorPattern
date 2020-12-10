package dk.kea.diy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Superhelt> superhelte = new ArrayList<>();

        superhelte.add(new Superhelt("Clark Kent", "Superman", 15));
        superhelte.add(new Superhelt("Peter Parker", "Spiderman", 15));
        superhelte.add(new Superhelt("Bruce Wayne", "Batman", 11));
        superhelte.add(new Superhelt("Wade Wilson", "Deadpool", 0));

        SuperhelteContainer superhelteContainer = new SuperhelteContainer(superhelte);

        Iterator superIterator = superhelteContainer.getIterator();

        while(superIterator.hasNext()){
            System.out.println("Superhelt: " + superIterator.next());
        }
    }
}
