package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Pokedex;

public interface PokedexDeserializer {
    Pokedex deserialize(String line);
}
