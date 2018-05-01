package main.java.net.temuulen.riot.constants;

public enum Platform {

    BR("BR1", "br"),
    EUNE("EUN1", "eune"),
    EUW("EUW1", "euw"),
    JP("JP1", "jp"),
    KR("KR", "kr"),
    LAN("LA1", "lan"),
    LAS("LA2", "las"),
    NA("NA1", "na"),
    OCE("OC1", "oce"),
    RU("RU", "ru"),
    TR("TR1", "tr");

    private String id;
    private String name;

    Platform(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHost() {
        return "https://" + id.toLowerCase() + ".api.riotgames.com";
    }

}
