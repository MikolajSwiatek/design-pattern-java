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
        return findNextElementIndex() != -1;
    }

    @Override
    public Game next() {
        int i = findNextElementIndex();
        return i > -1 ?
                steam.getGames().get(i) :
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
            if (type.equals(GameType.RTS) ||
                    games.get(i).getType().equals(type)) {
                break;
            }
        }
        return i;
    }
}
