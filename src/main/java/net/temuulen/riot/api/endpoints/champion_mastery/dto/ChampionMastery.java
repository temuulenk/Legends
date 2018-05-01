package main.java.net.temuulen.riot.api.endpoints.champion_mastery.dto;

public class ChampionMastery {

    public boolean chestGranted;
    public int championLevel;
    public int championPoints;
    public long championId;
    public long playerId;
    public long championPointsUntilNextLevel;
    public int tokensEarned;
    public long championPointsSinceLastLevel;
    public long lastPlayTime;


    public boolean isChestGranted() {
        return chestGranted;
    }

    public int getChampionLevel() {
        return championLevel;
    }

    public int getChampionPoints() {
        return championPoints;
    }

    public long getChampionId() {
        return championId;
    }

    public long getPlayerId() {
        return playerId;
    }

    public long getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public int getTokensEarned() {
        return tokensEarned;
    }

    public long getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public long getLastPlayTime() {
        return lastPlayTime;
    }

}
