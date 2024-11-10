package software.ulpgc.kata2;

import java.io.IOException;
import java.util.List;

public interface PokedexLoader {
    List<Pokedex> load() throws IOException;
}
