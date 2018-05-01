package main.java.net.temuulen.riot.constants.champion;

public class Champion {

    private String name;
    private String key;
    private long id;

    public Champion(String name, String key, long id) {
        this.name = name;
        this.key = key;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public String getKey() {
    	return key;
    }

    public long getId() {
        return id;
    }

}
