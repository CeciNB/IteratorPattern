package dk.kea.jarl;

public class SuperhelteIterator implements Iterator{

    private SuperhelteContainer superhelteContainer;
    private int iterateState;

    public SuperhelteIterator(SuperhelteContainer superhelteContainer) {
        this.superhelteContainer = superhelteContainer;
    }

    @Override
    public boolean hasNext() {
        if(iterateState < superhelteContainer.getSuperhelte().size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()) {
            return superhelteContainer.getSuperhelte().get(iterateState++);
        }
        return null;
    }
}
