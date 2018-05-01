package main.java.net.temuulen.riot.api.endpoints.matches.dto;

public class Match {

    private int seasonId;
    private int queueId;
    private long gameId;
    private ParticipantIdentity[] participantIdentities;
    private String gameVersion;
    private String platformId;
    private String gameMode;
    private int mapId;
    private String gameType;
    private TeamStats[] teams;
    private Participant[] participants;
    private long gameDuration;
    private long gameCreation;


    public int getSeasonId() {
        return seasonId;
    }

    public int getQueueId() {
        return queueId;
    }

    public long getGameId() {
        return gameId;
    }

    public ParticipantIdentity[] getParticipantIdentities() {
        return participantIdentities;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public String getPlatformId() {
        return platformId;
    }

    public String getGameMode() {
        return gameMode;
    }

    public int getMapId() {
        return mapId;
    }

    public String getGameType() {
        return gameType;
    }

    public TeamStats[] getTeams() {
        return teams;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public long getGameDuration() {
        return gameDuration;
    }

    public long getGameCreation() {
        return gameCreation;
    }

}
