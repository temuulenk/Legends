package main.java.net.temuulen.riot.api.endpoints.summoner.dto;

public class Summoner {

    private int profileIconId;
    private String name;
    private long summonerLevel;
    private long revisionDate;
    private long id;
    private long accountId;

    public Summoner(String name, long summonerLevel, long accountId, int profileIconId) {
    	this.name = name;
    	this.summonerLevel = summonerLevel;
    	this.accountId = accountId;
    	this.profileIconId = profileIconId;
    }


    public int getProfileIconID() {
        return profileIconId;
    }

    public String getName() {
        return name;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public long getID() {
        return id;
    }

    public long getAccountID() {
        return accountId;
    }

    public String toString() {
        return name;
    }

}
