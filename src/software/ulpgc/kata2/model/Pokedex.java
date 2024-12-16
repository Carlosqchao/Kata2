package software.ulpgc.kata2.model;

public record Pokedex(int id, String name, int generation, int numAbilities) {
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
