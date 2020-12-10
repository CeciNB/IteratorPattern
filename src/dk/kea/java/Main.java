package dk.kea.java;

import java.util.Iterator;

public class Main{

    public static void main(String[] args) {
        ContainerOnlineShop onlineShop = new ContainerOnlineShop();
        ContainerButik butik = new ContainerButik();
        Iterator<Superhelt> listIterator = onlineShop.getIterator();
        Iterator<Superhelt> mapIterator = butik.getIterator();

        System.out.println("ArrayList");
        while (listIterator.hasNext()){
            System.out.println("Superhelt: " + listIterator.next());
        }
        System.out.println("HashMap");
        while (mapIterator.hasNext()){
            System.out.println("Superhelt: " + mapIterator.next());
        }
    }
}
