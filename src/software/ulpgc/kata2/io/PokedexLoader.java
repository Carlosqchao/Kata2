package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Pokedex;

import java.util.List;

public interface PokedexLoader {
    List<Pokedex> load();
}
