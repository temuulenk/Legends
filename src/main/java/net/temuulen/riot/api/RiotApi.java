package main.java.net.temuulen.riot.api;

import java.io.IOException;

import main.java.net.temuulen.riot.api.endpoints.champion_mastery.dto.ChampionMastery;
import main.java.net.temuulen.riot.api.endpoints.champion_mastery.methods.GetChampionMasteryById;
import main.java.net.temuulen.riot.api.endpoints.match_history.dto.MatchList;
import main.java.net.temuulen.riot.api.endpoints.match_history.methods.GetMatchHistoryByAccount;
import main.java.net.temuulen.riot.api.endpoints.matches.dto.Match;
import main.java.net.temuulen.riot.api.endpoints.matches.methods.GetMatchById;
import main.java.net.temuulen.riot.api.endpoints.summoner.dto.Summoner;
import main.java.net.temuulen.riot.api.endpoints.summoner.methods.GetSummonerById;
import main.java.net.temuulen.riot.api.endpoints.summoner.methods.GetSummonerByName;
import main.java.net.temuulen.riot.constants.Platform;
import main.java.net.temuulen.riot.constants.champion.ChampionList;

public class RiotApi {

    private ApiConfiguration apiConfiguration;
    private ChampionList championList;

    public RiotApi(ApiConfiguration apiConfiguration) {
        this.apiConfiguration = apiConfiguration;

        championList = new ChampionList();


    }
    
    public ChampionList getChampionList() {
    	return championList;
    }
    
    // TODO: SUMMONER
    public Summoner getSummonerByName(Platform platform, String name) throws IOException {
        GetSummonerByName getSummonerByName = new GetSummonerByName(platform, apiConfiguration, name);
        return getSummonerByName.executeAndReturnDto();
    }

    public Summoner getSummonerById(Platform platform, long accountId) throws IOException {
        GetSummonerById getSummonerById = new GetSummonerById(platform, apiConfiguration, accountId);
        return getSummonerById.executeAndReturnDto();
    }


    // TODO: CHAMPION MASTERY
    public ChampionMastery[] getChampionMasteryById(Platform platform, long id) throws IOException {
        GetChampionMasteryById getChampionMasteryById = new GetChampionMasteryById(platform, apiConfiguration, id);
        return getChampionMasteryById.executeAndReturnDto();
    }


    // TODO: SUMMONER MATCH HISTORY
    public MatchList getSummonerMatchHistoryByAccount(Platform platform, long accountId) throws IOException {
        return new GetMatchHistoryByAccount(platform, apiConfiguration, accountId).executeAndReturnDto();
    }


    // TODO: SUMMONER MATCH INFORMATION
    public Match getMatchByMatchId(Platform platform, long matchId) throws IOException {
        return new GetMatchById(platform, apiConfiguration, matchId).executeAndReturnDto();
    }



