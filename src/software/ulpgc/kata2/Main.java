package software.ulpgc.kata2;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("pokedex_(Update.04.20).csv");
        List<Pokedex> titles = new FilePokedexLoader(file,new CsvPokedexDeserializer()).load();
        Map<Integer,Integer> stats = new HashMap<>();
        for (Pokedex title : titles){
          stats.put(title.getGeneration(), stats.getOrDefault(title.getGeneration(),0)+1);
        }
        for (int generation : stats.keySet()){
            System.out.println("Generation " + generation + "\t" + stats.get(generation));
        }
    }
}
