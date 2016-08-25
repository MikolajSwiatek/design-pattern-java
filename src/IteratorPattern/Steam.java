package IteratorPattern;

import java.util.List;

public class Steam {
    private List<Game> games;

    public Steam(List<Game> games) {
        this.games = games;
    }

    public GameIterator iterator(GameType type) {
        return new SteamIterator(this, type);
    }

    public List<Game> getGames() {
        return games;
    }
}
