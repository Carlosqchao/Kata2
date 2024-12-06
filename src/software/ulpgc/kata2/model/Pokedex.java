package software.ulpgc.kata2.model;

public class Pokedex {
    private final int id;
    private final String name;
    private final int generation;
    private final double numAbilities;

    public Pokedex(int id, String name, int generation, double weight) {
        this.id = id;
        this.name = name;
        this.generation = generation;
        this.numAbilities = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGeneration() {
        return generation;
    }

    public double getNumAbilities() {
        return numAbilities;
    }

    @Override
    public String toString() {
        return "Pokedex{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", generation=" + generation +
                ", numAbilities=" + numAbilities +
                '}';
    }
}
