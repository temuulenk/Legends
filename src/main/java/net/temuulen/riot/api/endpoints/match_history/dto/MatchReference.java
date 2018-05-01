package main.java.net.temuulen.riot.api.endpoints.match_history.dto;

public class MatchReference {

    private String lane;
    private long gameId;
    private int champion;
    private String platformId;
    private int season;
    private int queue;
    private String role;
    private long timestamp;



    public String getLane() {
        return lane;
    }

    public long getGameId() {
        return gameId;
    }

    public int getChampion() {
        return champion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public int getSeason() {
        return season;
    }

    public int getQueue() {
        return queue;
    }

    public String getRole() {
        return role;
    }

    public long getTimestamp() {
        return timestamp;
    }



}
