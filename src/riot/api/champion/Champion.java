package riot.api.champion;

public class Champion {

    private boolean rankedPlayEnabled;
    private boolean botEnabled;
    private boolean botMmEnabled;
    private boolean active;
    private boolean freeToPlay;

    private long id;


    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public boolean isBotEnabled() {
        return botEnabled;
    }

    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    public long getID() {
        return id;
    }


}