    public static void main(String[] args) throws IOException {
        ApiConfiguration apiConfiguration = new ApiConfiguration("RGAPI-6902fbf2-2ae4-482b-b019-b504068e6f2e");
        RiotApi api = new RiotApi(apiConfiguration);
        
        
        
        
        
        
        
//
//        Match match = api.getMatchByMatchId(Platform.NA, 2770777839L);
//        System.out.println("SeasonId: " + match.getSeasonId());
//        System.out.println("QueueId: " + match.getQueueId());
//        System.out.println("GameId: " + match.getGameId());
//        System.out.println("GameVersion: " + match.getGameVersion());
//        System.out.println("PlatformId: " + match.getPlatformId());
//        System.out.println("GameMode: " + match.getGameMode());
//        System.out.println("MapId: " + match.getMapId());
//        System.out.println("GameType: " + match.getGameType());
//        System.out.println("GameDuration: " + match.getGameDuration());
//        System.out.println("GameCreation: " + match.getGameCreation());
//
//        System.out.println();
//        // TODO: ParticipantIdentity
//        ParticipantIdentity[] participantIdentities = match.getParticipantIdentities();
//        for(int i=0; i<participantIdentities.length; i++) {
//            System.out.println("ParticipantId: " + participantIdentities[i].getParticipantId());
//            Player player = participantIdentities[i].getPlayer();
//
//            System.out.println("CurrentPlatformId: " + player.getCurrentPlatformId());
//            System.out.println("SummonerName: " + player.getSummonerName());
//            System.out.println("MatchHistoryURI: " + player.getMatchHistoryUri());
//            System.out.println("PlatformId: " + player.getPlatformId());
//            System.out.println("CurrentAccountId: " + player.getCurrentAccountId());
//            System.out.println("ProfileIconId: " + player.getProfileIcon());
//            System.out.println("SummonerId: " + player.getSummonerId());
//            System.out.println("AccountId: " + player.getAccountId());
//            System.out.println("----------------------------------------------------");
//        }
//
//        System.out.println();
//
//        // TODO: TEAM STATS
//        TeamStats[] teams = match.getTeams();
//        for(int i=0; i<teams.length; i++) {
//            TeamStats teamStats = teams[i];
//            // TODO: TEAM BANS
//            System.out.println("--- TEAM BANS ---");
//            TeamBans[] bans = teamStats.getBans();
//            for(int j=0; j<bans.length; j++) {
//                System.out.println("PickTurn: " + bans[j].getPickTurn());
//                System.out.println("ChampionId: " + bans[j].getChampionId() + " (" + api.championList.getChampionName(bans[j].getChampionId()) + ")");
//            }
//            System.out.println("-----------------");
//            System.out.println("FirstDragon: " + teamStats.isFirstDragon());
//            System.out.println("FirstInhibitor: " + teamStats.isFirstInhibitor());
//            System.out.println("BaronKills: " + teamStats.getBaronKills());
//            System.out.println("FirstRiftHerald: " + teamStats.isFirstRiftHerald());
//            System.out.println("FirstBaron: " + teamStats.isFirstBaron());
//            System.out.println("RiftHeraldKills: " + teamStats.getRiftHeraldKills());
//            System.out.println("FirstBlood: " + teamStats.isFirstBlood());
//            System.out.println("TeamId: " + teamStats.getTeamId());
//            System.out.println("FirstTower: " + teamStats.isFirstTower());
//            System.out.println("VilemawKills: " + teamStats.getVilemawKills());
//            System.out.println("InhibitorKills: " + teamStats.getInhibitorKills());
//            System.out.println("TowerKills: " + teamStats.getTowerKills());
//            System.out.println("DominionVictoryScore: " + teamStats.getDominionVictoryScore());
//            System.out.println("Win: " + teamStats.getWin());
//            System.out.println("DragonKills: " + teamStats.getDragonKills());
//        }
//
//        System.out.println();
//
//        // TODO: PARTICIPANTS
//        Participant[] participants = match.getParticipants();
//
//        for(Participant participant : participants) {
//            System.out.println("ParticipantId: " + participant.getParticipantId());
//            System.out.println("TeamId: " + participant.getTeamId());
//            System.out.println("Spell1Id: " + participant.getSpell1Id());
//            System.out.println("Spell2Id: " + participant.getSpell2Id());
//            System.out.println("ChampionId: " + participant.getChampionId() + " (" + api.championList.getChampionName(participant.getChampionId()) + ")");
//            System.out.println("HighestAchievedSeasonTier: " + participant.getHighestAchievedSeasonTier());
//
//            // TODO: PARTICIPANT STATS
//            ParticipantStats stats = participant.getStats();
//            System.out.println("--- STATS ---");
//            System.out.println("PhysicalDamageDealt: " + stats.getPhysicalDamageDealt());
//            System.out.println("NeutralMinionsKilledTeamJungle: " + stats.getNeutralMinionsKilledTeamJungle());
//            System.out.println("MagicDamageDealt: " + stats.getMagicDamageDealt());
//            System.out.println("TotalPlayerScore: " + stats.getTotalPlayerScore());
//
//            System.out.println("Win: " + stats.isWin());
//            System.out.println("NeutralMinionsKilledEnemyJungle: " + stats.getNeutralMinionsKilledEnemyJungle());
//            System.out.println("AltarsCaptured: " + stats.getAltarsCaptured());
//            System.out.println("LargestCriticalStrike: " + stats.getLargestCriticalStrike());
//            System.out.println("TotalDamageDealt: " + stats.getTotalDamageDealt());
//            System.out.println("MagicDamageDealtToChampions: " + stats.getMagicDamageDealtToChampions());
//            System.out.println("VisionWardsBoughtInGame: " + stats.getVisionWardsBoughtInGame());
//            System.out.println("DamageDealtToObjectives: " + stats.getDamageDealtToObjectives());
//
//
//            System.out.println("TeamObjective: " + stats.getTeamObjective());
//            System.out.println("TotalTimeCrowdControlDealt: " + stats.getTotalTimeCrowdControlDealt());
//            System.out.println("LongestTimeSpentLiving: " + stats.getLongestTimeSpentLiving());
//            System.out.println("WardsKilled: " + stats.getWardsKilled());
//            System.out.println("FirstTowerAssist: " + stats.isFirstTowerAssist());
//            System.out.println("FirstTowerKill: " + stats.isFirstTowerKill());
//
//            // TODO: PARTICIPANT ITEMS
//            System.out.println("Item0: " + stats.getItem0());
//            System.out.println("Item1: " + stats.getItem1());
//            System.out.println("Item2: " + stats.getItem2());
//            System.out.println("Item3: " + stats.getItem3());
//            System.out.println("Item4: " + stats.getItem4());
//            System.out.println("Item5: " + stats.getItem5());
//            System.out.println("Item6: " + stats.getItem6());
//
//            // TODO: PARTICIPANT KILL STATISTICS
//            System.out.println("Kills: " + stats.getKills());
//            System.out.println("Deaths: " + stats.getDeaths());
//            System.out.println("Assists: " + stats.getAssists());
//
//            System.out.println("DoubleKills: " + stats.getDoubleKills());
//            System.out.println("TripleKills: " + stats.getTripleKills());
//            System.out.println("QuadraKills: " + stats.getQuadraKills());
//            System.out.println("PentaKills: " + stats.getPentaKills());
//
//            System.out.println("UnrealKills: " + stats.getUnrealKills());
//            System.out.println("LargestMultiKill: " + stats.getLargestMultiKill());
//            System.out.println("KillingSprees: " + stats.getKillingSprees());
//            System.out.println("LargestKillingSpree: " + stats.getLargestKillingSpree());
//
//            // TODO: OTHER RANDOM STATISTICS
//            System.out.println("TurretKills: " + stats.getTurretKills());
//            System.out.println("InhibitorKills: " + stats.getInhibitorKills());
//            System.out.println("NeutralMinionsKilled: " + stats.getNeutralMinionsKilled());
//
//
//            System.out.println("FirstBloodAssist: " + stats.isFirstBloodAssist());
//            System.out.println("VisionScore: " + stats.getVisionScore());
//            System.out.println("WardsPlaced: " + stats.getWardsPlaced());
//
//
//            System.out.println("DamageSelfMitigated: " + stats.getDamageSelfMitigated());
//            System.out.println("ChampLevel: " + stats.getChampLevel());
//            System.out.println("NodeNeutralizeAssist: " + stats.getNodeNeutralizeAssist());
//            System.out.println("FirstInhibitorKill: " + stats.isFirstInhibitorKill());
//            System.out.println("GoldEarned: " + stats.getGoldEarned());
//            System.out.println("MagicalDamageTaken: " + stats.getMagicalDamageTaken());
//
//            System.out.println("NodeCaptureAssist: " + stats.getNodeCaptureAssist());
//            System.out.println("TrueDamageTaken: " + stats.getTrueDamageTaken());
//            System.out.println("NodeNeutralize: " + stats.getNodeNeutralize());
//            System.out.println("FirstInhibitorAssist: " + stats.isFirstInhibitorAssist());
//
//
//
//            System.out.println("ObjectivePlayerScore: " + stats.getObjectivePlayerScore());
//            System.out.println("CombatPlayerScore: " + stats.getCombatPlayerScore());
//            System.out.println("DamageDealtToTurrets: " + stats.getDamageDealtToTurrets());
//            System.out.println("AltarsNeutralized: " + stats.getAltarsNeutralized());
//            System.out.println("PhysicalDamageDealtToChampions: " + stats.getPhysicalDamageDealtToChampions());
//            System.out.println("GoldSpent: " + stats.getGoldSpent());
//            System.out.println("TrueDamageDealt: " + stats.getTrueDamageDealt());
//            System.out.println("TrueDamageDealtToChampions: " + stats.getTrueDamageDealtToChampions());
//            System.out.println("ParticipantId: " + stats.getParticipantId());
//            System.out.println("TotalHeal: " + stats.getTotalHeal());
//            System.out.println("TotalMinionsKilled: " + stats.getTotalMinionsKilled());
//            System.out.println("FirstBloodKill: " + stats.isFirstBloodKill());
//            System.out.println("NodeCapture: " + stats.getNodeCapture());
//            System.out.println("SightWardsBoughtInGame: " + stats.getSightWardsBoughtInGame());
//            System.out.println("TotalDamageDealtToChampions: " + stats.getTotalDamageDealtToChampions());
//            System.out.println("TotalUnitsHealed: " + stats.getTotalUnitsHealed());
//            System.out.println("TotalScoreRank: " + stats.getTotalScoreRank());
//            System.out.println("TotalDamageTaken: " + stats.getTotalDamageTaken());
//
//
//            // TODO: RUNES   -- BROKEN / NOT SUPPORTED
//            // TODO: MASTERY -- BROKEN / NOT SUPPORTED
//
//            // TODO: PARTICIPANT TIMELINE
//            System.out.println("--- TIMELINE ---");
//            ParticipantTimeline participantTimeline = participant.getTimeline();
//
//
//
//        }







//        ChampionMastery[] test = api.getChampionMasteryById(Platform.NA, 24799759);
//        System.out.println(test);

//        Summoner summoner = api.getSummonerByName(Platform.NA, "Quantex");
//
//
//        MatchList matchList = api.getSummonerMatchHistoryByAccount(Platform.NA, summoner.getAccountID());
//
//        for(MatchReference matchReference : matchList.getMatches()) {
//            System.out.println(api.championList.getChampionName(matchReference.getChampion()));
//        }





//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter: ");
//        System.out.println("START");
//        while(input.hasNext()) {
////            System.out.println(input.nextLine());
//            String t = input.nextLine();
//            String[] tt = t.split("\\s+");
////            System.out.println(tt[3]);
//            System.out.printf("System.out.println(\"%s: \" + %s", tt[3].substring(0, 1).toUpperCase() + tt[3].substring(1, tt[3].length() - 1), "stats.get" + tt[3].substring(0, 1).toUpperCase() + tt[3].substring(1, tt[3].length() - 1) + "());\n");
//
//        }






//        String enter = input.nextLine();
//        System.out.println(enter);


//        ChampionList championList = new ChampionList();
//        championList.getChampionById(10);


//        Summoner summoner = api.getSummonerByName(Platform.NA, "Quantex");
//        System.out.println(summoner.getID());


//        URL url = new URL("https://na1.api.riotgames.com/lol/static-data/v3/champions?locale=en_US&dataById=true&api_key=RGAPI-6902fbf2-2ae4-482b-b019-b504068e6f2e");
////        URL url = new URL("https://na1.api.riotgames.com/lol/static-data/v3/champions?locale=en_US&champListData=tags&dataById=true&api_key=RGAPI-5a817766-9cbd-45ff-a24c-1e715248a23c");
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        ChampionList championList = new Gson().fromJson(new InputStreamReader(connection.getInputStream()), ChampionList.class);
//
//        System.out.println(championList);
//
//        Map<String, Champion> test = championList.getData();
//        Iterator it = test.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry pair = (Map.Entry)it.next();
////            System.out.println(pair.getKey() + " = " + ((Champion) pair.getValue()).getName());
////            System.out.println("list.add(" + new Champion(name, id) + ");");
//            System.out.println("champions.add(new Champion(\"" + ((Champion) pair.getValue()).getName() + "\", \"" + ((Champion) pair.getValue()).getKey() + "\", " + pair.getKey() + "));");
//            it.remove(); // avoids a ConcurrentModificationException
//        }

//        System.out.println(championList.getData().get("Aatrox").getId());





    }


}
