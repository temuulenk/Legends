package main.java.net.temuulen.riot.api.endpoints.match_history.dto;

public class MatchList {

    private MatchReference[] matches;
    private int totalGames;
    private int startIndex;
    private int endIndex;

    public MatchReference[] getMatches() {
        return matches;
    }

}
