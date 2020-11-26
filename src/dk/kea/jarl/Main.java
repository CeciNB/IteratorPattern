package dk.kea.jarl;

public class Main {

    public static void main(String[] args) {
        SuperhelteContainer superhelteContainer = new SuperhelteContainer();
        Superhelte superman = new Superhelte("Clark Kent", "Superman", 15);
        Superhelte spiderman = new Superhelte("Peter Parker", "Spiderman", 15);
        Superhelte batman = new Superhelte("Bruce Wayne", "Batman", 11);
        Superhelte deadpool = new Superhelte("Wade Wilson", "Deadpool", 0);
    }
}
