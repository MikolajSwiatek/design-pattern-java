package IteratorPattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IteratorPatternTests {
    private List<Game> games;
    private Steam steam;
    private SteamIterator iterator;

    @Before
    public void setUp() {
        setGames();

        steam = new Steam(games);
        iterator = new SteamIterator(steam, GameType.RTS);
    }

    @Test
    public void checkArrayListSize() {
        int count = 0;

        while (iterator.hasNext()) {
            count++;
        }

        Assert.assertEquals(6, count);
    }

    @Test
    public void checkFirstResult() {
        Game game = games.get(0);

        iterator.hasNext();

        Assert.assertEquals(game, iterator.next());
    }

    @Test
    public void checkLastResult() {
        Game game = games.get(8);
        Game g = new Game();

        while (iterator.hasNext()) {
            g = iterator.next();
        }

        Assert.assertEquals(game, g);
    }


    @Test
    public void checkAllResults() {
        List<Game> g = new ArrayList<>();

        while (iterator.hasNext()) {
            g.add(iterator.next());
        }

        Assert.assertNotEquals(games, g);
    }

    @Test
    public void checkValueAfterCheckAll() {
        while (iterator.hasNext()) {}

        Assert.assertEquals(null, iterator.next());
    }

    private void setGames() {
        games = new ArrayList<>();
        games.add(new Game("g1", GameType.RTS));
        games.add(new Game("g2", GameType.RTS));
        games.add(new Game("g3", GameType.RTS));
        games.add(new Game("g4", GameType.RTS));
        games.add(new Game("g5", GameType.RTS));
        games.add(new Game("g6", GameType.RPG));
        games.add(new Game("g7", GameType.FTP));
        games.add(new Game("g8", GameType.FTP));
        games.add(new Game("g9", GameType.RTS));
    }
}
