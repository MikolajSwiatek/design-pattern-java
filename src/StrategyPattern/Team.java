package StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    private PlayerValidator validator;

    public Team(PlayerValidator validator, String name) {
        this.validator = validator;
        this.name = name;
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player, boolean requireStatus) {
        if (validator.validate(player) == requireStatus) {
            players.add(player);
        }
    }
}
