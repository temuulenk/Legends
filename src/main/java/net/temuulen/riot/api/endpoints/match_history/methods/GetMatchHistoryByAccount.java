package main.java.net.temuulen.riot.api.endpoints.match_history.methods;

import main.java.net.temuulen.riot.api.ApiConfiguration;
import main.java.net.temuulen.riot.api.Method;
import main.java.net.temuulen.riot.api.endpoints.match_history.dto.MatchList;
import main.java.net.temuulen.riot.constants.Platform;

public class GetMatchHistoryByAccount extends Method {

    public GetMatchHistoryByAccount(Platform platform, ApiConfiguration apiConfiguration, long accountId) {
        super(platform.getHost() + "/lol/match/v3/matchlists/by-account/" + accountId + "?api_key=" + apiConfiguration.getKey(), MatchList.class);
    }

}
