package main.java.net.temuulen.riot.api.endpoints.summoner.methods;

import main.java.net.temuulen.riot.api.ApiConfiguration;
import main.java.net.temuulen.riot.api.Method;
import main.java.net.temuulen.riot.api.endpoints.summoner.dto.Summoner;
import main.java.net.temuulen.riot.constants.Platform;

public class GetSummonerByName extends Method {

    public GetSummonerByName(Platform platform, ApiConfiguration apiConfiguration, String name) {
        super(platform.getHost() + "/lol/summoner/v3/summoners/by-name/" + name + "?api_key=" + apiConfiguration.getKey(), Summoner.class);
    }

}
