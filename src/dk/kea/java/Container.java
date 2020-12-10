package dk.kea.java;

import java.util.Iterator;

public interface Container<T> {
    public Iterator<T> getIterator();
}
