package main.java.net.temuulen.riot.api.endpoints.matches.methods;

import main.java.net.temuulen.riot.api.ApiConfiguration;
import main.java.net.temuulen.riot.api.Method;
import main.java.net.temuulen.riot.api.endpoints.matches.dto.Match;
import main.java.net.temuulen.riot.constants.Platform;

public class GetMatchById extends Method {

    public GetMatchById(Platform platform, ApiConfiguration apiConfiguration, long matchId) {
        super(platform.getHost() + "/lol/match/v3/matches/" + matchId + "?api_key=" + apiConfiguration.getKey(), Match.class);
    }

}
