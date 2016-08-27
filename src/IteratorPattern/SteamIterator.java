package IteratorPattern;

import java.util.List;

public class SteamIterator implements GameIterator {
    private Steam steam;
    private int index;
    private GameType type;

    public SteamIterator(Steam steam, GameType type) {
        this.steam = steam;
        this.type = type;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {
        this.index = findNextElementIndex();
        return this.index != -1;
    }

    @Override
    public Game next() {
        return this.index > -1 ?
                steam.getGames().get(this.index) :
                null;
    }

    private int findNextElementIndex() {
        List<Game> games = steam.getGames();

        boolean found = false;
        int i = this.index;

        while (!found) {
            i++;

            if (i >= games.size()) {
                i = -1;
                break;
            }
            if (games.get(i).getType().equals(type)) {
                break;
            }
        }
        return i;
    }
}
