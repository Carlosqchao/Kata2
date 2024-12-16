package software.ulpgc.kata2;

import software.ulpgc.kata2.io.CsvPokedexDeserializer;
import software.ulpgc.kata2.io.FilePokedexLoader;
import software.ulpgc.kata2.model.Pokedex;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static software.ulpgc.kata2.io.CsvDownloader.downloadCsv;

public class Main {
    public static void main(String[] args) throws IOException {
        File path = new File("");
        String Path = path.getAbsolutePath();
        String urlInput = "https://raw.githubusercontent.com/Carlosqchao/Resources/refs/heads/main/pokedex_(Update.04.20).csv";
        String outputPath = Path + "\\pokedex_(Update.04.20).csv";
        downloadCsv(urlInput,outputPath);
        File file = new File("pokedex_(Update.04.20).csv");
        List<Pokedex> titles = new FilePokedexLoader(file, new CsvPokedexDeserializer()).load();
        Map<Integer,Integer> stats = new HashMap<>();
        for(Pokedex pokemon : titles){
            stats.put(pokemon.generation(), stats.getOrDefault(pokemon.generation(),0)+1);
        }
        for (int generation: stats.keySet()) {
            System.out.println("Generation " + generation + "\t" + stats.get(generation));
        }
    }
}
