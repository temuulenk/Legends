package main.java.net.temuulen.riot.api.endpoints.champion_mastery.methods;

import main.java.net.temuulen.riot.api.ApiConfiguration;
import main.java.net.temuulen.riot.api.Method;
import main.java.net.temuulen.riot.api.endpoints.champion_mastery.dto.ChampionMastery;
import main.java.net.temuulen.riot.constants.Platform;

public class GetChampionMasteryById extends Method {

    public GetChampionMasteryById(Platform platform, ApiConfiguration apiConfiguration, long summonerId) {
        super(platform.getHost() + "/lol/champion-mastery/v3/champion-masteries/by-summoner/" + summonerId + "?api_key=" + apiConfiguration.getKey(), ChampionMastery[].class);
    }

}
