package dk.kea.jarl;

public class Superhelte {

    private String name;
    private String alias;
    private int deathCount;

    public Superhelte(String name, String alias, int deathCount) {
        this.name = name;
        this.alias = alias;
        this.deathCount = deathCount;
    }

    public Superhelte() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getDeathCount() {
        return deathCount;
    }

    public void setDeathCount(int deathCount) {
        this.deathCount = deathCount;
    }

    @Override
    public String toString() {
        return "Superhelte{" +
                "name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", deathCount=" + deathCount +
                '}';
    }
}
