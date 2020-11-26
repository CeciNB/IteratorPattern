package dk.kea.jarl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Superhelte> superhelte = new ArrayList<>();

        superhelte.add(new Superhelte("Clark Kent", "Superman", 15));
        superhelte.add(new Superhelte("Peter Parker", "Spiderman", 15));
        superhelte.add(new Superhelte("Bruce Wayne", "Batman", 11));
        superhelte.add(new Superhelte("Wade Wilson", "Deadpool", 0));

        SuperhelteContainer superhelteContainer = new SuperhelteContainer(superhelte);

        Iterator superIterator = superhelteContainer.getIterator();

        while(superIterator.hasNext()){
            System.out.println("Superhelt: " + superIterator.next());
        }
    }
}
