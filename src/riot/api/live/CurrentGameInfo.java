package riot.api.live;

public class CurrentGameInfo {

    private long gameId;
    private long gameStartTime;
    private long gameLength;
    private long gameQueueConfigId;
    private long mapId;

    private String platformId;
    private String gameMode;
    private String gameType;

    private BannedChampion[] bannedChampions;
    private Observer observer;
    private CurrentGameParticipant[] participants;



    public BannedChampion[] getBannedChampions() {
        return bannedChampions;
    }


}
