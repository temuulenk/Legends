package main.java.net.temuulen.riot.api.endpoints.matches.dto;

public class Participant {

    private ParticipantStats stats;
    private int participantId;
//    private Rune[] runes;
    private ParticipantTimeline timeline;
    private int teamId;
    private int spell2Id;
//    private Mastery[] masteries;
    private String highestAchievedSeasonTier;
    private int spell1Id;
    private int championId;


    public ParticipantStats getStats() {
        return stats;
    }

    public int getParticipantId() {
        return participantId;
    }

//    public Rune[] getRunes() {
//        return runes;
//    }

    public ParticipantTimeline getTimeline() {
        return timeline;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getSpell2Id() {
        return spell2Id;
    }

//    public Mastery[] getMasteries() {
//        return masteries;
//    }

    public String getHighestAchievedSeasonTier() {
        return highestAchievedSeasonTier;
    }

    public int getSpell1Id() {
        return spell1Id;
    }

    public int getChampionId() {
        return championId;
    }

}
