package main.java.net.temuulen.riot.api.endpoints.matches.dto;

public class TeamStats {

    private boolean firstDragon;
    private boolean firstInhibitor;
    private TeamBans[] bans;
    private int baronKills;
    private boolean firstRiftHerald;
    private boolean firstBaron;
    private int riftHeraldKills;
    private boolean firstBlood;
    private int teamId;
    private boolean firstTower;
    private int vilemawKills;
    private int inhibitorKills;
    private int towerKills;
    private int dominionVictoryScore;
    private String win;
    private int dragonKills;


    public boolean isFirstDragon() {
        return firstDragon;
    }

    public boolean isFirstInhibitor() {
        return firstInhibitor;
    }

    public TeamBans[] getBans() {
        return bans;
    }

    public int getBaronKills() {
        return baronKills;
    }

    public boolean isFirstRiftHerald() {
        return firstRiftHerald;
    }

    public boolean isFirstBaron() {
        return firstBaron;
    }

    public int getRiftHeraldKills() {
        return riftHeraldKills;
    }

    public boolean isFirstBlood() {
        return firstBlood;
    }

    public int getTeamId() {
        return teamId;
    }

    public boolean isFirstTower() {
        return firstTower;
    }

    public int getVilemawKills() {
        return vilemawKills;
    }

    public int getInhibitorKills() {
        return inhibitorKills;
    }

    public int getTowerKills() {
        return towerKills;
    }

    public int getDominionVictoryScore() {
        return dominionVictoryScore;
    }

    public String getWin() {
        return win;
    }

    public int getDragonKills() {
        return dragonKills;
    }


}
