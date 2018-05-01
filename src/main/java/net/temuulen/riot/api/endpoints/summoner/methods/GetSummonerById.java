package main.java.net.temuulen.riot.api.endpoints.summoner.methods;

import main.java.net.temuulen.riot.api.ApiConfiguration;
import main.java.net.temuulen.riot.api.Method;
import main.java.net.temuulen.riot.api.endpoints.summoner.dto.Summoner;
import main.java.net.temuulen.riot.constants.Platform;

public class GetSummonerById extends Method {

    public GetSummonerById(Platform platform, ApiConfiguration apiConfiguration, long accountId) {
        super(platform.getHost() + "/lol/summoner/v3/summoners/by-account/" + accountId + "?api_key=" + apiConfiguration.getKey(), Summoner.class);
    }

}
