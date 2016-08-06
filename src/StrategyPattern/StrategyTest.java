package StrategyPattern;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class StrategyTest {

    @Test
    public void checkDateContractExpire() {
        Date now = new Date();
        List<Player> players = new ArrayList<>();
        players.add(new Player("A", 18 , now.getTime() - 10));
        players.add(new Player("B", 19, now.getTime() + 10));
        players.add(new Player("C", 19, now.getTime() + 20));

        PlayerValidator validator = new DateContractExpireValidate();
        Team normalTeam = new Team(validator, "Normal Team");
        Team freeTeam = new Team(validator, "Free team");

        for (Player p : players) {
            normalTeam.addPlayer(p, false);
            freeTeam.addPlayer(p, true);
        }

        assertEquals(normalTeam.getPlayers().size(), 2);
        assertEquals(freeTeam.getPlayers().size(), 1);
    }

    @Test
    public void checkAgee() {
        Date now = new Date();
        List<Player> players = new ArrayList<>();
        players.add(new Player("A", 17 , now.getTime() - 10));
        players.add(new Player("B", 19, now.getTime() + 10));
        players.add(new Player("C", 22, now.getTime() + 20));

        PlayerValidator validator = new AgeContractValueValidate();
        Team oldTeam = new Team(validator, "Old Team");
        Team ageTeam = new Team(validator, "Age team");

        for (Player p : players) {
            oldTeam.addPlayer(p, true);
            ageTeam.addPlayer(p, false);
        }

        assertEquals(oldTeam.getPlayers().size(), 2);
        assertEquals(ageTeam.getPlayers().size(), 1);
    }
}
