package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        games.add(new Game("g1", GameType.RTS));
        games.add(new Game("g2", GameType.RTS));
        games.add(new Game("g3", GameType.RTS));
        games.add(new Game("g4", GameType.RTS));
        games.add(new Game("g5", GameType.RTS));
        games.add(new Game("g6", GameType.RPG));
        games.add(new Game("g7", GameType.FTP));
        games.add(new Game("g8", GameType.FTP));
        games.add(new Game("g9", GameType.RTS));

        Steam steam = new Steam(games);

        SteamIterator iterator = new SteamIterator(steam, GameType.RTS);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
